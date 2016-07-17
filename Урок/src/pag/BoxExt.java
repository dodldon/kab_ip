
package pag;
//класс наследник
public class BoxExt extends Box {
    double weight;//вес
    //конструктор наследует конструктор суперкласса
    BoxExt(double w,double h,double d,double m){
        width=w;
        height=h;
        depth=d;
        weight=m;
    }
    
}
