
package punto3;

import java.util.Scanner;

/**
 *
 * @author LeidyAl
 */
public class Farenheint  implements temperatura{
    
    public Farenheint(){
        
        
    
}

    
    @Override
    public void grados() {
        Scanner leer =new Scanner(System.in);
        double result, f = 7;
        
         f= (f - 32 ) * 5 / 9;
         System.out.println("el resultado en celsius es"+f);
    }

    
   
    

    
}
