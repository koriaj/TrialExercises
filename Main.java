package com.pluralsight.www;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double cel,farn,celcius,fahrenheit;
        //Equation=C/5=(f-32)/9
	    //C=(5(F-32))/9
        //F=(9C+(32*5))/5
        Scanner input=new Scanner(System.in);
        System.out.println("The temperature in celcius: ");
       cel= input.nextDouble();
        farn=((9*cel+(32*5))/5);
       System.out.println("The temperature in Farnheit: "+farn);



                celcius=input.nextDouble();
                fahrenheit=((9*celcius+(32*5))/5);
                System.out.println("temperature is "+fahrenheit+" Fahrenheit");

            }
        }


