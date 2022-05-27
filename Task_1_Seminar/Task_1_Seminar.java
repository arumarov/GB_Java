
/**
 * Task_1_Seminar
 * Реализовать функцию возведения числа а в степень b. a, b ∈ Z.
 * Сводя количество выполняемых действий к минимуму.
 * входные данные находятся в файле input.txt в виде:
 * b 3
 * a 10
 * Результат нужно сохранить в файле output.txt:
 * 1000
 */

// Мое решение (без записи в файл)
// public class Task_1_Seminar {

// static double degree(int a, int b) {
// double x = Math.pow(a, b);
// return x;
// }
// public static void main(String[] args) {
// System.out.println(degree(2, 3));
// }
// }

// Решение с семинара
public class Task_1_Seminar {

    public static void main(String[] args) {
        System.out.println(calculatePow(2, 2));
        System.out.println(calculatePow(2, 3));
        System.out.println(calculatePow(2, -3));
        System.out.println(calculatePow(500, 0));
        System.out.println("------");
        System.out.println(powIter(2, 2));
        System.out.println(powIter(2, 3));
        System.out.println(powIter(2, -3));
        System.out.println(powIter(500, 0));
    }

    public static double calculatePow(double a, double b) {
        double result = 1;
        if (a == 0 || a == 1) {
            return a;
        }
        if (b == 0) {
            return 1;
        }
        if (b < 0) {
            a = 1 / a;
            b = -b;
        }

        for (int i = 0; i < b; i++) {
            result *= a;
        }
        // в случае, если b будет большим числом, программе придется выполнить очень
        // много операций

        return result;
    }

    // Решение с помощью рекурсии, чтобы вместо n операций выполнять log(n) операций
    // При больших числах данная функция работает быстрее
    public static double powRec(double a, int b){
        if (b == 0){
            return 1;
        }

        if (b < 0){
            return powRec(1/a, -b);
        }

        double res = powRec(a, b/2);
        return b%2 == 0 ? res *res : res * res * a;

    }
// Решение без рекурсии, с помощью циклов
    public static double powIter(double a, int b){
        if (a == 0 || a == 1) return a;
        if (b == 0) return 1;

        if (b < 0) {
            a = 1 / a;
            b = -b;
        }

        double result = 1;
        while (b > 0){
            if (b%2 == 1){
                result = result*a;
            }
            a = a * a;
            b = b/2;
        }
        return result;
    }    



}
