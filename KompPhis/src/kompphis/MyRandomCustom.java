package kompphis;

import java.util.Random;

/**
 *
 * @author Serhii_Tolok
 */
public class MyRandomCustom extends RandomGenerator {

    Double a;
    Double b;
    Double A;

    public MyRandomCustom(Double a, Double b, Double from, Double to) {
        super(from, to);
        this.a = a;
        this.b = b;
        A = normalize();
    }

    @Override
    public Double nextXi(Double yi) {
        return log((Math.log(a) / A) * yi.doubleValue() + Math.pow(a, a), a);
    }

    public Double normalize() {
        return Math.log(a) / (Math.pow(a, b) - Math.pow(a, a));
    }

    double log(double x, double base) {
        return (Math.log(x) / Math.log(base));
    }

    

}
