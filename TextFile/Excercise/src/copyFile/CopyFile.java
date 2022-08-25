package copyFile;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

public class CopyFile {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap duong link file can copy: ");
        File f1 = new File(input.nextLine());

        System.out.println("Nhap luong ra");
        File f2 = new File(input.nextLine());

        try {
            if(!f1.exists()) {
                throw  new FileNotFoundException();
            }
            if (!f2.exists()) {
                throw new FileNotFoundException();
            }
            if (!f2.exists()) {
                throw new FileAlreadyExistsException(f2.toString());
            }
        } catch (FileNotFoundException e) {
            System.err.println("File khong ton tai!");
        } catch (FileAlreadyExistsException e) {
            System.err.println("File da ton tai");
        }

        FileReader fileReader = new FileReader(f1);
        BufferedReader reader = new BufferedReader(fileReader);
        FileWriter fileWriter = new FileWriter(f2,true);
        BufferedWriter writer= new BufferedWriter(fileWriter);

        String line = null;
        int sum =0;
        while ((line = reader.readLine()) != null) {

            writer.write("\n");
            writer.write(line);
            sum += line.length();
        }
        writer.close();
        System.out.println("Sao chép ok");
        System.out.println("ký tự đã copy:"+sum);
        }

    }

//E:\IntelliJ\week4\TextFile\Excercise\src\copyFile\file1
//E:\IntelliJ\week4\TextFile\Excercise\src\copyFile\file2