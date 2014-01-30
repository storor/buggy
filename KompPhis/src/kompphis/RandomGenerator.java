package kompphis;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Serhii_Tolok
 */
public abstract class RandomGenerator {

    Double from;
    Double to;

    public RandomGenerator(Double from, Double to) {
        this.from = from;
        this.to = to;
    }
    
    List<Double> generate(int count) {
        List<Double> result = new ArrayList<>();
        Random random = new Random();
        Double xi = getX(random);
        for (int i = 0; i < count; i++) {
            result.add(nextXi(xi));
            xi = random.nextDouble()*(to - from)+from;

        }
        return result;
    }
    
    Double getX(Random random){
        return random.nextDouble()*(to - from)+from;
    }

    abstract Double nextXi(Double yi);
    
    Double m() {
        Double result = 0.0;
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            Double xi = getX(random);
            result+=xi*nextXi(xi);
        }
        return result;
    }
    

}
