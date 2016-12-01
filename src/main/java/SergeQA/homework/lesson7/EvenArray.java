package SergeQA.homework.lesson7;


public class EvenArray {
    public static void evenArrayLine(){
        int count = 0;
        int [] a = new int [10];
//        a[0] = 2;

//        System.out.print(a[0] + " ");

        for (int i = 2; i<=20; i+=2) {
//            a[i] = a[i-1] += 2;
            count++;
            System.out.print(i + " ");
        }
    }

    public static void evenArrayColumn(){
        int count = 0;
        int [] b = new int [10];
//        a[0] = 2;

//        System.out.println(a[0]);

        for (int i = 2; i<=20; i+=2) {
//            a[i] = a[i-1] += 2;
            count++;
            System.out.println(i+ " ");
        }
    }
}
