/*
 *******************************************************************************
 *  W.A.P. to make a menu driven Calculator
 *******************************************************************************
 */

import java.util.Scanner;


class Calc{

    private float answer;

    float getAnswer() {
        return answer;
    }
    void setAnswer(float x){
        answer = x;
    }

    void addition(float x, float y) {
        float ans;
        ans = x + y;
        setAnswer(ans);
    }
    void subtraction(float x, float y) {
        float ans;
        ans = x - y;
        setAnswer(ans);
    }
    void multiplication(float x, float y) {
        float ans;
        ans = x * y;
        setAnswer(ans);
    }
    void division(float x, float y) {
        float ans;
        ans = x / y;
        setAnswer(ans);
    }
}

class Main {
    public static void main(String[] args) {
        boolean isDone = true;
        Scanner number = new Scanner(System.in);

        System.out.print("Enter First number : ");
        float num = number.nextFloat();
        System.out.print("Enter Second number : ");
        float num2 = number.nextFloat();

        System.out.println("Numbers are : " + num + " and " + num2);

        Calc obj = new Calc();

        System.out.println("Enter the choice of Operation : ");
        System.out.println("\t1. Addition \n\t2.Subtraction \n\t3.Multiplication \n\t4.Division");
        int choice = number.nextInt();

        switch(choice) {
            case 1:
                obj.addition(num, num2);
                break;
            case 2:
                obj.subtraction(num, num2);
                break;
            case 3:
                obj.multiplication(num, num2);
                break;
            case 4:
                obj.division(num, num2);
                break;
            default:
                System.out.println("Invalid Choice.");
                isDone = false;
                break;
        }

        if(isDone)
            System.out.println("Answer is : " + obj.getAnswer());
    }
}
