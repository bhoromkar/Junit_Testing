package com.bridgelabz;

public class Email {


        private static final String EMAIL_REGEX = "^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$";

        public static boolean validateEmail(String email) {
            return email.matches(EMAIL_REGEX);
        }

        // Other validation methods
    }


