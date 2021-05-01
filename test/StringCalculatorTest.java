import com.project.StringCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest{

    StringCalculator calculator = new StringCalculator();

    @Test
    public void AddEmptyString(){
        assertEquals(0,calculator.add(""),0);
    }

    @Test
    public void AddOneInputString(){
        assertEquals(1,calculator.add("1"),0);
    }

    @Test
    public void AddTwoInputsString(){
        assertEquals(3,calculator.add("1,2"),0);
    }

    @Test
    public void AddMultipleInputsString(){
        assertEquals(15,calculator.add("1,2,3,4,5"),0);
    }


}