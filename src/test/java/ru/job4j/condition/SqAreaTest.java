package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP12K8Square355() {
        double expected = 3.55;
        int p = 12;
        double k = 8;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP24K11Square11() {
        double expected = 11;
        int p = 24;
        double k = 11;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}