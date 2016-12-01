package SergeQA.lesson7;

import java.util.Arrays;

public class Main {
    public static void main (String [] args){

/*        if (i < 10){
            do{
                i = i*i;
            }
            while (i < 100){
                //do something
            }
        }
*/
//    Note note = new Note;
//    counting();
//    forrever();
//    preincrement();
//    howManyEven();
    massivePrint();
//    eachElementPrint();
//    eachPrintELement();

    }

    public static void counting(){
        int a = 6;
        int b = 2;
        while (a > b){
            System.out.println(a + " " + b);
            a--;
        }
        System.out.println(a + " " + b);
    }

    public static void forrever(){
        for (int i = 0; i <= 10; i++){
            System.out.print(i + " ");
        }
    }

    public static void preincrement(){
        int a = 1;
        System.out.println("Original a value " + a);
        System.out.println("Post-increment a " + a++);
        System.out.println("After post-increment " + a);
        System.out.println("Pre-increment a " + ++a);
        System.out.println("After pre-increment" + a);
    }

    public static void howManyEven(){
        int count = 0;
        for (int i = 0; i <=20; i+=2){
            count++;
        }
        System.out.println(count);
    }

//method to print all the numerals in array
    public static void massivePrint(){
        int [] intArray = {1, 2, 3};
        for (int i = 0; i<intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }

//method to iterate all elements in array

    public static void eachElementPrint(){
        int [] intArray = {1, 2, 3};
        for (int arrElement : intArray){
            System.out.println(arrElement);
        }
    }

    public static void eachPrintELement(){
        int [] intArray = {1, 2, 3};
        System.out.println(Arrays.toString(intArray));
    }



}
