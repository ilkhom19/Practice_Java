package com.ilkh0m;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualRate = scanner.nextFloat();

        System.out.print("Period (Years) ");
        byte periodYears = scanner.nextByte();

        float monthlyRate = ((annualRate/100)/12);   // Convert to Monthly rate percent
        int periodMonths = periodYears*12;            

        double Mortgage = principal*((monthlyRate*(Math.pow(1+monthlyRate,periodMonths))/(Math.pow(1+monthlyRate,periodMonths)-1)));
        
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(Mortgage);
        System.out.println("Mortgage "+result);
        
    }
}
