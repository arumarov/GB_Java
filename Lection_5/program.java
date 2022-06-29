// package Lection_5;

// public class program {
//     static double distance(int x1, int y1, int x2, int y2) {
//         return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
//     }

//     static double distance(Point2D a, Point2D b) {
//         return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
//     }

//     public static void main(String[] args) {
//         Point2D a = new Point2D(0, 2); //описываем аргументы таким способом
//         System.out.println(a.toString());

//         Point2D b = new Point2D(10); // создание экземпляра класса с x и y = 10
//         // при распечатке a и b  видим чепуху: Lection_5.Point2D@5acf9800
//         // это значит, что по умолчанию у класса point2D есть свое поведение,
//         // отвечающее за преобразование этой точки в строку
//         // значение по умолчанию определяется методом toString

//         System.out.println(b.toString());
//         System.out.println(distance(a, b));
        
//     }
// }
