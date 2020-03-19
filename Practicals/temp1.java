/*
 *******************************************************************************
 *  This Program is used for checking if the given number is a prime number or
 *  not.
 *******************************************************************************
*/

import java.util.Scanner;
import java.lang.Math;

class IsPrime implements Runnable {
    private boolean isPrime;
    private int mNumber;
    IsPrime(int number) {
        mNumber = number;
        isPrime = true;
    }

    @Override
    public void run(){
        while (mNumber > 2) {
            isPrime = true;
            for(int i = 2; i <= Math.ceil(Math.sqrt(mNumber)); i++) {
                if(mNumber % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
            System.out.println(mNumber + " is a Prime number.");
            else
            System.out.println(mNumber + " is not a Prime number.");
            
            mNumber--;
        }
    }
}

public class temp1 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();

        System.out.println("Number is : " + number);

        new Thread(new IsPrime(number)).start();
        num.close();
    }
}