
/*3. Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer. Go to the editor

Test Data
Input an integer between 0 and 1000: 565
Expected Output :
The sum of all digits in 565 is 16*/

package com.pluralsight.www;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inter=new Scanner(System.in);
        int num,sum,firstDigit,secondDigit,thirdDigit,fourthDigit,remainingNumber;
        num=inter.nextInt();
        firstDigit=num%10;
        System.out.println("Enter the integer"+firstDigit);
    }
}