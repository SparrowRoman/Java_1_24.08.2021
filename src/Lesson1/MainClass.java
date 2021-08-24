package Lesson1;

public class MainClass {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSignal();
        printColor(1005);
        compareNumbers(1, 5);
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSignal() {
        int a = 5;
        int b = -10;
        if (a + b >= 0) {
            System.out.println("Сумма положительная !");
        } else {
            System.out.println("Сумма отрицательная !");
        }
    }

    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный !");
            return;
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый !");
        } else {
            System.out.println("Зеленый !");
        }
    }

    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a < b");

        }
    }
}
