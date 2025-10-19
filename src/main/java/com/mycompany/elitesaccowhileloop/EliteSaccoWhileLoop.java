package com.mycompany.elitesaccowhileloop;

import java.util.Scanner;

/**
 *
 * @author ezra
 */
public class EliteSaccoWhileLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double RATE = 0.05;
        
        System.out.print("Enter number of members: ");
        int members = input.nextInt();
        
        int i = 1;
        while (i <= members) {
            System.out.println("\nMember " + i + ":");
            
            System.out.print("Enter principal amount: ");
            double principal = input.nextDouble();
            
            System.out.print("Enter time in years: ");
            double time = input.nextDouble();
            
            double value = principal + (principal * RATE * time);
            
            System.out.println("Value of investment after " + time + " years: " + value);
            
            i++; // increment counter
        }
    }
}
