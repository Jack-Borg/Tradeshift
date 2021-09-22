package com.mycompany.tradeshift;

import java.util.Scanner;

public class main {
//TODO documentation
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your triangle (numbers seperated by spaces)");
        String[] input = scanner.nextLine().split(" ");

        try {
            double a = Double.parseDouble(input[0]);
            double b = Double.parseDouble(input[1]);
            double c = Double.parseDouble(input[2]);

            Triangle t = new Triangle(a, b, c);
            System.out.println("the triangle is " + t.getType());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
