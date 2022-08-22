package algorithmComplexity;

import java.util.Scanner;

public class AlgorithmComplexityTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Muon nhap chuoi gi? ");
        String inputString = sc.nextLine();

        int[] frequentChar = new int[255];                  //1
        for (int i = 0; i < inputString.length(); i++) {        //2inputString.length

            int ascii = (int) inputString.charAt(i);

            frequentChar[ascii] += 1;

        }
        for (int i = 0; i < frequentChar.length; i++) {
            System.out.println(frequentChar[i]);
        }

        int max = 0;
        char character = (char) 255;
        for (int i = 0; i < 255; i++) {
            if (frequentChar[i] > max) {
                max = frequentChar[i];
                character = (char) i;
            }
        }
        System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times");
    }

}
