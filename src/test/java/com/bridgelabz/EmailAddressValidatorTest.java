package com.bridgelabz;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;

    @RunWith(Parameterized.class)
    public class EmailAddressValidatorTest {

        private final String input;
        private final boolean expectedResult;

        public EmailAddressValidatorTest(String input, boolean expectedResult) {
            this.input = input;
            this.expectedResult = expectedResult;
        }

        @Parameterized.Parameters
        public static Collection<Object[]> testData() {
            return Arrays.asList(new Object[][]{
                    {"abc@yahoo.com", true},
                    {"abc-100@yahoo.com", true},
                    {"abc.100@yahoo.com", true},
                    {"abc111@abc.com", true},
                    {"abc-100@abc.net", true},
                    {"abc.100@abc.com.au", true},
                    {"abc@1.com", true},
                    {"abc@gmail.com.com", true},
                    {"abc+100@gmail.com", true},
                    {"johndoe@example", false},
                    {"johndoe@example.", false},
                    {"johndoe@.com", false},
                    {"johndoe@com.", false},
                    {"johndoe@com", false},
                    {"johndoe@", false},
                    {"johndoe", false},
                    {"", false},
                    {" ",true}
            });
        }

        @Test
        public void testEmailAddress() {
            assertEquals(expectedResult, Email.validateEmail(input));
        }
    }


