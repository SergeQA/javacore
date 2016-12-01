package SergeQA.homework.lesson7;


public class EvenArray {
    public static void evenArrayLine(){
        int [] a = new int [10];
        a[0] = 2;

        System.out.print(a[0] + " ");

        for (int i = 1; i<=9; i++) {
            a[i] = a[i-1] += 2;
            System.out.print(a[i]+ " ");
        }
    }

    public static void evenArrayColumn(){
        int [] a = new int [10];
        a[0] = 2;

        System.out.println(a[0]);

        for (int i = 1; i<=9; i++) {
            a[i] = a[i-1] += 2;
            System.out.println(a[i]+ " ");
        }
    }
}
