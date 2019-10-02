/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto1;

/**
 *
 * @author Acosta
 */
public class Principal {
    
    public static void main(String[] args) {
        
        hola();
    }
    
    public static void hola() {
        double area, volumen;
        Calculos c = new Calculos();
        area=  c.CalculArea(5);
        volumen= c.volumenEsfera(5);
        System.out.println("area:" +area +"\npromedio:" +volumen);
       
    }
}
