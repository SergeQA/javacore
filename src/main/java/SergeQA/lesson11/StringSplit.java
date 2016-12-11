package SergeQA.lesson11;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by user on 12/9/2016.
 */
public class StringSplit {
    public static void phraseSplit() {
        System.out.println("Please enter phrase");
        Scanner scan = new Scanner(System.in);
        String enteredString = scan.nextLine();
        String[] splittedArray = enteredString.split(" ");

        int[] intArray = new int[splittedArray.length];

        for (int i = 0; i < splittedArray.length; i++) {
            System.out.print(splittedArray[i] + " ");
        }

//        System.out.println(Arrays.toString(splittedArray));

    }

    public static void strBuilder() {
        StringBuilder builder = new StringBuilder("innamoramento");
        int startInclusive = 4;
        int endExclusive = 10;
        builder.delete(startInclusive, endExclusive);
        System.out.print(builder.toString());
    }

    public static void charsToString() {
        System.out.println("Please enter phrase");
        Scanner scanStr = new Scanner(System.in);
        String entString = scanStr.nextLine();

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < entString.length(); i++) {
            builder.insert(i, entString.charAt(i));
        }
        System.out.println(builder.toString());
    }

    //    String strToEncode = "acbfedghi";
    public static String strEncode(String strToEncode) {
//        String strToEncode = "acbfedghi";
        String plainText = "abcdefghi";
        String cypherText = "123456789";
        StringBuilder strBuilder = new StringBuilder();
        String endcodedString = "";

        for (int i = 0; i < strBuilder.length(); i++) {
            for (int j = 0; j < plainText.length(); j++) {
                if (strBuilder.charAt(i) == plainText.charAt(j)) {
                    strBuilder.setCharAt(i, cypherText.charAt(j));
                    break;
                }

            }


        }
        return strBuilder.toString();


    }
}