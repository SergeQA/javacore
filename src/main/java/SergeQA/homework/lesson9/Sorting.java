package SergeQA.homework.lesson9;

import java.util.Arrays;
import java.util.Random;


public class Sorting {
     public static int [] massFilling () {
        int randNum = 0;
        int[] mass = new int[20];
        Random r = new Random();

        for (int i = 0; i < mass.length; i++) {
            randNum = r.nextInt(100);
            mass[i] = randNum;
        }

        String unsortedMass = Arrays.toString(mass);
        System.out.println("Unsorted array is: " + unsortedMass);

        return mass;
    }

    public static int [] massiveSortingAscending(int [] mass){
//        int mass[20] = new int[20];
        int temp;
        for (int i = 0; i<mass.length; i++){
            for (int j = 1; j < (mass.length - i); j++){
                if (mass[j-1]> mass[j]){
                    temp = mass[j-1];
                    mass[j-1] = mass[j];
                    mass[j] = temp;
                }
            }
        }

//        String sortedMass = Arrays.toString(mass);
//        System.out.println("Sorted array is: " + sortedMass);
        return mass;
    }

    public static int [] massiveSortingDescending(int [] mass){
        int temp;
        for (int i = 0; i < mass.length; i++){
            for (int j = 1; j < mass.length; j++){
                if (mass[j-1] < mass[j]){
                    temp = mass[j-1];
                    mass[j-1] = mass[j];
                    mass[j] = temp;
                }
            }
        }
    return mass;
    }

}
