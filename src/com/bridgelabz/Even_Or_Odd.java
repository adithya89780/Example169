package com.bridgelabz;

import java.util.Scanner;

public class Even_Or_Odd {
    public static void main(String[] args) {

        int number = 26;
        int remainder;

        // module
        remainder = number % 2;
        if ( remainder == 0)
        System.out.println(number +  " is even number");
        else
        System.out.println(number + " is odd number");

    }
}
