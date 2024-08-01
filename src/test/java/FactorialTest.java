import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {


    Factorial factorial = new Factorial();

    @Test
    public void factorialTest(){
        int expected = 40320;
        int actual = factorial.getFactorial(8);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void factorialTest0(){
        int expected = 1;
        int actual = factorial.getFactorial(0);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void factorialTest1(){
        int expected = 1;
        int actual = factorial.getFactorial(1);
        Assert.assertEquals(expected,actual);
    }

}
