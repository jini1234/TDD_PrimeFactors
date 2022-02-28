import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PrimeFactorTest {
    List<Integer> result;
    @Before // setup()
    public void before() throws Exception {
       // System.out.println("Setting it up!");
        result=new LinkedList<>();

    }
    @Test
    public void PrimeFactorFor1(){
        PrimeFactor pf = new PrimeFactor();

        Assert.assertEquals(result, pf.ComputeFactors(1));
    }

    @Test
    public void PrimeFactorFor2(){
        PrimeFactor pf = new PrimeFactor();
        result.add(2);
        Assert.assertEquals(result, pf.ComputeFactors(2));
    }

    @Test
    public void PrimeFactorFor3(){
        PrimeFactor pf = new PrimeFactor();
        result.add(3);
        Assert.assertEquals(result, pf.ComputeFactors(3));
    }
    @Test
    public void PrimeFactorFor4(){
        PrimeFactor pf = new PrimeFactor();
        Assert.assertEquals(Arrays.asList(2,2),pf.ComputeFactors(4));
    }

    @Test
    public void PrimeFactorForN(){
        PrimeFactor pf = new PrimeFactor();
        Assert.assertEquals(Arrays.asList(2,2,3),pf.ComputeFactors(12));
    }
}

