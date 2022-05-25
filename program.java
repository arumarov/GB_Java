public class program {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int min = a < b ? a : b; // То есть если условие a<b выполняется, будет выполнена
        // та часть, которая находится после ? и до :, если a<b не выполняется,
        // то вернется значение между : и ;
        System.out.println(min);
    }
}