package SergeQA.homework.lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("If you want to compare circles area, enter 1");
        System.out.println("If you want to know if three numbers can be the sides of right-angled triangle, enter 2");
        System.out.println("If you want to know what number is bigger, enter 3");
        System.out.println("If you want to know whether number is even or odd, enter 4");
        int aa = scan.nextInt();

        if (aa == 1){
            System.out.println("Please enter raduis for Circle 1");
            double rad1 = scan.nextDouble();
            System.out.println("PLease enter raduis for Circle 2");
            double rad2 = scan.nextDouble();
            CompareArea comp = new CompareArea();
            comp.compareArea(rad1, rad2);
        } else if (aa == 2){
            System.out.println("Please enter first digit");
            int side1 = scan.nextInt();
            System.out.println("Please enter second digit");
            int side2 = scan.nextInt();
            System.out.println("Please enter third digit");
            int side3 = scan.nextInt();
            RightAngledTriangle triangle = new RightAngledTriangle();
            triangle.rightTriangle(side1, side2, side3);
        } else if (aa == 3){
            System.out.println("Please enter first number");
            double c = scan.nextDouble();
            System.out.println("PLease enter second number");
            double d = scan.nextDouble();
            WhatIsBigger number = new WhatIsBigger();
            number.whatBigger(c, d);
        } else if (aa == 4){
            System.out.println("Please enter a numeral");
            int a = scan.nextInt();
            EvenOrOdd digit = new EvenOrOdd();
            digit.evenOdd(a);
        }

        else {
            System.out.println("ERROR!");
        }


    }
}
