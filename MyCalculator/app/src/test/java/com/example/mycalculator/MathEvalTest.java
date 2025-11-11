package com.example.mycalculator;

import static org.junit.Assert.*;
import org.junit.Test;

public class MathEvalTest {
    //Each test will prove that the function is working correctly
    //When a test fails it is because it was meant to fail proving that it would not pass the test
    @Test
    public void testAddTrue() {
        assertEquals("5", MathEval.eval("2+3"));
    }

    @Test
    public void testAddFalse() {
        assertEquals("5", MathEval.eval("2+2"));
    }

    @Test
    public void testSub() {
        assertEquals("-1", MathEval.eval("1-2"));
    }

    @Test
    public void testSubFalse() {
        assertEquals("1", MathEval.eval("1-2"));
    }

    @Test
    public void testMul() {
        assertEquals("15", MathEval.eval("5*3"));
    }

    @Test
    public void testMulFalse() {
        assertEquals("5", MathEval.eval("3*2"));
    }

    @Test
    public void testDiv() {
        assertEquals("1.5", MathEval.eval("6/4"));
    }

    @Test
    public void testDivFalse() {
        assertEquals("2", MathEval.eval("3/2"));
    }


}