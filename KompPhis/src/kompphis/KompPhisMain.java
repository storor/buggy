/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kompphis;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

/**
 *
 * @author Serhii_Tolok
 */
public class KompPhisMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int K = 1664525;
            double B0 = 247433647;
            int M = Integer.MAX_VALUE-2;
            double C = 1013904223d;
//            RandomGenerator generator = new MyRandomUniform(K, B0, M, C,0.0,1.0);
//            List<Double> randoms = generator.generate(1000);
//            print("uniform.txt",randoms);        

            RandomGenerator generatorCustom = new MyRandomCustom(2.0, 20.0,2.0,20.0);
            List<Double> randomsCustom = generatorCustom.generate(1000);
            Double Mcustom = generatorCustom.m();
            System.out.println(Mcustom);
            //print("custom.txt",randomsCustom);
            
//            RandomGenerator generatorSimpson = new SimpsonRandom(1.0, 2.0,1.0,2.0);
//            List<Double> randomsSimps = generatorSimpson.generate(1000);
//            print("simpson.txt",randomsSimps);
    }
    
    private static void print(String fileName, List<? extends Object> values){
        File f1 = new File(fileName);
        try {
            PrintWriter pw = new PrintWriter((new FileWriter(f1)));
            for(Object obj : values){
                pw.println(obj);
            }
            pw.close();

        } catch (Exception e) {
        } finally {
        }
    }    
}
