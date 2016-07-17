package pag1;

/**
 * Управляющие операторы,оператор for;<br> for(иницализация;условие;итерация);
 *
 */
public class UO1s {

    public static void main(String args[]) {
        int x, y;
        y = 20;
        for (int i = 0; i < 10; i++) {
            System.out.print("i=" + i + ";");
        }
        System.out.println();
        System.out.println("{} кодовый блок явл.адресатом для for");
        for (x = 0; x < 10; x++) {//начало блока
            System.out.println("x =" + x);
            System.out.println("y =" + y);
            y = y - 2;

        }//конец блока
    }
}
