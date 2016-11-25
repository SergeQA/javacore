package SergeQA.Homework.lesson4;

import SergeQA.homework.lesson4.Main;
import org.junit.Assert;
import org.junit.Test;


public class MainTest {

    @Test
    public void addNumeralsTest(){
        int a = 8;
        int b = 6;
        int expRes = 14;
        Assert.assertEquals(expRes, Main.addNumerals (a, b));
    }

    @Test
    public void subtractNumeralsTest(){
        int c = 18;
        int d = 5;
        int expRes = 13;
        Assert.assertEquals(expRes, Main.subtractNumerals (c, d));
    }

    @Test
    public void mutiplyNumeralsTest(){
        double e = 15;
        double f = 1.5;
        double expRes = 22.5;
        Assert.assertEquals(expRes, Main.multiplyNumerals(e, f));
    }

    @Test
    public void divideNumeralsTest(){
        double g = 23;
        double h = 2;
        double expRes = 11.5;
        Assert.assertEquals(expRes, Main.divideNumerals(g, h));
    }

    @Test
    public void degreeNumeralsTest(){
        double i = 2;
        double j = 4;
        double expRes = 16;
        Assert.assertEquals(expRes, Main.degreeNumerals(i, j));
    }

    @Test
    public void squareNumeralsTest(){
        int k = 25;
        int expRes = 625;
        Assert.assertEquals(expRes, Main.squareNumerals(k));
    }

    @Test
    public void rootNumeralsTest(){
        int l = 1156;
        int expRes = 34;
        Assert.assertEquals(expRes, Main.rootNumerals(l));
    }

    @Test
    public void nRootNumeralsTest(){
        int m = 625;
        int n = 4;
        int o = 5;
//        int expRes == int o;
        Assert.assertEquals(o, Main.nRootNumerals(m, n));
    }

}
