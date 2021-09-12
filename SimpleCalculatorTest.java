package tudelft.SimpleCalculator;

import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.AssertionsKt;
import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleCalculatorTest
{
    @Test
    public void SumPass()
    {
        int Result = SimpleCalculator.Sum(5 , 7);
        Assertions.assertEquals(12 , Result);
    }

    @Test
    public void SumFail()
    {
        int Result = SimpleCalculator.Sum(5 , 7);
        Assertions.assertEquals(20 , Result);
    }


    @Test
    public void SubPass()
    {
        int Result = SimpleCalculator.Sub(10 , 3);
        Assertions.assertEquals(7 , Result);
    }

    @Test
    public void SubFail()
    {
        int Result = SimpleCalculator.Sub(10 , 3);
        Assertions.assertEquals(-1 , Result);
    }

    @Test
    public void MultiplePass()
    {
        int Result = SimpleCalculator.Multiple(5 , 7);
        Assertions.assertEquals(35 , Result);
    }

    @Test
    public void MultipleFail()
    {
        int Result = SimpleCalculator.Multiple(5 , 7);
        Assertions.assertEquals(45 , Result);
    }

    @Test
    public void DividePass()
    {
        int Result = SimpleCalculator.Divide(30 , 5);
        Assertions.assertEquals(6 , Result);
    }

    @Test
    public void DivideFail()
    {
        int Result = SimpleCalculator.Divide(30 , 2);
        Assertions.assertEquals(3 , Result);
    }

    @Test
    public void DivideOperandTwoEqualZero()
    {
        int Result = SimpleCalculator.Divide(30 , 0);
        Assertions.assertEquals(0000 , Result);
    }
}
