package com.mycompany.simplejavabankingprog;

import java.util.Scanner;

/**
 *
 * @author isa
 */
public class Simplejavabankingprog {
    
    static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        
        // JAVA banking program
        
        // DECLARING VARIABLES
  
        double balance = 0;
        boolean isRunning = true;
        int choice;
        
        while(isRunning){
            // DISPLAY MENU
        
        System.out.println("****************");
        System.out.println("BANKING PROGRAM");
        System.out.println("****************");
        System.out.println("1. SHOW BALANCE");
        System.out.println("2. DEPOSIT");
        System.out.println("3. WITHDRAW");
        System.out.println("4. EXIT");
        System.out.println("****************");
        
        // OBTAIN AND PROCESS USER'S CHOICE
        
        System.out.print("Enter your choice (1-4)");
        choice = scanner.nextInt();
        
        switch(choice){
            case 1 -> showBalance(balance);
            case 2 -> balance += deposit();
            case 3 -> balance -= withdraw(balance);
            case 4 -> isRunning = false;
            default -> System.out.println("INVALID CHOICE");
        }
      }
        
        
        // EXIT MESSAGE
        System.out.println("**************************");
        System.out.println("Thanks for banking with us");
        
        scanner.close();
        
    }
    
     // show balance
    static void showBalance(double balance){
        System.out.println("********************************");
        System.out.printf("Your balance is: $%.2f\n", balance);
        System.out.println("********************************");
    }
      //deposit funds
    static double deposit(){
        
        double amount;
        System.out.println("********************************");
        System.out.print("Enter an amount to be Deposited: ");
        amount = scanner.nextDouble();
        
        if(amount < 0){
            System.out.println("Amount can't be less than Zero!");
            return 0;
        }
        else{
            return amount;
        }
        
   
    }
    // withdraw funds
    static double withdraw(double balance){
        
        double amount;
        
        System.out.print("Enter amount to be Withdrawn: ");
        amount = scanner.nextDouble();
        
        if(amount > balance){
            System.out.println("INSUFFICIENT BALANCE");
            return 0;
        }
        else if(amount < 0){
            System.out.println("Amount can't be less than Zero");
            return 0;
        }
        else{
            return amount;
        }
    }
}


