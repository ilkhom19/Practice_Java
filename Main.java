package com.ilkh0m;

import java.lang.ref.SoftReference;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int principal =0;

        while(true) {
            System.out.print("Principal ($1K - $1M): ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1000000)
                break;
            System.out.println("Enter a number between 1,000 and 1,000,000");
        }

        float annualRate =0;
        while(true) {
            System.out.print("Annual Interest Rate: ");
            annualRate = scanner.nextFloat();
            if (annualRate > 0 && annualRate <= 30)
                break;
            System.out.println("Enter a value greater than 0 and less than or equal to 30");
        }
        byte periodYears = 0;
        while (true){
            System.out.print("Period (Years) ");
            periodYears = scanner.nextByte();
            if (periodYears > 1 && periodYears < 30)
                break;
            System.out.println("Enter a value between 1 and 30");
        }


        float monthlyRate = ((annualRate/100)/12);   // Convert to Monthly rate percent
        int periodMonths = periodYears*12;

        double Mortgage = principal*((monthlyRate*(Math.pow(1+monthlyRate,periodMonths))/(Math.pow(1+monthlyRate,periodMonths)-1)));

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(Mortgage);
        System.out.println("Mortgage "+result);









//        String input = "";
//        Scanner scanner = new Scanner(System.in);
//        while (!input.equals("quit")) {
//            System.out.print("Input: ");
//            input = scanner.next().toLowerCase();
//            System.out.println(input);
//        }


//        do {
//            System.out.print("Input: ");
//            input = scanner.next().toLowerCase();
//            System.out.println(input);
//            while (!input.equals("quit")) ;
//        }
    }
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Number: ");
//            int num = scanner.nextInt();
//
//            if (num%3==0 && num%5==0)
//                System.out.println("FizzBuzz");
//            else if (num%3==0)
//                System.out.println("Buzz");
//            else if (num % 5 ==0)
//                System.out.println("Fizz");
//            else
//                System.out.println(num);


//            switch (num){
//                case num%3==0:
//                    System.out.println("You are an admin");
//                    break;
//                case "moderator":
//                    System.out.println("You are a moderator");
//                    break;
//                default:
//                    System.out.println("You are the Guest");
//            }


    }

