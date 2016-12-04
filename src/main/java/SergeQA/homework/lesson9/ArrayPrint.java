package SergeQA.homework.lesson9;

import java.util.Arrays;
import SergeQA.homework.lesson9.Sorting;

public class ArrayPrint {
    public static int [] arrayUnsortedPrint(int [] mass){
        String massString = Arrays.toString(mass);
        System.out.println("Our array is: " + massString);
        return mass;
    }

}
