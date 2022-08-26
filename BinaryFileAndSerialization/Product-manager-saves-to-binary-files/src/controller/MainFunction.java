package controller;
import model.Product;
import model.ProductComparator;
import view.MainView;
import view.ProductView;

import java.io.IOException;
import java.util.*;


public class MainFunction {

    public void searchProductByName(List<Product> productList) throws IOException {
//Iterator trong Java là một interface được sử dụng để thay thế Enumerations trong Java Collection Framework. Bạn có thể sử dụng interator để:
    //Duyệt các phần tử từ đầu đến cuối của một collection.
    //Iterator cho phép xóa phần tử khi lặp một collection.

        Iterator<Product> iterator;
        String nameValue = MainView.enterNameForm();
        iterator = productList.iterator();
        while (iterator.hasNext()) {
            Product holder = iterator.next();
            //Phương thức equalsIgnoreCase() so sánh hai chuỗi đưa ra dựa trên nội dung của chuỗi không phân biệt chữ hoa và chữ thường.
            // Nếu hai chuỗi khác nhau nó trả về false.
            // Nếu hai chuỗi bằng nhau nó trả về true.
            if (holder.getName().equalsIgnoreCase(nameValue)) {
                ProductView productView = new ProductView();
                ProductManager productManager = new ProductManager(holder, productView);
                productManager.updateProductView();
            }
        }
    }
    public void searchProductByID(List<Product> productsList) throws IOException{
        int idValue;
        Iterator<Product> iterator;
        idValue = MainView.enterIDForm();
        iterator = productsList.iterator();
        while (iterator.hasNext()) {
            Product holder = iterator.next();
            if (holder.getId() == idValue) {
                ProductView productView = new ProductView();
                ProductManager productManager = new ProductManager(holder,productView);
                productManager.updateProductView();
            }
        }
    }
    public void deleteProductbyID(List<Product> productsList) throws IOException {
        int idValue;
        Iterator<Product> iterator;
        idValue = MainView.enterIDForm();
        iterator = productsList.iterator();
        while (iterator.hasNext()) {
            Product holder = iterator.next();
            if (holder.getId() == idValue) {
                productsList.remove(holder);
                break;
            }
        }
    }
    public void updateProductById(List<Product> productsList) throws IOException {
        int idValue;
        Iterator<Product> iterator;
        idValue = MainView.enterIDForm();
        iterator = productsList.iterator();
        while (iterator.hasNext()) {
            Product holder = iterator.next();
            if (holder.getId() == idValue) {
                MainView mainView = new MainView();
                productsList.set(productsList.indexOf(holder), mainView.createProductForm());
                break;
            }
        }
    }
    public void sortProductIncreasePrice(List<Product> productsList) {
        Comparator comparator = new ProductComparator();
        MainView mainView = new MainView();
        Object[] array = productsList.toArray();
        Arrays.sort(array,comparator);
        List<Product> productsSortedList = new ArrayList<Product>();
        for (Object item: array) {
            productsSortedList.add((Product) item);
        }
        mainView.displayAllProducts(productsSortedList);
    }

}
