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
public class NumeroMayorTest {
    
    
    @Test
    public void testGetGreater() {
        NumeroMayor numeroMayor = new NumeroMayor();
        int result = numeroMayor.getGreater(5, 5);
        assertEquals(5, result);
    }
    
}
