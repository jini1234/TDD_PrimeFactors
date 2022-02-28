import java.util.LinkedList;
import java.util.List;

public class PrimeFactor {
    List<Integer> primeFactors=new LinkedList<>();
    public List<Integer> ComputeFactors(int number) {


        if(number%2==0){
            primeFactors.add(2);
            number=number/2;
            ComputeFactors(number);
        }
        else if(number>1)
        primeFactors.add(number);

        return primeFactors;
    }
}
