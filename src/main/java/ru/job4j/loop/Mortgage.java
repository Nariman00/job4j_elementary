package ru.job4j.loop;

public class Mortgage {
        public static int year(double amount, int salary, double percent) {
            int year = 0;
            double whole = 0;
            percent = amount / percent * 100;
            while (salary > whole) {
                whole = (amount * percent + amount - salary) * percent + (amount * percent + amount - salary);
                year++;
            }
            return year;
        }
}
