public class Main {
    public static void main(String[] args) {
        int number = 5;
        int result = factorial(number);
        System.out.println("Факториал числа " + number + " равен " + result);
    }
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else if (n < 1) {
            return -1;
        } else {
            return n * factorial(n - 1);
        }
    }
}