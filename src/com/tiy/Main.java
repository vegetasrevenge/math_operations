package com.tiy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please enter a number");
        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine();
        double operand1 = Double.parseDouble(userInput);
        System.out.println("operand1 = " + operand1);

        System.out.println("Please enter another number.");

        String userInput2 = scanner.nextLine();
        double operand2 = Double.parseDouble(userInput2);
        System.out.println("operand2 = " + operand2);

        double addition = (operand1 + operand2);
        System.out.println("Your sum is: " + addition);

        double subtraction = (operand1 - operand2);
        System.out.println("Your remainder is: " + subtraction);

        double multiplication = (operand1 * operand2);
        System.out.println("Your product is: " + multiplication);

        double division = (operand1 / operand2);
        System.out.println("Your dividend is: " + division + "with a remainder of " + (operand1 % operand2));

        return;

    }
}

