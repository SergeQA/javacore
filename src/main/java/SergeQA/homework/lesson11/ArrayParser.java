package SergeQA.homework.lesson11;

import java.util.Arrays;
import java.util.Scanner;


public class ArrayParser {
    public static void arrayParser(){
        System.out.println("Please enter a few digits and ; between them");
        Scanner scan = new Scanner(System.in);
        String enteredDigits = scan.nextLine();
        String [] splittedDigits = enteredDigits.split(";");

        int [] intDigits = new int[splittedDigits.length];
        for (int i = 0; i < splittedDigits.length; i++){
            intDigits[i] = Integer.valueOf(splittedDigits[i]);
        }

//        System.out.println(Arrays.toString(intDigits));
        System.out.println("Please choose sorting direction: enter 1 for ascending or 2 for descending");
        int choose = scan.nextInt();

        if (choose == 1){
            for (int j = 0; j < intDigits.length; j++){
                for (int k = 1; k < intDigits.length; k++){
                    if (intDigits[k-1] > intDigits[k]){
                        int temp;
                        temp = intDigits[k-1];
                        intDigits[k-1] = intDigits[k];
                        intDigits[k] = temp;
                    }
                }
            }

        System.out.println("Sorted array is: " + Arrays.toString(intDigits));
        }

        if (choose == 2){
            for (int j = 0; j < intDigits.length; j++){
                for (int k = 1; k < intDigits.length; k++){
                    if (intDigits[k-1] < intDigits[k]){
                        int temp;
                        temp = intDigits[k-1];
                        intDigits[k-1] = intDigits[k];
                        intDigits[k] = temp;
                    }
                }
            }

        System.out.println("Sorted array is: " + Arrays.toString(intDigits));
        }
    }


}
