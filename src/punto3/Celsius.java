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
public class Celsius implements temperatura  {

    
    public void grados() {
       
        Scanner leer =new Scanner(System.in);
        double resultado, c = 6;
        
         c = (c*1.8+32); 
         System.out.println("el resultado en farenhaint es"+c);

   
    }
}
