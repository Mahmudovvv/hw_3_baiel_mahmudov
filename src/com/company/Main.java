package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] nums = {-3.3, 3.4, 4.3, -5.0, 2.1, 8.6, -9.1, 3.2, 4.5, 3.3, -6.3, 5.9, 6.6, -7.7};
        double result = 0;
        double box = 0;
        boolean middle = false;

        for (Double firstArray : nums) {
            if (firstArray < 0) {
                middle = true;
            } else {
                if (middle) {
                    result += firstArray;
                    box++;
                }
            }
            // result += firstArray;
        }
        System.out.println("Среднее арифметическое: " + result / box);


        int[] nums1 = {-3, 3, 4, -5, 2, 8, -9, 3, 4, 3, -6, 5, 6, -7};

        System.out.println(Arrays.toString(newArray(nums1)));


    }

    public static int[] newArray(int[] er) {
        for (int i = 0; i < er.length; i++) {
            int minimal = er[i];
            int start = i;
            for (int j = i + 1; j < er.length; j++) {
                if (er[j] < minimal) {
                    minimal = er[j];
                    start = j;
                }
            }
            if (i != minimal) {
                int value = er[i];
                er[i] = er[start];
                er[start] = value;
            }
        }
        return er;

    }


}


