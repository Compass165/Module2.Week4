package insertSort;

public class InsertSort {

    public static void insertSort(int[] array) {
        int pos, x;
        for (int i = 0; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (pos > 0 && x< array[pos-1]) {
                array[pos] = array[pos-1];
                pos--;
            }
            array[pos] = x;
        }
    }

    public static void main(String[] args) {
        int[] array = {2,5,6,7,3,5,6,4,5,6,7,4,3,4,5};
        insertSort(array);
        for (int x: array
             ) {
            System.out.println(x);
        }
    }

}
