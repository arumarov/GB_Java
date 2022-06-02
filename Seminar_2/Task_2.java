package Seminar_2;
/*Попробовать сгенерировать все перестановки длины N из K чисел с повторениями. 
* Пример: N = 2, K = 3 ответ "00 01 02 10 11 12 20 21 22"*/
// Решение с помощью массива
import java.util.Arrays;



public class Task_2 {
    public static void main(String[] args) {
        int N = 3;
        int K = 2; // сколько чисел будем использовать

        int[]nums = new int[N]; //создается массив [0, 0, 0]
        generated(nums, 0, K);
        
    }

    public static void generated(int[] array, int index, int K){
        if (index == array.length){ // если индекс не равен длине массива, опускаемся в цикл
            System.out.println(Arrays.toString(array)); // метод, позволяющий распечатать массив
            return;
        }

        for (int i = 0; i <= K; i++){
            array[index] = i;
            generated(array, index+1, K);

        }
    
    }

}
