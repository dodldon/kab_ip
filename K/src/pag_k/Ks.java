package pag_k;

public class Ks {

    public static void main(String[] args) {
        //создание обьекта
        K ob = new K();//передача аргумента обьекту 
        ob.x = 1; //инициализирую x как экземпляр переменной класса обьекта ob

        System.out.println("Для числовых/ссылочных инициализирует null = " + ob.i);
        System.out.println("для логических инициализирует = " + ob.b);
        System.out.println("инициализирует x= " + ob.x);

    }
}
