package kompphis;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Serhii_Tolok
 */
class MyRandomUniform extends RandomGenerator {

        int K;
        Double B0;
        int M;
        Double C;

        public MyRandomUniform(int K, Double B0, int M, Double C, Double from, Double to) {
            super(from, to);
            this.K = K;
            this.B0 = B0;
            this.M = M;
            this.C = C;
        }

        public List<Double> generate(int count) {
            List<Double> result = new ArrayList<Double>();
            Double Bi = B0;
            for (int i = 0; i < count; i++) {
                result.add(Bi / M);
                Bi = generateNext(K, Bi, M, C);
            }
            return result;
        }

        public Double generateNext(int K, Double Bi, int M, Double C) {
            return ((K * Bi + C) % M);
        }

        @Override
        Double nextXi(Double yi) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
