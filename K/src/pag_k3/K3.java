package pag_k3;
/**Конструкторы,
 * пергрузка конструкторов.
 */
public class K3 {

    int wed;
   int hei;
    int dep;
//передача локальных параметров экземплярам переменных класса это ob
    K3(int w, int h, int d) {
        wed = w;
        hei = h;
        dep = d;
       System.out.println("Конструктор с тремя локальными параметрами w=" + wed +";"+"h="+hei +"d="+dep);
    }
    //передача параметров как обьектов это ob1
    K3(K3 o) {
        wed =o.wed;
        hei = o.hei;
        dep = o.dep;
         System.out.println("Конструктор с параметром как обьект "+o);
    }
    //это ob2
    K3(int l) {
        wed = hei = dep = l;
        System.out.println(l);
    }
    //обьём
    int vol(){
        return wed*hei*dep;
    }
}

