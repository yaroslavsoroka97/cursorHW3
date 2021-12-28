package com.company;

import java.util.Arrays;
import java.util.Random;

public class Array {
    int[] numbers;
    Random random = new Random();

    Array(int[] numbers) {
        this.numbers = numbers;
    }

    public void evenNumbers() {
        for (int i = 0, a = 2; i < numbers.length; i++) {
            numbers[i] = a;
            a += 2;
        }
        System.out.println("Even numbers " + Arrays.toString(numbers));
    }

    public void randomNumbers() {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        }
        System.out.println("Random numbers " + Arrays.toString(numbers));
    }

    public void value() {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Value = " + sum/numbers.length);
    }

    public void summ3() {
        int summm = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 3 == 0) {
                summm += i;
            }
        }
        System.out.println(summm);
    }

    public void evenInSum() {
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                System.out.println("The value of the even index" + i + "is: " + numbers[i]);
            }
        }

    }

    public void arrayGr() {
        int[] arr6 = {21, 54, 38, 98, 11, 63};
        for (int i = 0; i < arr6.length; i++) {
            int min = arr6[i];
            int minId = i;
            for (int j = i + 1; j < arr6.length; j++) {
                if (arr6[j] < min) {
                    min = arr6[j];
                    minId = j;
                }
            }

            int temp = arr6[i];
            arr6[i] = min;
            arr6[minId] = temp;
        }
        System.out.println(Arrays.toString(arr6));
    }

    public void minIn() {
        int[] arr = {4, 2, 0, 9, -4, 6, 1};
        int min = arr[0];
        for (int x : arr) {
            if (x < min) {
                min = x;
            }
        }
        System.out.println("Min number " + min);
    }

    public void maxIn() {
        int[] arr = {4, 2, 0, 9, -4, 6, 1};
        int max = arr[0];
        for (int x : arr) {
            if (x > max) {
                max = x;
            }
        }
        System.out.println("Max number " + max);
    }

    public void evenIn() {
        int sum = 0;
        for (int i = 0; i < numbers.length; i += 2) {
            sum += i;
        }
        System.out.println(sum);
    }

    public void symbolsTable() {
        char[] symbolsTable = new char[20];
        for (int i = 0; i < symbolsTable.length; i++) {
            symbolsTable[i] = (char) (i + 33);
            System.out.println(symbolsTable[i]);
        }
    }
}
