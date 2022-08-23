package illustrationBubbleSort;

import java.util.Scanner;

public class IllustrationBubbleSort {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Muon nhap size nao? ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Nhap " +list.length + "gia tri: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("da nhap: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("\nBegin sort processing...");
        illustrationBubbleSort(list);
        
    }

    public static void illustrationBubbleSort(int[] list) {
        boolean needNextPass = true;
        for(int k = 1; k< list.length && needNextPass; k++){
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i+1]) {
                    System.out.println("Doi " + list[i] + " voi " +list[i+1]);
                    int temp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = temp;

                    needNextPass = true;
                }
            }

            if (needNextPass == false) {
            System.out.println("Mang khong can sap xep nua~");
                break;
            }
            System.out.print("List after the " + k + " sort: ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
            }
            System.out.println();
        }
        }



}
