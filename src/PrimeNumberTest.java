import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 2/23/17.
 */
public class PrimeNumberTest {
    @Test
    public void locatePrime() throws Exception {
        Assert.assertEquals("Prime", PrimeNumber.checkPrime(2));
    }
    @Test
    public void test3(){
        Assert.assertEquals("Prime", PrimeNumber.checkPrime(3));
    }
    @Test
    public void test5(){
        Assert.assertEquals("Prime", PrimeNumber.checkPrime(5));
    }
    @Test
    public void test109(){
        Assert.assertEquals("Prime", PrimeNumber.checkPrime(109));
    }
}