package com.vamshi.ds.l1;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(JUnitPlatform.class)
public class OctalToDecimalTest {


    @org.junit.jupiter.api.Test
    public void testZeroOctal() {
        OctalToDecimal octalToDecimal = new OctalToDecimal();
        assertEquals(octalToDecimal.convertToDecimal("0"), 0);
    }
    @org.junit.jupiter.api.Test
    public void testOneOctal() {
        OctalToDecimal octalToDecimal = new OctalToDecimal();
        assertEquals(octalToDecimal.convertToDecimal("1"), 1);
    }
    @org.junit.jupiter.api.Test
    public void testFiveOctal() {
        OctalToDecimal octalToDecimal = new OctalToDecimal();
        assertEquals(octalToDecimal.convertToDecimal("5"), 5);
    }
    @org.junit.jupiter.api.Test
    public void test17Octal() {
        OctalToDecimal octalToDecimal = new OctalToDecimal();
        assertEquals(octalToDecimal.convertToDecimal("17"), 15);
    }
    @org.junit.jupiter.api.Test
    public void test72625Octal() {
        OctalToDecimal octalToDecimal = new OctalToDecimal();
        assertEquals(octalToDecimal.convertToDecimal("72625"), 30101);
    }
    @org.junit.jupiter.api.Test
    public void test55142Octal() {
        OctalToDecimal octalToDecimal = new OctalToDecimal();
        assertEquals(octalToDecimal.convertToDecimal("55142"), 23138);
    }
}