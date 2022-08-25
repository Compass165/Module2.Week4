package copyBinaryFIles;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyBinaryFiles {

   private static void copyFile(String sourcePath, String destinationPath) {
       InputStream inputStream = null;
       OutputStream outputStream = null;

       try {
           inputStream = new FileInputStream(sourcePath);
           outputStream = new FileOutputStream(destinationPath);

           long start = System.currentTimeMillis();

           byte[] bytes = new byte[1024];
           int length;
           while ((length = inputStream.read(bytes))>0) {
               outputStream.write(bytes, 0, length);
           }
           long end = System.currentTimeMillis();
           System.out.println("Copy doone in: " + (end - start) + "ms");
       } catch (Exception e) {
           e.printStackTrace();
       }
   }
    private static void readFile(String sourcePath) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(sourcePath);
            int bytes = 0;
            while ((bytes = fileInputStream.read())!= -1) {
                System.out.print((char)bytes);
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
    public static void main(String[] args) {
        copyFile("E:\\IntelliJ\\week4\\BinaryFileAndSerialization\\OptionalExcercise\\src\\copyBinaryFIles\\bigboiz.zip","E:\\IntelliJ\\week4\\BinaryFileAndSerialization\\OptionalExcercise\\src\\copyBinaryFIles\\copyOfbigboiz.zip");
    }



}
