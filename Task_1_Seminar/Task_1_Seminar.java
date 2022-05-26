
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

//     static double degree(int a, int b) {
//         double x = Math.pow(a, b);
//         return x;
//     }
//     public static void main(String[] args) {
//         System.out.println(degree(2, 3));
//     }
// }

// Решение с семинара
public class Task_1_Seminar {

    public static void main(String[] args) {
        System.out.println(calculatePow(2, 2));
    }

    public static double calculatePow(double a, double b) {
        double result = 1;
        if (a==0 || a == 1) {
            return a;
        }
        if (b==0) {
            return 1;
        }
        if (b < 0) {
            a = 1/a;
            b = -b;
        }

        for(int i = 0; i < b; i++){ 
            result *= a;
        }
        // в случае, если b будет большим числом, программе придется выполнить очень много операций

        return result;
    }
    // пишем рекурсивную степень, чтобы вместо n операций выполнять log(n) операций
    public static double powRec(double a, int b){
        if (b == 0){
            return 1;
        }

        if (b < 0){
            
        }
    }
}

