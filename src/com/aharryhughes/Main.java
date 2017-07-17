package com.aharryhughes;


import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            System.out.println("Gimmie a numba");
            String firstInput = scanner.nextLine();

            System.out.println("Gimmie anotha numba");
            String secondInput = scanner.nextLine();

            double firstNumber = Double.parseDouble( firstInput );
            double secondNumber = Double.parseDouble( secondInput );

            double sum = firstNumber + secondNumber;
            double difference = firstNumber - secondNumber;
            double division = firstNumber / secondNumber;
            double multiplication = firstNumber * secondNumber;
            double remainder = firstNumber % secondNumber;

            showResults(sum, difference, division, multiplication, remainder);


    }

    public static void showResults(double sum, double difference, double division, double multiplication, double remainder){
        System.out.printf("The sum is %.2f, the difference is %.2f, the divisor is %.2f, the multiplicative %.2f, and the remainder is %.2f", sum, difference, division, multiplication, remainder);
    }
}
