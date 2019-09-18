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
public class barChart {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the sales for the five stores");
        double storeOne = keyboard.nextDouble();
        double storeTwo = keyboard.nextDouble();
        double storeThree = keyboard.nextDouble();
        double storeFour = keyboard.nextDouble();
        double storeFive = keyboard.nextDouble();
        double numToCount = 0;
        String y = "";
        
        while (storeOne > 100) {
            storeOne = storeOne - 100;
            numToCount++;
            
            System.out.println("");
        }
        
        
    }
}
