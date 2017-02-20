package javarus;

/* 
Реализуй метод printCircleLength. Параметр метода — радиус окружности. 
Метод должен вывести на экран длину окружности, 
рассчитанной по формуле: L = 2 * Pi * radius.
Результат — дробное число (тип double).
В качестве значения Pi используй значение 3.14.
 */
public class Solution {

    public static void main(String[] args) {
        printCircleLength(5);
    }
    //static double Pi = 3.14;
    //static double L;

    public static void printCircleLength(int radius) {
        double Pi = 3.14;
        double L;
        System.out.println(L = 2 * Pi * radius);
    }
}
