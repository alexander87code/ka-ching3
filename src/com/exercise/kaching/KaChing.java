package com.exercise.kaching;

public class KaChing {
    public static void main(String[] args) {
        int i = 1;
        String message;

        while (i < 61) {
            message = Integer.toString(i);
            if (i % 3 == 0) {
                message = "ka";
            }
            if (i % 5 == 0) {
                message = "ching!";
            }
            if (i % 3 == 0 && i % 5 == 0) {
                message = "ka-ching!";
            }
            System.out.println(message);
            i++;
        }
    }
}
