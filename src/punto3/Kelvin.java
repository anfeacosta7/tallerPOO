/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto3;

import java.util.Scanner;

/**
 *
 * @author LeidyAl
 */
public class Kelvin implements temperatura  {

    private String k;
    
    public Kelvin(){}

    
    public void grados() {
        
        double resul, k = 5;
       
        k = (k - 32 ) * 5 / 9 + 273;
        System.out.println("el resultado en kelvin es"+k);
    }
   

  
    
}
