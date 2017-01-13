package javarus;

/* Три числа
 Ввести с клавиатуры три целых числа. 
 Одно из чисел отлично от двух других, равных между собой.
 Вывести на экран порядковый номер числа, отличного от остальных.
 Пример для чисел 4 6 6:
 1
 Пример для чисел 6 6 3:
 3
 */
import java.io.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int n1 = Integer.parseInt(br.readLine());
        int n2 = Integer.parseInt(br.readLine());

        if (n == n1 & n!= n2) {
            System.out.println("3");
        } else if (n1 == n2 & n1 != n) {
            System.out.println("1");
        } else if (n == n2 & n != n1) {
            System.out.println("2");
        }
    }
}
