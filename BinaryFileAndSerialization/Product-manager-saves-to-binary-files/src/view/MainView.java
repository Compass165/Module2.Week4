package view;
import model.Product;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

}
