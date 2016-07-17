
package pag2;

import pag.*;
//вычисления обьёма и куба передаваемый обьекту конструктора

public class Box2 {
    double width; //высота
    double height; //широта
   /*
    //конструктор локалных иницализаций
    Box2(double w,double h){
        width=w;
        height=h;
       
    }
    */
    //конструктор с парамтрами обьекта
    Box2(Box2 ob){
        width=ob.width;
        height=ob.height;
        
    }
  
    //обьёма
    double volume(){
        return width*height;
    }
}
