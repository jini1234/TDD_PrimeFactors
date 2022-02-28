import org.junit.Assert;
import org.junit.Test;

public class PrimeFactorTest {
    @Test
    public void PrimeFactorFor1(){
        PrimeFactor pf = new PrimeFactor();
        Assert.assertEquals(0, pf.ComputeFactors(1));
    }

    @Test
    public void PrimeFactorFor2(){
        PrimeFactor pf = new PrimeFactor();
        Assert.assertEquals(2, pf.ComputeFactors(2));
    }
}