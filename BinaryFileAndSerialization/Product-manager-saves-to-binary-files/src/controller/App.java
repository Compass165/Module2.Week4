package controller;

import model.Product;
import rawfiles.RAWFiles;
import view.MainView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
    private static final int SAVE_DATA_CODE = 9;
    private static final int LOAD_DATA_CODE = 8;
    private static final int SORTING_BY_PRICE_CODE = 7;
    private static final int SEARCH_BY_NAME_CODE = 6;
    private static final int SEARCH_BY_ID_CODE = 5;
    private static final int DELETE_BY_ID_CODE = 4;
    private static final int EDIT_BY_ID_CODE = 3;
    private static final int ADD_PRODUCT_CODE = 2;
    private static final int DISPLAY_ALL_CODE = 1;
    private static final String INVALID_OPTION_STRING = "Invalid Option";
    private static final String DATA_FILE_PATH = "D:\\Code_gym\\Module2\\BaiTap\\iobinaryfileserialization\\product-manager-saves-to-binary-files\\files\\product.txt";
    private static final int EXIT_CODE = 0;
    private static final int INIT_VALUE = -1;

    private static List<Product> initData() {
        List<Product> productsList = new ArrayList<>();

        Product product1 = new Product(1,"Iphone 13 proMax","Apple", 999,"Smartphone");
        Product product2 = new Product(2,"Iphone 13 pro","Apple", 799,"Smartphone");
        Product product3 = new Product(3,"Iphone 13 ","Apple", 599,"Smartphone");
        Product product4 = new Product(4,"Samsung s23 plus","Samsung", 699,"Smartphone");
        Product product5 = new Product(5,"Samsung s23 Ultra","Samsung", 799,"Smartphone");
        Product product6 = new Product(6,"Oppo z8","Oppo", 499,"Smartphone");

        productsList.add(product1);
        productsList.add(product2);
        productsList.add(product3);
        productsList.add(product4);
        productsList.add(product5);
        productsList.add(product6);

        return productsList;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        MainView mainView = new MainView();
        MainFunction mainFunction = new MainFunction();
        RAWFiles rawFiles = new RAWFiles();
        List<Product> productsList = initData();
        int option = INIT_VALUE;

        while (option != EXIT_CODE) {
            option = mainView.mainMenu();
            switch (option) {
                case EXIT_CODE :
                    System.exit(EXIT_CODE);
                    break;
                case DISPLAY_ALL_CODE:
                    mainView.displayAllProducts(productsList);
                    break;
                case ADD_PRODUCT_CODE:
                    productsList.add(mainView.createProductForm());
                    break;
                case EDIT_BY_ID_CODE:
                    mainFunction.updateProductById(productsList);
                    break;
                case DELETE_BY_ID_CODE:
                    mainFunction.deleteProductbyID(productsList);
                    break;
                case SEARCH_BY_ID_CODE:
                    mainFunction.searchProductByID(productsList);
                    break;
                case SEARCH_BY_NAME_CODE:
                    mainFunction.searchProductByName(productsList);
                    break;
                case SORTING_BY_PRICE_CODE:
                    mainFunction.sortProductIncreasePrice(productsList);
                    break;
                case LOAD_DATA_CODE:
                    List<Product> raw = rawFiles.readFromFile(DATA_FILE_PATH);
                    for (Product product: raw) {
                        System.out.println(product);
                    }
                    break;
                case SAVE_DATA_CODE:
                    rawFiles.writeToFile(productsList,DATA_FILE_PATH);
                    break;
                default:
                    System.out.println(INVALID_OPTION_STRING);
            }
        }
    }
}