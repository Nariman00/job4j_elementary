package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = x2 - x1;
        double first = Math.pow(rsl, 2);
        return rsl;
    }

    public static double distance1(int x1, int y1, int x2, int y2) {
        double rsl = y2 - y1;
        double second = Math.pow(rsl, 2);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 1, 2);
        double result1 = Point.distance1(0, 0, 1, 2);
        double sum = Point.distance(0, 0, 1, 2) + Point.distance1(0, 0, 1, 2);
        double d = Math.sqrt(sum);
        System.out.println("result (0, 0) to (1, 2) " + d);
    }
}
