package pag;
//исполнение кода
public class BoxS {

    public static void main(String[] args) {
        BoxExt mybox1 = new BoxExt(10, 20, 15, 34.3);
        System.out.println("Обьём mailbox1 = " + mybox1.volume());
        System.out.println("Вес mailbox1   = " + mybox1.weight);
        System.out.println();

    }

}
