import java.util.LinkedList;
import java.util.List;

public class PrimeFactor {
    List<Integer> primeFactors=new LinkedList<>();
    public List<Integer> ComputeFactors(int number) {


        for(int i = 2; i<= number; i++) {
            while(number%i == 0) {
               primeFactors.add(i);
                number = number/i;
                System.out.println(number);
            }
        }
         if(number>2)
        primeFactors.add(number);

        return primeFactors;
    }
}
