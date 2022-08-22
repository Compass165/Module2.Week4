package maxinarray;

import java.util.LinkedList;
import java.util.Scanner;

public class FindMaxInArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

        System.out.println("Muon nhap chuoi gi? ");
        String string = input.nextLine();

        //Tim chuoi lien tiep co do dai lon nhat
        for (int i = 0; i < string.length(); i++) { //1vong lap
            if (list.size() > 1 && string.charAt(i) <= list.getLast() &&
                    list.contains(string.charAt(i))) {
                list.clear(); //1cau dieu kien
            }

            list.add(string.charAt(i)); // 1 cau lenh

            if (list.size() > max.size()) {//1 cau lenh

                max.clear();
                max.addAll(list);

            }

        }
        //Hien thi chuoi lien tiep dai nhat
        for (Character ch: max) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
