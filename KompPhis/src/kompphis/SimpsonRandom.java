package kompphis;

/**
 *
 * @author Serhii_Tolok
 */
public class SimpsonRandom extends RandomGenerator {

    Double a;
    Double b;

    public SimpsonRandom(Double a, Double b, Double from, Double to) {
        super(from, to);
        this.a = a;
        this.b = b;
    }

    @Override
    Double nextXi(Double yi) {
        return (yi < a || yi > b) ? 0 : 2.0 / (b - a) - 2.0 / (b - a) / (b - a) * Math.abs(a + b - 2 * yi);
    }

}
