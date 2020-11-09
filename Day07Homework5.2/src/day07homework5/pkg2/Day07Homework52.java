/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day07homework5.pkg2;

/**
 *
 * @author 15144
 */
public class Day07Homework52 {

    public static int sumDigits(long n) {
        int sum = 0;
        long rem = 0;

        while (n > 0) {
            rem = n % 10;
            sum += rem;
            n = n / 10;

        }

        return (int) sum;
        /*sum += rem;
        n = n /10;
        rem = n % 10;
        sum += rem;
        n = n /10;
        rem = n % 10;
        sum += rem;
        n = n /10;
        rem = n % 10;
        sum += rem;
        n = n /10;
        rem = n % 10;
        //continue until n becomes 0*/

    }

    public static void main(String[] args) {
        // TODO code application logic here
        int value = 111;
        int sum = sumDigits(value);
        System.out.printf("Sum of digits for value %d is %d\n", value, sum);
    }

}
