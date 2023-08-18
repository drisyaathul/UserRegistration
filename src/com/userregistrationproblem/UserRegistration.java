package com.userregistrationproblem;

import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        System.out.println("--- User Registration Problem ---");

        boolean result1 = Pattern.matches("^[A-Z][a-z]{2,}","Drisya");
        if (result1)
            System.out.println("Valid FirstName");
        else
            System.out.println("Invalid FirstName");

        boolean result2 = Pattern.matches("^[A-Z][a-z]{2,}","Athul");
        if (result2)
            System.out.println("Valid LastName");
        else
            System.out.println("Invalid LastName");

        boolean result3 = Pattern.matches("^[a-z.@]{3,}","abc.xyz@bl.co.in");
        if (result3)
            System.out.println("Valid Email-Id");
        else
            System.out.println("Invalid Email-Id");
    }
}
