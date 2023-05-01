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
            return email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
        }

        public static boolean validateMobile(String mobile) {
            return mobile.matches("^\\d{2} \\d{10}$");
        }

        public static boolean validatePassword(String password) {
            return password.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%!^&*])[A-Za-z\\d@#$%!^&*]{8,}$");
        }

    }
