/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1;

import java.util.Scanner;

/**
 *
 * @author viswajith reddy
 */
public class Day1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //Fixed code application logic here
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        
     // TODO code application logic here
        int a = scan.nextInt();
        double b = scan.nextDouble();
        scan.nextLine();
        String str = scan.nextLine();

        System.out.println(i + a);
        System.out.println(d + b);
        System.out.println(s + "" + str);
    }

}
