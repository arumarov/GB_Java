package Seminar_2;
// * Task_1

public class Task_1 {

    public static void main(String[] args) {
        String str1 = "aaabbcccdda";
        String str2 = " ";

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (ch != str2.charAt(str2.length() - 1)) {
                str2 += ch;
            }
        }
        System.out.println(str2); // str2 = abcda
    }
}