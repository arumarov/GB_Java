package Seminar_1_Homework;

public class Seminar_2_Homework {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
        
    }

    public static int subtractProductAndSum(int n) {
        int b = 0;
        int sum = 0;
        int prod = 1;
        while (n>0){
            b = n%10;
            System.out.println(b);
            sum = sum + b;
            prod = prod * b;
            n = n/10;
        }
        return prod-sum;
    }
}
