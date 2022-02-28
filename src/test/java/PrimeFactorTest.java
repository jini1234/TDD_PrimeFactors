import org.junit.Assert;
import org.junit.Test;

public class PrimeFactorTest {
    @Test
    public void PrimeFactorFor1(){
        PrimeFactor pf = new PrimeFactor();
        Assert.assertEquals(0, pf.ComputeFactors(1));
    }
}