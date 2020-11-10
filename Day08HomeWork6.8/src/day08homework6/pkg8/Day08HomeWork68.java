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
        for (double n : data) { //mesmo que: for(int n = 0; n < data.lenght; n++) { sum += data[n] }
            sum += n;
        }
        return sum / data.length;
    }
            
    public static void main(String[] args) {
        // TODO code application logic here
        int[] dataInts = {10, 15, 20};
        double [] dataDouble = {10.1, 10.5, 10.9};
        
        int avgInts = average(dataInts);
        double avgDouble = average(dataDouble);
        
        System.out.println(avgInts);
        System.out.println(avgDouble);
    }
    
}
