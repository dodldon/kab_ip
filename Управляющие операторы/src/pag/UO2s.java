package pag;

/**
 * Управляющие операторы,вложенные,это оператор if, который является целью
 * другого оператора if или еlsе<br>если цель false то вложения не выполняются
 */
public class UO2s {

    public static void main(String args[]) {
        int a = 1, b = 1;
//меняя условия целевого if, меняются условия выполнения других if
// если целевой tru, выполняется, если нет выполняется else и его if
//1
        if (a >2) {
            System.out.println("1 tru");
        } else {
            System.out.println("2 false");
            if (a == b) {
                System.out.println("3 tru");

            } else {
                System.out.println("1 false");
            }
        }
    }
}
