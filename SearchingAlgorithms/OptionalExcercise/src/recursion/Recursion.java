package recursion;


import java.util.LinkedList;
import java.util.Scanner;

public class Recursion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Muon bao nhieu phan tu? ");
        int size = scanner.nextInt();

        LinkedList<Integer> arr = new LinkedList<>();
        int element;
        for (int i = 0; i < size; i++) {
            System.out.println("Phan tu thu " + i + ": ");
            element = scanner.nextInt();
            arr.add(element);
        }
//        System.out.println("Mang la: ");
//        for (int x: arr
//             ) {
//            System.out.print(x + "\t");
//        }

        arr.sort(((o1, o2) -> o1 - o2));
        System.out.println(arr);



        int result = binarySearch(arr, 0, size, 4);
        if (result == -1)
            System.out.println("Not found");
        else
            System.out.println("Element found at index " + result);

        System.out.println(result);
    }


    public static int binarySearch(LinkedList<Integer> array, int x, int low, int high) {

        if (high >= low) {
            int mid = low + (high - low) / 2;

            // If found at mid, then return it
            if (array.get(mid) == x)
                return mid;

            // Search the left half
            if (array.get(mid) > x)
                return binarySearch(array, x, low, mid - 1);

            // Search the right half
            return binarySearch(array, x, mid + 1, high);
        }

        return -1;
    }


}
