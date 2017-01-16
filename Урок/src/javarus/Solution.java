package javarus;

/* Максимум двух чисел
 Написать функцию, которая вычисляет максимум из двух чисел.
 Подсказка:
 Нужно написать тело существующей функции max и исправить возвращаемое значение.
 */
public class Solution {

    public static int max(int a, int b) {
        int max;
        if (a > b) 
            max = a;
         else 
            max = b;
        
        return max;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(max(10, 20));
        System.out.println(max(-10, -20));
        System.out.println(max(-100, 0));
    }

}