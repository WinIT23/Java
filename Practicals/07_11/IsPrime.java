/*
 *******************************************************************************
 *  This Program is used for checking if the given number is a prime number or
 *  not.
 *******************************************************************************
*/

import java.util.Scanner;
import java.lang.Math;

class IsPrime {
    public static void main(String[] args) {

        boolean isPrime = true;
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();

        System.out.println("Number is : " + number);

        for(int i = 2; i < Math.ceil(Math.sqrt(number)); i++) {
            if(number % i == 0)
                isPrime = false;
        }

        if(isPrime)
            System.out.println(number + " is a Prime number.");
        else
            System.out.println(number + " is not a Prime number.");
        
        num.close();
    }
}
