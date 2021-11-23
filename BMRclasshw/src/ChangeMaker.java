/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Greg, from Savitch pg.77
 */
public class ChangeMaker {
    public static void main(String[] args){
        //This program will compute what types of change can be used to
        //pay for an amount from 0-99 cents
        
        int amount, originalAmount,
                quarters, dimes, nickels, pennies;
        
        //tell the user how the program works
        System.out.println("Enter a whole number from 0-99.");
        System.out.println("I will find a combination of coins");
        System.out.println("that equals that amount of change.");
        
        //get the amount from the user
        Scanner kb = new Scanner(System.in);
        amount = kb.nextInt();
        
        //we will start with the largest coins and use our knowledge
        //of integer division and modulus to compute the change required
        originalAmount = amount;
        //recall an integer divided by an integer equals an integer
        quarters = amount / 25;
        //how much is left over?
        //reduce amount to the remainder
        amount = amount % 25;
        
        dimes = amount / 10;
        amount = amount % 10;
        nickels = amount / 5;
        amount = amount % 5;
        pennies = amount;
        
        System.out.println(originalAmount + " cents can be given as: ");
        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels");
        System.out.println(pennies + " pennies");   
    }
}
