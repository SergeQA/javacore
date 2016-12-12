package SergeQA.homework.lesson11;

import java.util.Scanner;

/**
 * Created by user on 12/12/2016.
 */
public class KeyWord {
    public static void keyWord(){
        System.out.println("Please enter phrase");
        Scanner scan = new Scanner(System.in);
        String enteredPhrase = scan.nextLine();
        System.out.println("Please enter keyword from this phrase");
        String keyWord = scan.nextLine();

        if (enteredPhrase.indexOf(keyWord) != -1) {

            int a = enteredPhrase.indexOf(keyWord);

            char[] charArray1 = keyWord.toCharArray();
            int b = charArray1.length;

            char[] charArray2 = enteredPhrase.toCharArray();

            StringBuilder builder = new StringBuilder(enteredPhrase);
            builder.delete(a, charArray2.length);
            System.out.println(builder.toString());

            int c = a + b + 1;
            String result2 = enteredPhrase.substring(c);
            System.out.println(result2);
        }

        else {
            System.out.println(enteredPhrase);
        }
    }
}
