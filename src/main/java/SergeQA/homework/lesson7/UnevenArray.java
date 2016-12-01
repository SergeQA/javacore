package SergeQA.homework.lesson7;

/**
 * Created by user on 12/2/2016.
 */
public class UnevenArray {
    public static void unevenArrayIncreasing(){
        int count = 0;
        int [] c = new int [50];

        for (int i = 1; i <=99; i+=2){
            count ++;
            System.out.print(i + " ");
        }
    }

    public static void unevenArrayDecreasing(){
        int count = 0;
        int [] d = new int [50];

        for (int i = 99; i >=1; i-=2){
            count++;
            System.out.print(i + " ");
        }
    }
}
