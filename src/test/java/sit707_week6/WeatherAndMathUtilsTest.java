package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class WeatherAndMathUtilsTest {
    
    @Test
    public void testStudentIdentity() {
        String studentId = "222342946";
        Assert.assertNotNull("Student ID is null", studentId);
    }

    @Test
    public void testStudentName() {
        String studentName = "Vishal Kumar";
        Assert.assertNotNull("Student name is null", studentName);
    }
    
    @Test
    public void testFalseNumberIsEven() {
        // Test an odd number
        Assert.assertFalse("Odd number should return false", WeatherAndMathUtils.isEven(7));
    }
    
    @Test
    public void testCancelWeatherAdvice() {
        // Test a windspeed slightly above the maximum threshold
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(70.1, 0.0));
    }
    
    @Test
    public void testDangerousWeatherAdvice() {
        // Test for a situation with dangerous windspeed and precipitation
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(80.0, 6.5));
    }

    @Test
    public void testWarningWeatherAdvice() {
        // Test for a situation with concerning windspeed
        Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(50.0, 3.0));

        // Test for a situation with concerning precipitation
        Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(40.0, 5.0));
    }
    
    @Test
    public void testAllClearWeatherAdvice() {
        // Test for a situation with normal windspeed and precipitation
        Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(30.0, 2.0));

        // Test for a situation with windspeed and precipitation below concerning thresholds
        Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(20.0, 1.0));
    }

    @Test
    public void testIsEven() {
        // Test an even number
        Assert.assertTrue("Even number should return true", WeatherAndMathUtils.isEven(8));

        // Test an odd number
        Assert.assertFalse("Odd number should return false", WeatherAndMathUtils.isEven(7));
    }

    @Test
    public void testIsPrime() {
        // Test a prime number
        Assert.assertTrue("Prime number should return true", WeatherAndMathUtils.isPrime(7));

        // Test a non-prime number
        Assert.assertFalse("Non-prime number should return false", WeatherAndMathUtils.isPrime(10));
    }
}
