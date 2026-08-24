package com.gla.Arrays.Level2;

import java.util.Scanner;

public class BMI2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Enter weight: ");
            personData[i][0] = sc.nextDouble();

            System.out.print("Enter height: ");
            personData[i][1] = sc.nextDouble();

            if (personData[i][0] <= 0 || personData[i][1] <= 0) {
                System.out.println("Invalid input, enter again");
                i--;
            }
        }

        for (int i = 0; i < number; i++) {
            personData[i][2] =
                    personData[i][0] /
                            (personData[i][1] * personData[i][1]);

            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            }
            else if (personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            }
            else if (personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            }
            else {
                weightStatus[i] = "Obese";
            }
        }

        for (int i = 0; i < number; i++) {
            System.out.println(
                    "Height = " + personData[i][1] +
                            " Weight = " + personData[i][0] +
                            " BMI = " + personData[i][2] +
                            " Status = " + weightStatus[i]
            );
        }
    }
}

