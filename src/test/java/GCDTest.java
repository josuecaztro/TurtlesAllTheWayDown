import org.junit.Assert;
import org.junit.Test;

public class GCDTest {


    GCD gcd = new GCD();

    @Test
    public void gcdTest(){
        int expected = 250;
        int actual = gcd.getGcd(250,1000);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void gcdTest1(){
        int expected = 1;
        int actual = gcd.getGcd(487,123);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void anotherGcdTest(){
        int expected = 12;
        int actual = gcd.getGcd(84,96);
        Assert.assertEquals(expected,actual);
    }



}
