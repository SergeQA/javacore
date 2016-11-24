package SergeQA.homework.lesson5;

public class CompareArea {
    public static final float PI = 3.14f;

    public double compareArea(double rad1, double rad2){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter radius for Circle 1");
//        double rad1 = scanner.nextDouble();
        double ar1 = PI*rad1*rad1;
        System.out.println("Circle 1 area is " + ar1);
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Please enter radius for Circle 2");
//        double rad2 = scanner.nextDouble();
        double ar2 = PI*rad2*rad2;
        System.out.println("Circle 2 area is " + ar2);

        if (ar1 > ar2){
            System.out.println("Circle 1 area is bigger");
        } else if (ar1 == ar2){
//            return "Circle 1 and Circle 2 areas are equal";
            System.out.println("Circle 1 and Circle 2 areas are equal");
        }
        else {
            System.out.println("Circle 2 area is bigger");
        }
        return ar1;

    }
}
