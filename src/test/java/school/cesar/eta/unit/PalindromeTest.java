package school.cesar.eta.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeTest {

    @Test
    public void check_palindromeWord_true(){
        Palindrome palindrome = new Palindrome();
        boolean actual = palindrome.check("ovo");;
        Assertions.assertTrue(actual);
    }

    @Test
    public void check_palindromeWord_false(){
        Palindrome palindrome = new Palindrome();
        boolean actual = palindrome.check("ovos");;
        Assertions.assertFalse(actual);
    }

    @Test
    public void check_OneChar_true(){
        Palindrome palindrome = new Palindrome();
        boolean actual = palindrome.check("o");;
        Assertions.assertTrue(actual);

    }
}
