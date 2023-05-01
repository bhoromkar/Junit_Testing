package com.bridgelabz;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestRegistration {

    @Test
    public void testValidFirstName() {
        assertTrue(Registration.validateFirstName("John"));
    }

    @Test
    public void testInvalidFirstName() {
        assertFalse(Registration.validateFirstName("J"));
    }

    @Test
    public void testValidLastName() {
        assertTrue(Registration.validateLastName("Doe"));
    }

    @Test
    public void testInvalidLastName() {
        assertFalse(Registration.validateLastName("D"));
    }

    @Test
    public void testValidEmail() {
        assertTrue(Registration.validateEmail("john.doe@example.com"));
    }

    @Test
    public void testInvalidEmail() {
        assertFalse(Registration.validateEmail("johndoe@example"));
    }

    @Test
    public void testValidMobile() {
        assertTrue(Registration.validateMobile("91 9919819801"));
    }

    @Test
    public void testInvalidMobile() {
        assertFalse(Registration.validateMobile("919919819801"));
    }

    @Test
    public void testValidPassword() {
        assertTrue(Registration.validatePassword("Passw0rd!"));
    }

    @Test
    public void testInvalidPassword() {
        assertFalse(Registration.validatePassword("password"));
    }

}
