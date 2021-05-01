import com.project.StringCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest{

    StringCalculator calculator = new StringCalculator();

    @Test
    public void AddEmptyString() throws Exception {
        assertEquals(0,calculator.add(""),0);
    }

    @Test
    public void AddOneInputString() throws Exception {
        assertEquals(1,calculator.add("1"),0);
    }

    @Test
    public void AddTwoInputsString() throws Exception {
        assertEquals(3,calculator.add("1,2"),0);
    }

    @Test
    public void AddMultipleInputsString() throws Exception {
        assertEquals(15,calculator.add("1,2,3,4,5"),0);
    }

    @Test
    public void AddNewLineInputsString() throws Exception {
        assertEquals(15,calculator.add("1,2\n3\n4,5"),0);
    }

    @Test
    public void AddCustomDelimiterInputsString() throws Exception {
        assertEquals(15,calculator.add("//;1,2\n3\n4;5"),0);
    }

    @Test(expected = Exception.class)
    public void negativeInputsString() throws Exception {
        assertEquals("Contains negative numbers: -3",calculator.add("//;1,2\n-3\n4;5"),0);
    }


}