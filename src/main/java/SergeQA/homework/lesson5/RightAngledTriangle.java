package SergeQA.homework.lesson5;

public class RightAngledTriangle {
    public int rightTriangle(int side1, int side2, int side3){
//        Scanner scan1 = new Scanner(System.in);
//        System.out.println("Please enter first digit");
//        int side1 = scan1.nextInt();

//        Scanner scan2 = new Scanner(System.in);
//        System.out.println("Please enter second digit");
//        int side2 = scan2.nextInt();

//        Scanner scan3 = new Scanner(System.in);
//        System.out.println("Please enter third digit");
//        int side3 = scan3.nextInt();

        if ((side1*side1 + side2*side2) == side3*side3){
            System.out.println("These 3 digits could be the sides of right-angled triangle");
        } else if ((side2*side2 + side3*side3) == side1*side1){
            System.out.println("These 3 digits could be the sides of right-angled triangle");
        } else if ((side1*side1 + side3*side3) == side2*side2){
            System.out.println("These 3 digits could be the sides of right-angled triangle");
        }
        else{
            System.out.println("These 3 digits can not be the sides of right-angled triangle");
        }
        return side1;

    }
}
