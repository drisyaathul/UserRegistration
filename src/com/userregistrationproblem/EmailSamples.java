package com.userregistrationproblem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailSamples {
    public static void main(String[] args) {

        String emails = "Sample Email Addresses : \n" +
                "//• 1. abc@yahoo.com,\n" +
                "//• 2. abc-100@yahoo.com,\n" +
                "//• 3. abc.100@yahoo.com,\n" +
                "//• 2. abc111@abc.com,\n" +
                "//• 4. abc-100@abc.net,\n" +
                "//• 5. abc.100@abc.com.au,\n" +
                "//• 6. abc@1.com,\n" +
                "//• 7. abc@gmail.com.com,\n" +
                "//• 8. abc+100@gmail.com,\n";

        Pattern pattern = Pattern.compile("[a-z0-9].+@[a-z0-9.]{2,}");
        Matcher matcher = pattern.matcher(emails);

        System.out.println("Valid E-mail Addresses are :- ");
        while (matcher.find()) {
            String emailId = matcher.group();
            System.out.println(emailId);
        }
    }
}
