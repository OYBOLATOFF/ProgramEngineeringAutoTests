package com.example.programengineeringautotests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProgramEngineeringAutoTestsApplicationTests {

    @Test
    void contextLoads() {
        String firstName = "Ramazan";
        String secondName = "Ramazan";
        Assertions.assertTrue(firstName.equals(secondName));
    }

}
