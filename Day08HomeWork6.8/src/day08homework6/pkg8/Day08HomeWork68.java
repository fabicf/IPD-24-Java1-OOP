/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day08homework6.pkg8;

/**
 *
 * @author 15144
 */
public class Day08HomeWork68 {

    static int average(int[] data){
    int sum = 0;
        for (int n : data) {
            sum += n;
        }
        return sum / data.length;
    }
    
    static double average(double[] data){
    double sum = 0;
        for (double n : data) {
            sum += n;
        }
        return sum / data.length;
    }
            
    public static void main(String[] args) {
        // TODO code application logic here
        int[] dataInts = {22, 78, 234};
        double [] dataDouble = {56.3, 34.333, 45.11};
        
        int avgInts = average(dataInts);
        double avgDouble = average(dataDouble);
        
        // to be finish
    }
    
}
