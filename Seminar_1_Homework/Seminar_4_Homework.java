package Seminar_1_Homework;

/*Попробовать сгенерировать все перестановки длины N из K чисел с повторенияbhми. 
* Пример: N = 2, K = 3 ответ "00 01 02 10 11 12 20 21 22"*/

public class Seminar_4_Homework {
    public static void main(String[] args) {
        generate(1, 7, 1, 3, "");
    }
    
    public static void generate(int source, int target, int c, int d, String path){
        if (source > target) return; // так как функция void, можно закончить цепочку, просто выйдя из нее
        if (source == target){
            System.out.println(path);
            return;
        }

        generate(source+c, target, c, d, path + " k1");
        generate(source*d, target, c, d, path + " k2");

    } 
}
