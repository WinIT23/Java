/*
 *******************************************************************************
 *  This Program is used for checking if the given string is a pelindrome or
 *  not.
 *******************************************************************************
 */

import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        boolean isPalindrome = true;

        Scanner str = new Scanner(System.in);

        String string = str.nextLine();
        System.out.println("String is : " + string);
        String rev = "";

        for(int i = string.length() - 1; i >= 0; i--) {
            rev = rev + string.charAt(i);
        }
        System.out.println("Reverse String is : " + rev);

        for(int i = 0; i < string.length()-1; i++) {
            if(rev.charAt(i) != string.charAt(i)) {
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome) {
            System.out.println("Palindrome...");
        }
        else {
            System.out.println("Not Palindrome...");
        }

    }
}
