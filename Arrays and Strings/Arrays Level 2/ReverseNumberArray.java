package com.gla.Arrays.Level2;

import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int temp = number;

        int count = 0;
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        int[] digits = new int[count];

        temp = number;
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp = temp / 10;
        }

        int[] reverse = new int[count];
        int index = 0;

        for (int i = count - 1; i >= 0; i--) {
            reverse[index++] = digits[i];
        }

        for (int i = 0; i < reverse.length; i++) {
            System.out.print(reverse[i]);
        }
    }
}

