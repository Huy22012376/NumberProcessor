package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testStatementCoverage() {
        int[] arr = {2, 3};
        assertEquals(-1, NumberProcessor.processNumbers(arr));
    }

    @Test
    void testEmpty() {
        assertEquals(0, NumberProcessor.processNumbers(new int[]{}));
    }

    @Test
    void testAllEven() {
        assertEquals(6, NumberProcessor.processNumbers(new int[]{2,4}));
    }

    @Test
    void testAllOdd() {
        assertEquals(-9, NumberProcessor.processNumbers(new int[]{1,3,5}));
    }

    @Test
    void testMixed() {
        assertEquals(-2, NumberProcessor.processNumbers(new int[]{1,2,3}));
    }
}