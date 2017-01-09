package javarus;
/* Зарплата через 5 лет
Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись:
«Имя» получает «число1» через «число2» лет.
Пример: Коля получает 3000 через 5 лет.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        InputStream inputStraem=System.in;
        Reader inputStreamReader=new InputStreamReader (inputStraem);
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(inputStraem));
        int a;
       String name=bufferedReader.readLine();
       String nam=bufferedReader.readLine();
       String na=bufferedReader.readLine();
       int i=Integer.parseInt(nam);
       int x=Integer.parseInt(na);
       System.out.println(name + " получает "+i+" через "+x+" лет");

    }
}