package Seminar_2;
/* Напишите метод, который принимает на вход строку (String) и 
* определяет является ли строка палиндромом (возвращает boolean значение) */

// Мое решение
// public class Task_3 {
//     public static void main(String[] args) {
//        System.out.println(palindrom("abcba")); 
//     }

//     public static boolean palindrom(String a) {
//         boolean result = false;
//         for (int i = 0; i < a.length(); i++){
//             char ch = a.charAt(i);
//             if (ch != a.charAt(a.length() - 1 - i)) {
//                 return result;
//             }
//             else{
//                 result = true;
//             }
//         }

//         return result;
        
//     }
    
// }


// Решение с семинара

public class Task_3 {
    public static void main(String[] args) {
        String s = "abcba";
        System.out.println(isPalidrome(s)); 
    }

    public static boolean isPalidrome(String str) {
        boolean result = true;
        int last = str.length();
        int mid = last/2;
        for (int i = 0; i < mid; i++) {
        if(str.charAt(i) != str.charAt(last - 1 - i)){
        return false;
        }
        }
        return result;
        }
    }