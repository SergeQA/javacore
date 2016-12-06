package SergeQA.homework.lesson9;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by user on 12/6/2016.
 */
public class SelectionSort {
    public static void selectionSortMethod(){
        int randomNum = 0;
        int [] massive = new int [20];
        Random rand = new Random();

        for (int i = 0; i < massive.length; i++){
            randomNum = rand.nextInt(100);
            massive[i] = randomNum;
        }

        String unsortMassive = Arrays.toString(massive);
        System.out.println("Unsorted array is: " + unsortMassive);

        for (int i = 0; i < massive.length; i++){
            int index = i;
            for (int j = i+1; j < massive.length; j++){
                if (massive[j] < massive[index]){
                    index = j;
                }
            }
            int smallerNumber = massive[index];
            massive[index] = massive[i];
            massive[i] = smallerNumber;
        }

        String sortMassive = Arrays.toString(massive);
        System.out.println("Sorted array is: " + sortMassive);

    }
}
