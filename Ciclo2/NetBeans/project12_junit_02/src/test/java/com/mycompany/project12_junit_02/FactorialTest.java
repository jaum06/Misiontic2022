/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project12_junit_02;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Andrés
 */
public class FactorialTest {

    @Test
    public void testCalculateFactorial() {
        Factorial myFactorial = new Factorial();
        long expetedValues[] = {6, 24, 120};
        long arguments[] = {3, 4, 5};
        for (int i = 0; i < expetedValues.length; i++) {
            assertEquals(expetedValues[i], myFactorial.calculateFactorial(arguments[i]));
        }
    }

}
