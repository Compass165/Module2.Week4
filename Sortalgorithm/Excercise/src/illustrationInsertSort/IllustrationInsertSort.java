package illustrationInsertSort;

import java.util.Scanner;

public class IllustrationInsertSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Muon dai bao nhieu? ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + "values: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]+"\t");
        }
        System.out.println("\nBegin sort processing...");
        insertionSortByStep(list);
    }
    public static void insertionSortByStep(int [] list) {
        for (int k = 0; k < list.length; k++) {

            int x = list[k];
            int pos = k;
            while (pos > 0 && list[pos] < list[pos-1]) {
                System.out.println("Swap " + list[pos] + " with " + list[pos-1]);
                int temp = list[pos-1];
                list[pos-1] = list[pos];
                list[pos] = temp;

                pos--;
            }
            list[pos] = x;


            System.out.println("List after the " + k + "sort: ") ;
            for (int i = 0; i < list.length; i++) {
                System.out.println(list[i]+"\t");
            }
            System.out.println();
        }
    }

}
