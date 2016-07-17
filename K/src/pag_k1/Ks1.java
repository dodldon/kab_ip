package pag_k1;

public class Ks1 {

    public static void main(String[] args) {
        //создание обьекта
        K1 ob = new K1();//передача аргумента обьекту 
        K1 ob1 = new K1(2);
        K1 ob2 = new K1(3,4);
        System.out.println("конструктор без параметров i=" + ob.i);
        System.out.println("конструктор с параметрами i=" + ob1.i);
        System.out.println("конструктор с параметрами скрывает переменные i=" + ob2.i+" x="+ob2.x);
       

    }
}
