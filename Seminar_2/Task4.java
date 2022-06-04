package Seminar_2;
// Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd, результат - a4b3cd2

//Решение с семинара
public class Task4 {
    public static void main(String[] args) {
        System.out.println(RCA("aaaabbbcdd"));
    }

    public static String RCA(String str){
        StringBuilder sb = new StringBuilder();
        char t = str.charAt(0);
        int counter = 1;
        for (int i = 1; i < str.length(); i++) {
            if (t != str.charAt(i)){
                sb.append(t);
                if (counter != 1)                   
                    sb.append(counter);
                t = str.charAt(i);
                counter = 0;               
            }
            counter++;
        }
        sb.append(String.format("%c%d", t, counter));
        return sb.toString();
    }
    
    }
