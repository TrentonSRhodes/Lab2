/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab2;

import java.util.Scanner;

/**
 *
 * @author trent
 */
public class bankCharges {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the number of checks written this month");
        double numOfChecks = keyboard.nextDouble();
        double costPerCheck;
        
        if (numOfChecks < 20){
            costPerCheck = (numOfChecks *.10) + 10;
            System.out.println("The total cost for this month is " + costPerCheck);
        }
        if (numOfChecks < 39 && numOfChecks >= 20){
            costPerCheck = (numOfChecks *.08) + 10;
            System.out.println("The total cost for this month is " + costPerCheck);
        }
        if (numOfChecks < 59 && numOfChecks >= 40){
            costPerCheck = (numOfChecks *.06) + 10;
            System.out.println("The total cost for this month is " + costPerCheck);
        }
        if (numOfChecks >= 60){
            costPerCheck = (numOfChecks *.04) + 10;
            System.out.println("The total cost for this month is " + costPerCheck);
        }
    }
}
