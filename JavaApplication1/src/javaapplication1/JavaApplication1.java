package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        int num;
        int num2;
        Scanner input = new Scanner(System.in);
        System.out.print("Input number: 1: ");
        num = input.nextInt();
        System.out.print("INput NUmber 2: ");
        num2 = input.nextInt();

        gcd(num, num2);
    }

    static void gcd(int num1, int num2) {
       int temp = num2;
        System.out.println("gcd("+num1+","+num2+")");
        while (num2 != 0) {
            temp = num2;
             num2 = num1 % num2;
             num1 = temp;
              System.out.println("gcd("+num1+","+num2+")");
        }
       

    }
}
