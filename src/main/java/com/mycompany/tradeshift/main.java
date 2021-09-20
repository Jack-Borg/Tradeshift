/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tradeshift;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your triangle: ");
        String[] input = scanner.nextLine().split(" ");

        try {
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            int c = Integer.parseInt(input[2]);

            Triangle t = new Triangle(a, b, c);
            System.out.println(t.getType());

            System.out.println(Triangle.getType(a, b, c));
        } catch (Exception e) {
            System.out.println("NaN");
        }
    }
}
