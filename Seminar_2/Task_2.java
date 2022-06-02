/*Попробовать сгенерировать все перестановки длины N из K чисел с повторениями. 
* Пример: N = 2, K = 3 ответ "00 01 02 10 11 12 20 21 22"*/
// Решение с помощью массива
import java.util.Arrays;

package Seminar_2;

public class Task_2 {
    public static void main(String[] args) {
        System.out.println(generate(2, 3));
        
    }

    public static String generate(int n, int k){
        String result = "";
        for (int i = 0; i <= n; i++){
            for (int j = 0; j < k; j++){
                result = result + i + j + " ";
            }
        }
        return result;

    }
    
}
