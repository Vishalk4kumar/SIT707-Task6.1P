package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class LoopFunctionsTest {

    @Test
    public void testSumUpTo() {
        // Test sum of numbers up to 5
        Assert.assertEquals(15, LoopFunctions.sumUpTo(5));
        
        // Test sum of numbers up to 10
        Assert.assertEquals(55, LoopFunctions.sumUpTo(10));
        
        // Test sum of numbers up to 0
        Assert.assertEquals(0, LoopFunctions.sumUpTo(0));
        
        // Test sum of numbers up to 1
        Assert.assertEquals(1, LoopFunctions.sumUpTo(1));
    }
    
    @Test
    public void testSumOfEvenNumbers() {
        // Test sum of even numbers up to 5
        Assert.assertEquals(6, LoopFunctions.sumOfEvenNumbers(5));
        
        // Test sum of even numbers up to 10
        Assert.assertEquals(30, LoopFunctions.sumOfEvenNumbers(10));
        
        // Add more test cases here
        // Test sum of even numbers up to 1
        Assert.assertEquals(0, LoopFunctions.sumOfEvenNumbers(1));
        
        // Test sum of even numbers up to 0
        Assert.assertEquals(0, LoopFunctions.sumOfEvenNumbers(0));
    }

    @Test
    public void testFactorial() {
        // Test factorial of 5
        Assert.assertEquals(120, LoopFunctions.factorial(5));
        
        // Test factorial of 0
        Assert.assertEquals(1, LoopFunctions.factorial(0));
    }
    
    @Test
    public void testIsPerfectSquare() {
        // Test a perfect square number
        Assert.assertTrue(LoopFunctions.isPerfectSquare(25));
        
        // Test a non-perfect square number
        Assert.assertFalse(LoopFunctions.isPerfectSquare(17));
        
        // Test a perfect square number
        Assert.assertTrue(LoopFunctions.isPerfectSquare(16));
        
        // Test a non-perfect square number
        Assert.assertFalse(LoopFunctions.isPerfectSquare(14));
    }
    
    @Test
    public void testCalculateSumUntilThreshold() {
        // Test sum until threshold of 5
        Assert.assertEquals(15, LoopFunctions.calculateSumUntilThreshold(5));
        
        // Test sum until threshold of 10
        Assert.assertEquals(55, LoopFunctions.calculateSumUntilThreshold(10));
        
        // Test sum until threshold of 0
        Assert.assertEquals(0, LoopFunctions.calculateSumUntilThreshold(0));
        
        // Test sum until threshold of 1
        Assert.assertEquals(1, LoopFunctions.calculateSumUntilThreshold(1));
    }
}
