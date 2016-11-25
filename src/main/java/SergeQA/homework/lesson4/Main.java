package SergeQA.homework.lesson4;


public class Main {
    public static void main (String[] args){

    }

    public static int addNumerals (int a, int b){
        return a + b;
    }

    public static int subtractNumerals (int c, int d){
        return c - d;
    }

    public static double multiplyNumerals (double e, double f){
        return e * f;
    }

    public static double divideNumerals (double g, double h){
        return g / h;
    }

    public static double degreeNumerals (double i, double j){
        return Math.pow(i, j);
    }

    public static int squareNumerals (int k){
        return k*k;
    }

    public static double rootNumerals (int l){
        return Math.sqrt(l);
    }

    public static double nRootNumerals (double m, double n){
        double o = Math.pow(m, (1/n));
        return o;
    }

}
