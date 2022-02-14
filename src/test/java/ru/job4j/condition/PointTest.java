package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMinus46to22then7dot21() {
        double expected = 7.21;
        int x1 = -4;
        int y1 = 6;
        int x2 = 2;
        int y2 = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when25to1Minus3then8dot06() {
        double expected = 8.06;
        int x1 = 2;
        int y1 = 5;
        int x2 = 1;
        int y2 = -3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when3Minus1to7Minus4then5() {
        double expected = 5;
        int x1 = 3;
        int y1 = -1;
        int x2 = 7;
        int y2 = -4;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}