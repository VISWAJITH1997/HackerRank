/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3;

import java.util.Scanner;

/**
 *
 * @author viswajith reddy
 */
public class Day3 {

    /**
     * @param args the command line arguments
     */
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.close();
        
        String answer;
        if(N%2==1) {
            answer = "Weird";
        } else if (N >= 6 && N <= 20) {
            answer = "Weird";
        } else {
            answer = "Not Weird";
        }
        System.out.println(answer);
    }
}
