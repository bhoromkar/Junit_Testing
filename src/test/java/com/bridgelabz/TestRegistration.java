package com.bridgelabz;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;

import static org.junit.Assert.*;
//givenwhenshouldreturn
public class TestRegistration {

    @Test
    public void GivenFirst_NameWhenValid_ShouldReturnTrue() {
        assertTrue(Registration.validateFirstName("John"));
    }

    @Test
    public void GivenFirstName_WhenInValid_ShouldReturnFalse() {
        assertFalse(Registration.validateFirstName("J"));
    }

    @Test
    public void GivenLastName_WhenValidShould_ReturnTrue() {
        assertTrue(Registration.validateLastName("Doe"));
    }

    @Test
    public void GivenLastName_WhenInValidShould_ReturnFalse() {
        assertFalse(Registration.validateLastName("D"));
    }

    @Test
    public void GivenEmail_WhenValid_ShouldReturnTrue() {
        assertEquals(true,Registration.validateEmail("john.doe@example.com"));
    }

    @Test
    public void GivenEmail_WhenInValid_ShouldReturnFalse()
    {
        assertFalse(Registration.validateEmail("johndoe@example"));
    }

    @Test
    public void GivenMobileNumber_WhenValidShould_ReturnTrue() {
        assertTrue(Registration.validateMobile("+919919819801"));
    }

    @Test
    public void GivenMobileNumberWhenInValidShouldReturnFalse() {
        assertFalse(Registration.validateMobile("919919819801"));
    }

    @Test
    public void GivenPasswordWhenValidShouldReturnTrue() {
        assertTrue(Registration.validatePassword("Passw0rd!"));
    }

    @Test
    public void GivenPasswordWhenInValidShouldReturnFalse() {
        assertFalse(Registration.validatePassword("password"));
    }


}
