package com.stackroute.PE3;

import org.junit.*;

import static org.junit.Assert.*;

public class checkCharTest {
    checkChar cc;

    @Before
    public void setUp() throws Exception {
        cc = new checkChar();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void check() {
        String[] expected = {"nd", "ntd Stts", "Grmny", "gypt", "czchslvk"};
        String[] str = {"India", "United States", "Germany", "Egypt", "czechoslovakia"};
        String[] actual = cc.remVow(str);

        assertArrayEquals(expected, actual);
    }

}