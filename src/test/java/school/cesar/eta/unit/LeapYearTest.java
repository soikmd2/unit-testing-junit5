package school.cesar.eta.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LeapYearTest {
    private LeapYear leapYear;

    @BeforeEach
    public void SetUpTest(){
        leapYear = new LeapYear();
    }
    @Test
    public void isLeapYear_notDivisibleBy4_false(){
        Assertions.assertFalse(leapYear.isLeapYear(666));
    }
    @Test
    public void isLeapYear_divisibleBy400_true(){
        Assertions.assertTrue(leapYear.isLeapYear(400));
    }
    @Test
    public void isLeapYear_divisibleBy100But400_false(){
        Assertions.assertFalse(leapYear.isLeapYear(300));
    }
    @Test
    public void isLeapYear_divisibleBy4But100Neither400_true(){
        Assertions.assertTrue(leapYear.isLeapYear(8));
    }
}
