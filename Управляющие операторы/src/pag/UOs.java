package pag;

/**
 * Управляющие операторы,оператор if, возвращающет логическое значение типа
 * boolean<br>if(условие)<br>оператор1<br>else<br>оператор2<br>если(true),
 * выполняетса операторl,если(false)оператор2 если есть<br>Только один
 * оператор может следовать за if или else,оператор еlsе всегда связан с
 * ближайшим оператором if.
 */
public class UOs {

    public static void main(String[] args) {
        int x = 10, y = 20;
        boolean b = true, bb = false;

        if (x < y) {
            System.out.println("tru");
        } else {
            System.out.println("false");
        }
        x = x * 2;//изменим x

        if (x < y) {
            System.out.println("tru");
        } else {
            System.out.println("false");
        }
        if (b == bb) {
            System.out.println("tru");
        } else {
            System.out.println("false");
        }

    }
}
