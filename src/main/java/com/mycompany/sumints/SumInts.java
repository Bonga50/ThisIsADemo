/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sumints;

import java.util.Scanner;

/**
 *
 * @author Siyabonga
 */
public class SumInts {

    public static void main(String[] args) {
        int numLoops = 0;//holds number of times loop is going to loop
        int userNum = 0;
        int TotalSum = 0;
        while (userNum != 999) {            
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter a number");
            userNum = sc.nextInt();
            
            TotalSum = TotalSum + userNum;
            System.out.println("Total sum = " + TotalSum);
            numLoops = numLoops + 1;
            System.out.println("Number of times looped = "+ numLoops);
            
          
        }
        TotalSum = TotalSum - 999;
        numLoops = numLoops - 1;
        System.out.println("Total sum = "+ TotalSum +"number of loops = "+numLoops);
    }
}
