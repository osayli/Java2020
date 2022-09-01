package interviewQuestions.SEAVUS.sumOfNumbersInString;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SolutionTest {
    @Test
    public void basicTests() {
        AssertJUnit.assertEquals(Summation.summy("1 2 3"), 6);
        assertEquals(Summation.summy("1 2 3 4"), 10);
        assertEquals(Summation.summy("1 2 3 4 5"), 15);
        assertEquals(Summation.summy("10 10"), 20);
        assertEquals(Summation.summy("0 0"), 0);
        assertEquals(Summation.summy(" "), 0);
        assertEquals(Summation.summy("-10 -12 78 "), 56);
    }
}
