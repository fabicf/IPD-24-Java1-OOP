/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day03homework4.pkg25;

/**
 *
 * @author 15144
 */
public class Day03HomeWork425 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Compute pi#
        final int ITERATIONS = 1000000;
        double pi = 0;
        int mul = 1;
        for (int i = 1; i <= ITERATIONS; i +=2) {
            pi += mul*1.0d/i;
            mul = mul == 1 ? -1 : 1; //swithc from 1 to -1 and from -1 to 1
        }
        pi *= 4;
        System.out.printf("After %d iterations PI=%f\n", ITERATIONS, pi);
    }
    
}
