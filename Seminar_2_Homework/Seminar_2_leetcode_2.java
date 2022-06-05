package Seminar_2_Homework;

public class Seminar_2_leetcode_2 {
    public static void main(String[] args) {
        System.out.println(mergeAlternately("ab", "pqrs"));
      }
    
    public static String mergeAlternately(String word1, String word2) {
        String merged = "";
        int min = word1.length() < word2.length() ? word1.length() : word2.length();
        String maxString = word1.length() < word2.length() ? word2 : word1;
        for (int i = 0; i < min; i++) {
          char ch1 = word1.charAt(i);
          char ch2 = word2.charAt(i);
          merged = merged + ch1 + ch2;
        }
        return merged + maxString.substring(min, maxString.length());

    }
}