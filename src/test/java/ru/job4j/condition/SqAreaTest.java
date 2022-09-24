package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP0K0Square0() {
        int expected = 0;
        int p = 0;
        double k = 0;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP1K1Square0625() {
        double expected = 0.0625;
        int p = 1;
        double k = 1;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }
}