/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project12_junit_01;

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
public class CalculatorTest {

    private static Calculator myCalculator;
    
    @BeforeAll
    public static void init() {
        myCalculator = new Calculator();        
        System.out.println("Prueba");
    }

    @Test
    public void testSum() {
        Calculator myCalculator = new Calculator();
        int expectResult = 10;
        assertEquals(expectResult, myCalculator.sum(2, 8));
    }

    @Test
    public void testSubstract() {
        Calculator myCalculator = new Calculator();
        int expectResult = 10;
        assertEquals(expectResult, myCalculator.substract(20, 10));
    }

    @Test
    public void testMultiply() {
        Calculator myCalculator = new Calculator();
        int expectResult = 10;
        assertEquals(expectResult, myCalculator.multiply(2, 5));
    }

}
