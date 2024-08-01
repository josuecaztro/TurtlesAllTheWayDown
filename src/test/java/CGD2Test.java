import org.junit.Assert;
import org.junit.Test;

public class CGD2Test {


    GCD2 gcd2 = new GCD2();

    @Test
    public void gcd2Test(){
        int expected = 250;
        int actual = gcd2.getGcd2(250,1000);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void gcd2Test1(){
        int expected = 1;
        int actual = gcd2.getGcd2(188,17);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void anotherGcd2Test(){
        int expected = 2;
        int actual = gcd2.getGcd2(74,82);
        Assert.assertEquals(expected,actual);
    }



}
