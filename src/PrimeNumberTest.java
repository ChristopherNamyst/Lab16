import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 2/23/17.
 */
public class PrimeNumberTest {
    @Test
    public void test1() throws Exception {
        Assert.assertEquals(2, PrimeNumber.checkPrime(1));
    }
    @Test
    public void test3(){
        Assert.assertEquals(3, PrimeNumber.checkPrime(2));
    }
    @Test
    public void test5(){
        Assert.assertEquals(5, PrimeNumber.checkPrime(3));
    }
    @Test
    public void test109(){
        Assert.assertEquals(19, PrimeNumber.checkPrime(8));
    }
}