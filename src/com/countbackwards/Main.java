package com.countbackwards;
public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int backward = numbers.length;
            
        for(int i = 0; i < numbers.length; i++) {
            backward--;
            System.out.print(numbers[backward]);
        
        }
    }
}