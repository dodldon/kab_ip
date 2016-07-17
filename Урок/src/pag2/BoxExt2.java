
package pag2;
//класс наследник

import pag.*;
//класс наследник и super в качестве наследника конструктора
public class BoxExt2 extends Box2 {
    double depth;//глубина
    
    BoxExt2(BoxExt2 ob){
        super(ob);
        depth=ob.depth;
    }
    double volume(){
        return width*height*depth;
    }
    
}
