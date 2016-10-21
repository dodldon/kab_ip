
package javarus;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* Man и woman
 В методе main создай объект Man, занеси его ссылку в переменную man.
 Создай также объект Woman и занеси его ссылку в переменную woman.
 В man.wife занеси ссылку на новосозданный объект Woman.
 В woman.husband занеси ссылку на новосозданный объект Man.
 */
public class Solution {

    public static void main(String[] args) {
        Man man = new Man();
        Woman woman = new Woman();
        man.wife=woman;
        woman.husband=man;
    }

    public static class Man {

        public int age;
        public int height;
        public Woman wife;
    }

    public static class Woman {

        public int age;
        public int height;
        public Man husband;
    }
}
------------------------------------------------------
package javarus;

/* Прибавка к зарплате
 Реализуй метод public static void salary(int a).
 Метод должен увеличить переданное число на 100 и вывести на экран надпись: 
 «Твоя зарплата составляет: a долларов в месяц.»
 Где a - это число, которое увеличили на 100.
 Пример вывода на экран для а = 700:
 Твоя зарплата составляет: 800 долларов в месяц.
 */
public class Solution {

    public static void main(String[] args) {
        salary(700);
    }

    public static void salary(int a) {
        a = a + 100;
        System.out.println("Твоя зарплата составляет:" + a + " долларов в месяц.");
    }
}
-----------------------------------------------
package javarus;

/* Вызов методов
Подумайте, что делает программа.
По аналогии с методом printName(Student student), в метод main добавьте вызовы 
методов printAge(Student student) и printMoney(Student student)
*/
public class Solution
{
    public static void main(String[] args) {
        Student student = new Student();
        printName(student);
       printAge(student);
       printMoney(student);

    }

    public static void printName(Student student){
        System.out.println(student.name);
    }

    public static void printAge(Student student){
        System.out.println(student.age);
    }

    public static void printMoney(Student student){
        System.out.println(student.money);
    }


    public static class Student {
        String name = "Amigo";
        int age = 2;
        int money = 0;
    }
}

===================================================
package javarus;
/* Коты - это хорошо
Создать объект типа Cat 2 раза.
*/
public class Solution
{
    public static void main(String[] args)
    {
        Cat cat=new Cat();
        Cat cat1=new Cat();
    }

    public static class Cat
    {

    }
}
---------------------------------------------------
/* Три собаки - это сила
 Создать 3 объекта типа Dog (собака) и присвоить им имена "Max", "Bella", "Jack".
 */

public class Solution {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        dog1.name = "Max";
        dog2.name = "Bella";
        dog3.name = "Jack";

    }

    public static class Dog {

        public String name;
    }
}
--------------------------------------------------------
/* Минимум двух чисел
Написать функцию, которая возвращает минимум из двух чисел.
Подсказка:
Нужно написать тело существующей функции min и исправить возвращаемое значение.
*/
public class Solution
{
    public static int min(int a, int b)
    {
        int min;
        if(a<b)
            min=a;
        else
            min=b;
            return min;
    }

    public static void main(String[] args) 
    {
        System.out.println( min(12,33) );
        System.out.println( min(-20,0) );
        System.out.println( min(-10,-20) );
    }

}
--------------------------------------------------------------
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
-------------------------------------------------------------------------
/* Минимум трех чисел
Написать функцию, которая вычисляет минимум из трёх чисел.
Подсказка:
Нужно написать тело существующей функции min и исправить возвращаемое значение.
*/
public class Solution
{
    public static int min(int a, int b, int c)
    {
        
    int min;
     if (a<b & a<c)
      return a;
      if (b<a & b<c)
      return b;
      else    
      min = c;
      return min;
            
    }

    public static void main(String[] args) throws Exception
    {
        System.out.println( min(1,2,3) );
        System.out.println( min(-1,-2,-3) );
        System.out.println( min(3,5,3) );
        System.out.println( min(10,5,10) );
    }

}
-------------------------------------------------------------------------------------------
/* Минимум четырех чисел
 Написать функцию, которая вычисляет минимум из четырёх чисел.
 Функция min(a,b,c,d) должна использовать (вызывать) функцию min(a,b)
 Подсказка:
 Нужно написать тело обеих существующих функций min и исправить их возвращаемые значения.
 */
public class Solution {

    public static int min(int a, int b, int c, int d) {
        int min;
     if (a<b & a<c & a<d)
      return a;
      if (b<a & b<c & b<d)
      return b;
      if (c<a & c<b & c<d)
      return c;
      else    
      min = d;
      return min;

    }

    public static int min(int a, int b) {
        int min;
        if(a<b)
            min=a;
        else
            min=b;
            return min;

    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-20, -10, -30, -40));
        System.out.println(min(-20, -10, -30, 40));
    }
}
---------------------------------------------------------------------
/* Дублирование строки
Написать функцию, которая выводит переданную строку на экран три раза, каждый раз с новой строки.
*/
public class Solution
{
    public static void print3(String s)
    {
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);

    }

    public static void main(String[] args)
    {
        print3("I love you!");
    }
}
-----------------------------------------------
/* Вывод текста на экран
Написать функцию, которая выводит переданную строку (слово) на экран три раза, 
но в одной строке.Слова должны быть разделены пробелом и не должны сливаться в одно.
*/
public class Solution
{
    public static void print3(String s)
    {
       System.out.print(s+" "+s+" "+s +"\n"); 
    }
    public static void main(String[] args)
    {
        print3("window");//s
        print3("file");//s
    }
}
--------------------------------------------------------
/* Реализация метода
Реализуйте метод public static void div(int a, int b).
Метод должен делить первое число на второе, и выводить на экран результат деления а / b.
*/
public class Solution
{
    public static void main(String[] args) {
        div(6,3);
        div(10,6);
        div(2,4);
    }

    public static void div(int a, int b){
        System.out.println(a/b);
    }
}
---------------------------------------------------------
/* Реализация метода
Добавьте метод public static void printString(String s) который будет выводить 
переданную строку на экран.
*/
public class Solution
{
    public static void printString(String s){
        System.out.println(s);
        
    }

    public static void main(String[] args) {
        printString("Hello Amigo!");
    }
}
-----------------------------------------------------------------
/* Конвертер валют
 Реализуйте метод convertEurToUsd, переводящий евро в доллары по заданному курсу.
 Вызовите его дважды в методе main с любыми параметрами. Результаты выведите на 
 экран, каждый раз с новой строки.
 Подсказка:
 Расчет выполняется по формуле: долларСША = евро * курс
 */
public class Solution {

    public static void main(String[] args) {
       System.out.println(convertEurToUsd(1,1.223));
       System.out.println(convertEurToUsd(1,1.223));
    }

    public static double convertEurToUsd(int eur, double course) {
        return  eur * course;
    }
}
-----------------------------------------------------------

/* Экранирование символов
 Про экранирование символов в Java читайте в дополнительном материале к лекции.
 Вывести на экран следующий текст - две строки:

 It's Windows path: "C:\Program Files\Java\jdk1.7.0\bin"
 It's Java string: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println("It's Windows path: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"");
        System.out.println("It's Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk1.7.0\\\\bin\\\"");

    }
}
-------------------------------------------
/* Изучаем японский
Выведи на экран 日本語
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println("日本語");
    }
}
--------------------------------------------------------------------------------
* Как захватить мир
 Ввести с клавиатуры число и имя, вывести на экран строку:
 «имя» захватит мир через «число» лет. Му-ха-ха!
 Пример: Вася захватит мир через 8 лет. Му-ха-ха!

 Последовательность вводимых данных имеет большое значение.
 */

import java.io.*;

public class Solution {

    public static void main(String[] args) throws Exception {

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        
        String sAge= bufferedReader.readLine();
        String name = bufferedReader.readLine();
        int nAge = Integer.parseInt(sAge);
       
       System.out.println(name +" захватит мир через "+ sAge + " лет. Му-ха-ха!");
    }
}
--------------------------------------------------------------------------------
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
--------------------------------------------------------------------------
