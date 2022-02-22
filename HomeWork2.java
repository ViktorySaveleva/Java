/**
 * Java 1. Homework 2
 * @author Viktoriia Saveleva
 * @version 22.2.2022
 */

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println(within10and20(15, 7));
        isPositiveOrNegative(0);
        System.out.println(isNegative(0));
        printWordInTimes("Hi", 5);
    }
    public static boolean within10and20(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;
    }
    public static void isPositiveOrNegative(int c) {
        if (c >= 0) {
            System.out.println("Is positive");
        } else {
            System.out.println("Is negative");
        }
    }
    public static boolean isNegative(int d) {
        if (d < 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void printWordInTimes(String w, int t) {
        for (int i = 0; i < t; i++) {
            System.out.println(w);
        }
    }
}
