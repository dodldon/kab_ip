
package pag;

/**
 * Управляющие операторы,оператор if
 * if(условие) оператор
 */
public class UOs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x,y;
        x=10;
        y=20;
        if(x<y)
            System.out.println("x="+x+"; y="+y);
        x=x*2;
        if(x==y) System.out.println("x*2 = "+x);
        x=x*2;
        if(x>y) System.out.println("x*2 = "+x);
        if(x==y) System.out.println("x==y = "+x);
        else{
            System.out.println("x!y ");
        }
        
    }
}
        
    
    

