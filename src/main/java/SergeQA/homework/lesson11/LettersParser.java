package SergeQA.homework.lesson11;

import java.util.Scanner;

/**
 * Created by user on 12/12/2016.
 */
public class LettersParser {
    public static void lettersParser(){
        System.out.println("Please enter some symbols and separate them with ';' symbol");
        Scanner scan = new Scanner(System.in);
        String enteredSymbols = scan.nextLine();

//        String [] splittedArray = enteredSymbols.split(";");

        char [] charArray = enteredSymbols.toCharArray();

        for (int i = 0; i < charArray.length; i++){
            char a = charArray[i];
            boolean b = Character.isLetter(a);
            StringBuilder builder = new StringBuilder();
            if (b == true){
                builder = builder.append(a);
            }
            System.out.print(builder.toString());
        }

    }
}
