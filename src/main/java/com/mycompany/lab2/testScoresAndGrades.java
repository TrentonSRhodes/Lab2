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
public class testScoresAndGrades {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please Enter your three test scores one at a time.");
        int firstTestScore = keyboard.nextInt();
        int seccondTestScore = keyboard.nextInt();
        int thirdTestScore = keyboard.nextInt();
        
        double totalTestScores = firstTestScore + seccondTestScore + thirdTestScore;
        
        double averageTestScore = totalTestScores / 3;
         
       if (averageTestScore < 100 && averageTestScore > 90){
          System.out.println("Your average test score is " + averageTestScore + "A"); 
       }   
       if (averageTestScore < 89 && averageTestScore > 80){
           System.out.println("Your average test score is " + averageTestScore + "B"); 
       }     
       if (averageTestScore < 79 && averageTestScore > 70){
           System.out.println("Your average test score is " + averageTestScore + "C"); 
       }       
        if (averageTestScore < 69 && averageTestScore > 60){
           System.out.println("Your average test score is " + averageTestScore + "D"); 
       }           
        if (averageTestScore < 60){
           System.out.println("Your average test score is " + averageTestScore + "F"); 
       }       
              
    }
}
