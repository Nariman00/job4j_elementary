package ru.job4j.condition;

public class LogicNot {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return !isEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || !isPositive(num);
    }

    public static void main(String[] args) {
        LogicNot.isEven(2);
        LogicNot.isPositive(2);
        LogicNot.notEven(1);
        LogicNot.notPositive(-2);
        LogicNot.notEvenAndPositive(1);
        LogicNot.evenOrNotPositive(-2);

        System.out.println(isEven(2));
        System.out.println(isPositive(2));
        System.out.println(notEven(1));
        System.out.println(notPositive(-2));
        System.out.println(notEvenAndPositive(1));
        System.out.println(evenOrNotPositive(-2));
    }
}
