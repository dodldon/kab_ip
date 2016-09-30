package pag;

/**
 * Управляющие операторы,многоступенчатая конструкция if-else-if;
 * <br>if(условие)<br>
 * оператор;<br>else if (условие)<br>оператор;<br> else if(условие)<br>
 * оператор;<br>...else оператор;<br>
 *
 */
public class UO3s {

    public static void main(String args[]) {

        int a = 1, b = 2;
        for(int i=0;i<2;i++){
        if (a > b) {
            System.out.println("1");
        } else {
            System.out.println("2");
            if (a < b) {
                System.out.println("3");
            } else {
                System.out.println("4");
                if (a == b) {
                    System.out.println("5");
                }
            }
        }
    }
//else{System.out.println("");
}
}

