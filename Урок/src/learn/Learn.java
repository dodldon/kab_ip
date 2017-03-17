package learn;

 //Выполненые задания
 

public class Learn {
/*
 Man и woman
 В методе main создай объект Man, занеси его ссылку в переменную man.
 Создай также объект Woman и занеси его ссылку в переменную woman.
 В man.wife занеси ссылку на новосозданный объект Woman.
 В woman.husband занеси ссылку на новосозданный объект Man.
 
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


/* Вызов методов
Подумайте, что делает программа.
По аналогии с методом printName(Student student), в метод main добавьте вызовы 
методов printAge(Student student) и printMoney(Student student)

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
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int n1 = Integer.parseInt(br.readLine());
        int n2 = Integer.parseInt(br.readLine());
        int n3 = Integer.parseInt(br.readLine());

        if (n > n1 & n > n2 & n > n3) {
            System.out.println(n);
        } else if (n1 > n & n1 > n2 & n1 > n3) {
            System.out.println(n1);
        } else if (n2 > n & n2 > n1 & n2 > n3) {
            System.out.println(n2);
        } else if (n3 > n & n3 > n1 & n3 > n2) {
            System.out.println(n3);

        }
    }
}
  
------------------------------------------
<<<<<<< OURS
    /* 10 чисел наоборот
Вывести на экран числа от 1 до 10 используя цикл while.
    int a = 0;
        while (a < 10) {
            a++;
            System.out.println(a);

        }

    }
}
--------------------------------------------
    /* 10 чисел наоборот
Вывести на экран числа от 10 до 1 используя цикл while.
public class Solution
{
    public static void main(String[] args) throws Exception
    {
       int a=11;
       while(a>1){
           a--;
           System.out.println(a);
       }

    }
}
-----------------------------------------
    import java.io.*;
/* Хорошего не бывает много
 Ввести с клавиатуры строку и число N.
 Вывести на экран строку N раз используя цикл while.
 Пример ввода:
 абв
 2
 Пример вывода:
 абв
 абв
public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(br.readLine());
        int m = 0;
        while (n > m) {
            m++;
            System.out.println(s);
        }

    }
}
--------------------------------------------------------------------------------
    /* S-квадрат
 Вывести на экран квадрат из 10х10 букв S используя цикл while.
 Буквы в каждой строке не разделять.
 
public class Solution {

    public static void main(String[] args) throws Exception {
        int i = 0;
        while (i < 10) {
            i++;
            System.out.println("SSSSSSSSSS");
        }
    }
}
    -----------------------------------------------
    /* Таблица умножения
 Вывести на экран таблицу умножения 10х10 используя цикл while.
 Числа разделить пробелом.
 1 2 3 4 5 6 7 8 9 10
 2 4 6 8 10 12 14 16 18 20
 
public class Solution {

    public static void main(String[] args) throws Exception {
        int i = 0;
        while (i < 1) {
            i++;
            System.out.println("1 2 3 4 5 6 7 8 9 10");
            System.out.println("2 4 6 8 10 12 14 16 18 20");
            System.out.println("3 6 9 12 15 18 21 24 27 30");
            System.out.println("4 8 12 16 20 24 28 32 36 40");
            System.out.println("5 10 15 20 25 30 35 40 45 50");
            System.out.println("6 12 18 24 30 36 42 48 54 60");
            System.out.println("7 14 21 28 35 42 49 56 63 70");
            System.out.println("8 16 24 32 40 48 56 64 72 80");
            System.out.println("9 18 27 36 45 54 63 72 81 90");
            System.out.println("10 20 30 40 50 60 70 80 90 100");

        }
    }
}
/* Четные числа
Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
Через пробел либо с новой строки.
    
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        for(int i=2;i<=100;i=i+2)
            System.out.println(i);

    }
}
/* Рисуем прямоугольник
 Ввести с клавиатуры два числа m и n.
 Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
 Пример: m=2, n=4
 8888
 8888
public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int i,x;
        for (i = 1; i <= m; i++) {
            for (x = 2; x <= n; x++) {
                System.out.print("8");
            }

            System.out.println("8");
        }
    }
}
--------------------------------------------------------------------
    /* Рисуем треугольник
 Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок 
 со сторонами 10 и 10.
 Пример:
 8
 88
 888
 ...
public class Solution {

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 1; i++) {
            
            System.out.println("8");
            System.out.println("88");
            System.out.println("888");
            System.out.println("8888");
            System.out.println("88888");
            System.out.println("888888");
            System.out.println("8888888");
            System.out.println("88888888");
            System.out.println("888888888");
            System.out.println("8888888888");

        }
    }
}
/* Рисуем линии
 Используя цикл for вывести на экран:
 - горизонтальную линию из 10 восьмёрок
 - вертикальную линию из 10 восьмёрок.
public class Solution {

    public static void main(String[] args) throws Exception {
        int x;
        for (x = 1; x <= 1; x++) {
            System.out.print("888888888");
            //System.out.println("8");
            {
                for (x = 0; x <= 10; x++) {
                    System.out.println("8");
                }
            }
        }

    }
}
/*Все любят Мамбу 
 Ввести с клавиатуры имя и используя цикл 
 for 10 раз вывести: 
 [имя любит меня.] 
 Пример текста: 
 Света любит меня. 
 Света любит меня.
 
public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        for (int n = 0; n < 10; n++) {
            System.out.println(s + " любит меня.");
            
        }
    }
}
/* 
Выводим квадрат числа

public class Solution {
    public static void main(String[] args) {
        int a;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        int n=Integer.parseInt(s);
        n=a*a;
        
    }
}
    
Подойдет только 20


public class Solution {
    public static int a = 1;
    public static int b = 3;
    public static int c = 9;
    public static int d = 27;

    public static void main(String[] args) {

        int result = - a + b-c +d;

        System.out.println(result);
    }
}
    
Белеет парус одинокий


public class Solution {
    public static void main(String[] args) {
        System.out.println("Белеет парус одинокий");
        System.out.println("В тумане моря голубом!...");
        System.out.println("Что ищет он в стране далекой?");
        

        System.out.println("Что кинул он в краю родном?..");
    }
}
    
Выводим квадрат числа
Напиши программу, которая считывает с клавиатуры целое число a и выводит квадрат 
этого числа (a * a).
Внимательно просмотри лекцию. Для считывания данных с клавиатуры используй метод 
nextInt() класса Scanner.

public class Solution {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        a = sc.nextInt();
        System.out.println(a * a);
    }
}
    
Реализуй метод printCircleLength. Параметр метода — радиус окружности. 
Метод должен вывести на экран длину окружности, 
рассчитанной по формуле: L = 2 * Pi * radius.
Результат — дробное число (тип double).
В качестве значения Pi используй значение 3.14.
 
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

Метод convertCelsiumToFahrenheit(int celsium) принимает значение в градусах Цельсия. 
Метод должен переводить температуру и возвращать значение в градусах Фаренгейта.
Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношением:
TC = (TF – 32) * 5/9
Пример:
В метод convertCelsiumToFahrenheit на вход подается значение 40.
Пример вывода:
104.0
 
public class Solution {

    public static void main(String[] args) {
        System.out.println(convertCelsiumToFahrenheit(40));
    }

    public static double convertCelsiumToFahrenheit(int celsium) {
        double f;
        f = (double) celsium;
        double c = 9*(f / 5) + 32;
        return c;

    }
}

Да хоть на Луну!
 
public class Solution {

    public static void main(String[] args) {
        System.out.println(getWeight(888));
    }

    public static double getWeight(int weightEarth) {
        double w=weightEarth;
        return w * 17 / 100;
    }
}
    
Набираем воду в бассейн


public class Solution {
    public static void main(String[] args) {
        System.out.println(getVolume(25, 5, 2));
    }

    public static long getVolume(int a, int b, int c) {
        long vol=(a*b*c)*1000;
        return vol;
    }
}
   
Полнометражная картина

public class Solution {
    public static void main(String[] args) {
        System.out.println(getMetreFromCentimetre(243));
    }

    public static int getMetreFromCentimetre(int centimetre) {
      return centimetre /100;
       //return s;
    }
}
    
Не думать о секундах…


public class Solution {
    public static void main(String[] args) {
        System.out.println(getCountSecondsPassedInCurrentHour(12345));
    }

    public static int getCountSecondsPassedInCurrentHour(int seconds) {
        int a=seconds/3600;//часы
        int b=a*3600;//секунд
        return seconds-b;
    }
}

Сумма цифр трехзначного числа
=15
 
public class Solution {

    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int a = number % 10;
        int b = number / 10 % 10;
        int c = number / 100 % 10;
        int i = a + b + c;
        return i;
    }
}

Достойная оплата труда
 
public class Solution {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
    /*
Ввести с клавиатуры три числа, вывести на экран среднее из них.
Т.е. не самое большое и не самое маленькое.
Если все числа равны, вивести любое из них.
 
import java.io.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        if (b <= a && a <= c || c <= a && a <= b) {
            System.out.println(a);
        } else if (a <= b && b <= c || c <= b && b <= a) {
            System.out.println(b);
        } else if (a <= c && c <= b || b <= c && c <= a) {
            System.out.println(c);
        }

    }
}
/* 
Вводить с клавиатуры числа и считать их сумму.
Если пользователь ввел -1, вывести на экран сумму и завершить программу.
-1 должно учитываться в сумме.
public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int n = Integer.parseInt(br.readLine());
            int n1 = Integer.parseInt(br.readLine());
            if (n==-1 | n1 == -1) {
                break;
            }
            System.out.println(n + n1);
        }
    }
}
    /*Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name.
Я родился d.m.y»
*
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
String n = reader.readLine();
int y = Integer.parseInt(reader.readLine());
int m = Integer.parseInt(reader.readLine());
int d = Integer.parseInt(reader.readLine());
System.out.println("Меня зовут "+ n+".");
System.out.println("Я родился "+d+"."+m+"."+y); 
    }
}
    /* 
Вводить с клавиатуры числа и считать их сумму.
Если пользователь ввел -1, вывести на экран сумму и завершить программу.
-1 должно учитываться в сумме.
 
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
    /* 
Создать класс Cat. У кота должно быть 
имя (name, String), 
возраст (age, int), 
вес (weight, int), 
сила (strength, int).
    
public class Cat {

    String name;
    int age;
    int weight;
    int strength;

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "N";
        cat.age = 1;
        cat.weight = 2;
        cat.strength = 3;
    }
}

*/
}
