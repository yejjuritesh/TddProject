import com.project.StringCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest{

    @Test
    public void AddEmptyString(){
        StringCalculator calculator = new StringCalculator();
        assertEquals(0,calculator.add(""),0);
    }

    @Test
    public void AddOneInputString(){
        StringCalculator calculator = new StringCalculator();
        assertEquals(1,calculator.add("1"),0);
    }

    @Test
    public void AddTwoInputsString(){
        StringCalculator calculator = new StringCalculator();
        assertEquals(3,calculator.add("1,2"),0);
    }


}