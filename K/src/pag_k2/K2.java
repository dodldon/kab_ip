package pag_k2;
/**Конструктор,
 * возвращение обьекта как параметр конструктора.
*/

public class K2 {

    int i;

    K2(K2 o) {
        i = o.i;
        //System.out.print(o);
    }
}
