/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto3;

/**
 *
 * @author LeidyAl
 */
public class Main {
    public static void main(String[] args) {
        Celsius c = new Celsius();
        Farenheint f= new Farenheint ();
        Kelvin k = new Kelvin();
        temperatura t = new temperatura() {
           
            public void grados() {
                
            }
        } ;
        
        c.grados();
        f.grados();
        k.grados();
    }
    
}
