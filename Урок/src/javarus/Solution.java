package javarus;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
 */
import java.io.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
    
        if (a > b && a > c) {
            //m = n;
            System.out.println(a + "" + b + "" + c);
        }
        if (a > c && a > b) {
            System.out.println(a + "" + c + "" + b);
        }
        if (b > a && b > c) {
            System.out.println(b + "" + a + "" + c);
        }
        if (b > c && b > a) {
            System.out.println(b + "" + c + "" + a);
        }
        if (c > a && c < b) {
            System.out.println(c + "" + a + "" + b);

        }
        if (c > b && c < a) {
            System.out.println(c + "" + b + "" + a);
        }

    }
}
