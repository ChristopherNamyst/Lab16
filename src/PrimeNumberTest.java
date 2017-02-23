import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 2/23/17.
 */
public class PrimeNumberTest {
    @Test
    public void locatePrime() throws Exception {
        Assert.assertEquals("This is the first prime number", PrimeNumber.locatePrime(2));
    }

}