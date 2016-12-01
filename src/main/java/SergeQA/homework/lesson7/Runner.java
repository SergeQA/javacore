package SergeQA.homework.lesson7;

import java.util.Scanner;

import static SergeQA.homework.lesson7.EvenArray.evenArrayColumn;
import static SergeQA.homework.lesson7.EvenArray.evenArrayLine;
import static SergeQA.homework.lesson7.UnevenArray.unevenArrayDecreasing;
import static SergeQA.homework.lesson7.UnevenArray.unevenArrayIncreasing;

public class Runner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("To print array of even numbers from 2 to 20 in line press 1");
        System.out.println("To print array of even numbers from 2 to 20 in column press 2");
        System.out.println("To print array of uneven numbers from 1 to 99 in increasing order press 3");
        System.out.println("To print array of uneven numers from 99 to 1 in decreasing order press 4");

        int a = scan.nextInt();

        if (a == 1){
            evenArrayLine();
        } else if (a == 2){
            evenArrayColumn();
        } else if (a == 3){
            unevenArrayIncreasing();
        } else if (a == 4){
            unevenArrayDecreasing();
        }



    }




}

