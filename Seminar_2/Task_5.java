package Seminar_2;
// /* Задано уравнение вида q + w = e, q, w, e >= 0. 
// * Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
// * Требуется восстановить выражение до верного равенства. 
// * Предложить хотя бы одно решение или сообщить, что его нет.
// */

// // Подсказки
// // нужно привести строку к такому виду, чтобы можно было ее как-то распарсить
// // нужно выделить первое, второе и третье число
// // затем найти, где стоят вопросы и затем сгенерировать все числа
// // на место ? нужно поставить все возможные числа (от 0 до 9)
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Task_5 {
    static char[] textGlobal;
    static List<Integer> signIndexesGlobal;

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> signIndexes = new ArrayList<>(); // список, куда будем записывать позиции ?
        String text = "5? + 3? = ??";
        char[] textChar = text.replace(" ", "").toCharArray(); // убираем пробелы

        for (int i = 0; i < textChar.length; i++) {
            if (textChar[i] == '+' || textChar[i] == '=') {
                textChar[i] = '-'; // заменяем + и = на -
            }
            if (textChar[i] == '?') { // запоминаем где находится ?
                signIndexes.add(i);
            }
        }

        textGlobal = textChar;
        signIndexesGlobal = signIndexes;

        combWithRep(new int[signIndexes.size()], 0, 10);

    }


    public static void combWithRep(int[] comb, int index, int K) {
        if (index == comb.length){
            // готова очередная комбинация
            // давайте здесь поставим на место вопросов комбинацию, проверим подходит ли она нам
            checkComb(comb);
            return;
        }
    
        for (int i = 0; i < K; i++) {
            comb[index] = i;
            combWithRep(comb, index + 1, K);
            
        }
        
    }

    public static void checkComb(int[] comb) {
        for (int i = 0; i < comb.length; i++) {
            textGlobal[signIndexesGlobal.get(i)] = Character.forDigit(comb[i], 10);

        }

        String[] numbers = String.valueOf(textGlobal).split("-");
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        int c = Integer.parseInt(numbers[2]);

        if (a + b == c){
            System.out.printf("%d + %d = %d", a, b, c);
            System.out.println();

        }
    }

}
        
//     // когда combwithrep сгенерировала комбинацию, нужно то, что лежит на месте комбинаций, поставить на место
//     // вопросов

//     // когда вставили цифры на место вопросов, перегоняем все обратно в строку

//     // в методе combrep мы ничего не знаем о том, где хранится текст, куда надо подставлять цифры
    

    

