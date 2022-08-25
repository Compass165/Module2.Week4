package rawfiles;
import model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class RAWFiles {

    public void writeToFile(List<?> productsList, String path) throws IOException {
        ObjectOutputStream objectOutputStream = null;

        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(path));

            for (Object product : productsList) {
                objectOutputStream.writeObject(product);
            }
            objectOutputStream.flush();
            System.out.println("Save Successful!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error!");
        } finally {
            objectOutputStream.close();
        }
    }

    public List<Product> readFromFile(String path) throws IOException {
        ObjectInputStream objectInputStream = null;
        List<Product> productList = new ArrayList<>();

        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            objectInputStream = new ObjectInputStream(fileInputStream);
            productList = (List<Product>) objectInputStream.readObject();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error!");
        } finally {
            objectInputStream.close();
        }
        return productList;
    }

}
