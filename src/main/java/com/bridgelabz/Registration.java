package com.bridgelabz;

import java.util.regex.Pattern;

public class Registration {

        public static boolean validateFirstName(String firstName) {
            return firstName.matches("^[A-Z][a-z]{2,}$");
        }

        public static boolean validateLastName(String lastName) {
            return lastName.matches("^[A-Z][a-z]{2,}$");
        }

        public static boolean validateEmail(String email) {
            return email.matches("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$");
        }

        public static boolean validateMobile(String mobile) {
            return mobile.matches("^(\\+?\\+[0-9]{1,3})+[0-9]{10}+$");
        }

        public static boolean validatePassword(String password) {
            return password.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\S.)(?=.*[@#$%!^&*])[A-Za-z\\d@#$%!^&*]{8,}$");
        }

    }
