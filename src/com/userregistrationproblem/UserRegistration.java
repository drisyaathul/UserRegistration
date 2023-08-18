package com.userregistrationproblem;

import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        System.out.println("--- User Registration Problem ---");

        boolean result1 = Pattern.matches("^[A-Z]{1}[a-z]{2,}","Drisya");
        if (result1)
            System.out.println("Valid FirstName");
        else
            System.out.println("Invalid FirstName");
    }
}
