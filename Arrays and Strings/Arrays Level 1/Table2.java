package com.gla.Arrays.Level1;

import java.util.Scanner;

public class Table2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] result = new int[4];

        int index = 0;
        for (int i = 6; i <= 9; i++) {
            result[index++] = number * i;
        }

        index = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + result[index++]);
        }
    }
}

