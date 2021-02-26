package pl.sda.java.jsp.sevlet;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testDisplayWhenNew() {
        //given
        String expect = "";

        //when
        String actual = calculator.display();

        //then
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void testInput7ThenDisplay7() {
        //given
        String expect = "7";
        //when

        calculator.input("7");
        String actual = calculator.display();
        //then
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void testAdd2and1() {
        //given
        String expect = "3";
        //when
        calculator.input("1");
        calculator.add();
        calculator.input("2");
        calculator.evaluate();
        String actual = calculator.display();
        //then
        Assert.assertEquals(expect, actual);

    }

    @Test
    public void testSubtract2and1() {
        //given
        String expect = "1";
        //when
        calculator.input("2");
        calculator.subtract();
        calculator.input("1");
        calculator.evaluate();
        String actual = calculator.display();
        //then
        Assert.assertEquals(expect, actual);

    }


}