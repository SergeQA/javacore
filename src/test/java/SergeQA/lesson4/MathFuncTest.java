package SergeQA.lesson4;

import SergeQA.lesson4.MathFunc;
import org.junit.Assert;
import org.junit.Test;


public class MathFuncTest {
    @Test
    public void multiplyTest(){
        int a = 5;
        int b = 2;
        int expRes = 10;
        Assert.assertEquals(expRes, MathFunc.multiply(a, b));
    }

}
