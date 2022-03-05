package com.company;

    public class Main {
        public static void main(String[] args) {
            double[] nums = {-3.3, 3.4, 4.3, -5.0, 2.1, 8.6, -9.1, 3.2, 4.5, 3.3, -6.3, 5.9, 6.6, -7.7};
            double result = 0;
            double box = 0;
            boolean middle = false;

            for (Double firstArray : nums) {
                if (firstArray < 0){
                    middle = true;
                }else {
                    if (firstArray > 0){
                        result += firstArray;
                        box ++;
                    }
                }
               // result += firstArray;
            }
            System.out.println("Среднее арифметическое " + result / box);



        }


    }


