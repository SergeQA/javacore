package SergeQA.lesson9;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by user on 12/2/2016.
 */
public class BubbleSorting {
    public static void massiveSorting(){
        int randomNumber = 0;
        int [] mass = new int [10];
        Random rand = new Random();

        for (int i = 0; i<mass.length; i++) {
            randomNumber = rand.nextInt(100);
            mass[i] = randomNumber;
        }

        String massString = Arrays.toString(mass);
        System.out.println(massString);

            int n = mass.length;
            int temp;
            for (int i = 0; i < n; i++){
                for (int j = 1; j < (n-i); j++){
                    if (mass[j-1] > mass[j]){
                        temp = mass[j-1];
                        mass[j-1] = mass[j];
                        mass[j] = temp;
                    }
                }

            }

        String massiString = Arrays.toString(mass);
        System.out.println(massiString);

    }

    public static void massMethodSorting(){
        int randomNumber = 0;
        int [] mass = new int [10];
        Random rand = new Random();

        for (int i = 0; i<mass.length; i++) {
            randomNumber = rand.nextInt(100);
            mass[i] = randomNumber;
        }

//        String massString = Arrays.toString(mass);
        System.out.println("Unsorted array:\n" + Arrays.toString(mass) + "\n");

        Arrays.sort(mass);
        String massiString = Arrays.toString(mass);
        System.out.println("Sorted Array:\n" + "\"" + Arrays.toString(mass) + "\"");
    }
}
