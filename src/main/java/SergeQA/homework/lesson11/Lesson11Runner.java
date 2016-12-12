package SergeQA.homework.lesson11;

import java.util.Scanner;

public class Lesson11Runner {
    public static void main (String [] args){
        System.out.println("If you wan to sort numbers, enter 1");
        System.out.println("If you want to separate letters from line,enter 2");
        System.out.println("If you want to split a phrase by keyword, enter 3");
        Scanner scan = new Scanner(System.in);
        int task = scan.nextInt();

        switch (task){
            case 1: ArrayParser.arrayParser();
            break;

            case 2: LettersParser.lettersParser();
            break;

            case 3: KeyWord.keyWord();
            break;

            default: System.out.println("ERROR! PLEASE ENTER CORRECT NUMBER!");
        }
    }
}
