package com.example;

public class NumberProcessor {

    public static int processNumbers(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            } else {
                sum -= arr[i];
            }
        }

        return sum;
    }
}