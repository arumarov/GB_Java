package Seminar_2;
/* Задано уравнение вида q + w = e, q, w, e >= 0. 
* Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
* Требуется восстановить выражение до верного равенства. 
* Предложить хотя бы одно решение или сообщить, что его нет.
*/

// Подсказки
// нужно привести строку к такому виду, чтобы можно было ее как-то распарсить
// нужно выделить первое, второе и третье число
// затем найти, где стоят вопросы и затем сгенерировать все числа
// на место ? нужно поставить все возможные числа (от 0 до 9)
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;

public class Task_5 {
    static char[] textGlobal;

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> signIndexes = new ArrayList<>(); // список, куда будем записывать позиции ?
        String text = "55 + 75 = 130";
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
        String[] numbers = String.valueOf(textChar).split("-");
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        int c = Integer.parseInt(numbers[2]);

        if (a - b == c){

        }


        System.out.println(Arrays.toString(numbers));
    }


    public static void combWithRep(comb, index, K){
        if (index == comb.length){
            checkcomb(comb) //нужно создать функцию ,которая принимает в себя эту комбинацию
            return;
        }
    }
        for (int i = 0; i < K; i++) {
            comb[index] = i;
            combWithRep(comb, index + 1, K);
            
        }
        
    }

}
        
    // когда combwithrep сгенерировала комбинацию, нужно то, что лежит на месте комбинаций, поставить на место
    // вопросов

    // когда вставили цифры на место вопросов, перегоняем все обратно в строку

    // в методе combrep мы ничего не знаем о том, где хранится текст, куда надо подставлять цифры
    

    

