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

        boolean result4 = Pattern.matches("^[0-9]{2}\s[0-9]{10}","91 9998899893");
        if (result4)
            System.out.println("Valid Mobile Format");
        else
            System.out.println("Invalid Mobile Format");

        boolean result5 = Pattern.matches("[a-z]{8,}","password");
        if (result5)
            System.out.println("Valid Password1");
        else
            System.out.println("Invalid Password1");

        boolean result6 = Pattern.matches("[A-Za-z]{8,}","PassWord");
        if (result6)
            System.out.println("Valid Password2");
        else
            System.out.println("Invalid Password2");

        boolean result7 = Pattern.matches("[A-Za-z0-9]{8,}","PassWord123");
        if (result7)
            System.out.println("Valid Password3");
        else
            System.out.println("Invalid Password3");

        boolean result8 = Pattern.matches("[A-Za-z0-9].{8,}","PassWord@123");
        if (result8)
            System.out.println("Valid Password4");
        else
            System.out.println("Invalid Password4");
    }
}
