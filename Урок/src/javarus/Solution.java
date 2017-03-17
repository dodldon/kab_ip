package javarus;

/* 
Вводить с клавиатуры числа и считать их сумму.
Если пользователь ввел -1, вывести на экран сумму и завершить программу.
-1 должно учитываться в сумме.
 */
import java.io.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = 0;
        int s = 0;
        while (t != -1) {
            t = Integer.parseInt(br.readLine());
            s += t;
       
        }
        System.out.println(s);
    }
}
                
