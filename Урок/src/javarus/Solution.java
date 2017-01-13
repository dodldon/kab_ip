package javarus;

/* 
 Ввести с клавиатуры имя и возраст. 
 Если возраст больше 20 вывести надпись «И 18-ти достаточно».
 */
import java.io.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String s1 = br.readLine();
        int n = Integer.parseInt(s1);
 
        if (n > 20) {
            System.out.println(s);
            System.out.println("И 18-ти достаточно");
        }

    }
}
