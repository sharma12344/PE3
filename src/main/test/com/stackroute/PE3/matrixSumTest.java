package com.stackroute.PE3;

import org.junit.*;

import static org.junit.Assert.*;

public class matrixSumTest {
    matrixSum ms;

    @Before
    public void setUp() throws Exception {
        ms = new matrixSum();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void check() {
        int[][] expected = {{10, 10}, {10, 10}, {10, 10}};
        int a1[][] = {{1, 2}, {3, 4}, {5, 6}};
        int a2[][] = {{9, 8}, {7, 6}, {5, 4}};
        int[][] actual = ms.checkSum(3, 2, a1, a2);

        assertArrayEquals(expected, actual);
    }

}