package com;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


    public class task2of3 {
        public static void main(String[] args) throws
        Exception{

            float firstNumberShuma, secondNumberIrene, sum , subtraction, product, quotient;

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            System.out.println("The program calculates sum , difference , product and quotient for two numbers.");
            System.out.println("Enter the first number(and press Enter): ");
            firstNumberShuma= Float.parseFloat(br.readLine());
            System.out.println("Enter the second number (and press Enter): ");
            secondNumberIrene= Float.parseFloat(br.readLine());

            sum = firstNumberShuma + secondNumberIrene;
            subtraction = firstNumberShuma - secondNumberIrene;
            product= firstNumberShuma * secondNumberIrene;
            quotient = firstNumberShuma / secondNumberIrene ;

            System.out.printf("You've entered two numbers , the first is : " + "%2.2f" , firstNumberShuma);
            System.out.printf(" and the Second number is: " + "%2.2f" , secondNumberIrene);


            System.out.println(); //blank area

            System.out.printf("Sum = " + "%2.2f,\n", + sum);
            System.out.printf("Difference = " + "%2.2f, \n", + subtraction);
            System.out.printf("Product = " + "%2.2f, \n", + product);
            System.out.printf("Quotient = " + "%2.2f, \n", +  quotient);

        }





    }

