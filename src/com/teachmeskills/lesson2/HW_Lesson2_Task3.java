package com.teachmeskills.lesson2;

public class HW_Lesson2_Task3 {
    public static void main(String[] args) {
        int n = 742;
        int sum = 0;
        sum += n % 10;
        n /= 10;
        sum += n % 10;
        n /= 10;
        sum += n % 10;
        System.out.println("Sum of digits of n equals to " + sum);
    }

}
