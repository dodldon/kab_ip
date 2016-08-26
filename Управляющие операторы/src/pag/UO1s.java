package pag;

/**
 * Управляющие операторы,вложенные,это оператор if, который является целью
 * другого оператора if или еlsе<br>если цель false то вложения не выполняются
 */
public class UO1s {

    public static void main(String args[]) {
        int a = 1, b = 1;
//меняя условия целевого if, меняем условия выполнения других
        if (a < 2) //1
        {
            System.out.println("a=tru");

            if (b > a) //2
            {
                System.out.println("2 tru");
            } else {
                System.out.println("2 false");
            }
            if (a == b) //3
            {
                System.out.println("3 tru");
            } else {
                System.out.println("3 false");
            }
        } else {
            System.out.println("1 false");
        }
    }

}
