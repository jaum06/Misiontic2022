
package com.mycompany.project12_junit_02;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
/**
 *
 * @author Andrés 
 */
@RunWith(value = Suite.class)
@SuiteClasses({
    FactorialTest.class,
    NumeroMayorTest.class
})
public class TestSuite {
    
}

