/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tradeshift;

import java.util.Scanner;

public class main {
//TODO documentation
    // interface?
    //håndter fejl med trekant med for lang side (1,1,999999)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your triangle: ");
        String[] input = scanner.nextLine().split(" ");

        try {
            double a = Double.parseDouble(input[0]);
            double b = Double.parseDouble(input[1]);
            double c = Double.parseDouble(input[2]);

            Triangle t = new Triangle(a, b, c);
            System.out.println(t.getType());

            System.out.println(Triangle.getType(a, b, c));
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
