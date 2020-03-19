/*
 *******************************************************************************
 *  This program saprates the Vowels and Consonents from input string.
 *******************************************************************************
*/

import java.util.Scanner;

class DiffChar {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String string = str.nextLine();
        String vowel = "";
        String consonant = "";

        for(int i = 0; i < string.length() - 1;i++ ) {
            char ch = string.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vowel = vowel + ch + " ";

            else if(ch == ' ')
                continue;

            else
                consonant = consonant + ch + " ";
        }

        System.out.println("Vowels     : " + vowel);
        System.out.println("Consonents : " + consonant);
    }
}
