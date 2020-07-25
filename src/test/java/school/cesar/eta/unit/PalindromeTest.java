package school.cesar.eta.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PalindromeTest {
    private Palindrome palindrome;

    @BeforeEach
    public void setupTest(){
        palindrome = new Palindrome();
    }

    @Test
    public void check_OneCharWord_true(){
        boolean actual = palindrome.check("a");
        Assertions.assertTrue(actual);
    }

    @Test
    public void check_palindromeWord_false(){
        boolean actual = palindrome.check("ab");
        Assertions.assertFalse(actual);
    }

    @Test
    public void check_palindromeWord_true(){
        boolean actual = palindrome.check("racecar");
        Assertions.assertTrue(actual);
    }
}
