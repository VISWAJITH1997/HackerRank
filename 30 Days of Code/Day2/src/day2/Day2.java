/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

import java.util.Scanner;

/**
 *
 * @author viswajith reddy
 */
public class Day2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        double meal_cost = in.nextDouble();
        int tip_percent = in.nextInt();
        int tax_percent = in.nextInt();

        in.close();

        double tip = (meal_cost * ((double) tip_percent / 100));
        double tax = (meal_cost * ((double) tax_percent / 100));

        Double totalCost = new Double(meal_cost + tip + tax);
        int roundTotalCost = (int) Math.round(totalCost);

        System.out.println("The total meal cost is " + roundTotalCost + " dollars.");

    }

}
