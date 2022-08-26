package view;
import model.Product;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;

public class MainView {

    public Product createProductForm() throws NumberFormatException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(">>>>>>>>ADD NEW PRODUCT<<<<<<<<<");
        System.out.print("1. Enter product id: ");
        int id = Integer.parseInt(bufferedReader.readLine());
        System.out.print("1. Enter product name: ");
        String name = bufferedReader.readLine();
        System.out.print("1. Enter product manufacturer: ");
        String manufacturer = bufferedReader.readLine();
        System.out.print("1. Enter product price: ");
        int price = Integer.parseInt(bufferedReader.readLine());
        System.out.print("1. Enter product information: ");
        String information = bufferedReader.readLine();

        Product newproduct = new Product(id, name, manufacturer, price, information);
        return newproduct;

        //https://github.com/PhamTrung1993/Module2/tree/master/BaiTap/iobinaryfileserialization/product-manager-saves-to-binary-files/src

    }

    public int mainMenu() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int option;
        System.out.println("============== MAIN MENU =============");
        System.out.println("1. Display products");
        System.out.println("2. Add new product");
        System.out.println("3. Edit product by ID");
        System.out.println("4. Delete product by ID");
        System.out.println("5. Search product by ID");
        System.out.println("6. Search product by Name");
        System.out.println("7. Display product sort by Price");
        System.out.println("8. Load products from database");
        System.out.println("9. Save products to database");
        System.out.println(" .....................................");
        System.out.println("0. Quit");
        System.out.println("Enter option: ");
        option = Integer.parseInt(bufferedReader.readLine());
        return option;
    }
    public void displayAllProducts(List<Product> productList) {
        System.out.println("################ DISPLAY ALL PRODUCT ################");
        System.out.printf("%-5s%-20s%-20s%-10s%-30s\n", "id", "name", "manufacturer", "price", "information");
        Iterator<Product> iterator = productList.iterator();
        while (iterator.hasNext()) {
            Product holder = iterator.next();
            System.out.printf("%-5s%-20s%-20s%-10s%-30s\n",holder.getId(),holder.getName(),holder.getManufacturer(),
                    holder.getPrice(),holder.getInformation());
        }
        System.out.println("..................................................................");
    }
    public static String enterNameForm() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String value;
        System.out.println("--------------- ENTER NAME FORM -----------------");
        System.out.print("Enter product name: ");
        value = bufferedReader.readLine();
        return value;
    }
    public static int enterIDForm() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int value;
        System.out.println("--------------- ENTER ID FORM -----------------");
        System.out.print("Enter product ID: ");
        value = Integer.parseInt(bufferedReader.readLine());
        return value;
    }

}
