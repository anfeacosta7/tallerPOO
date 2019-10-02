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
public class Calculos {

    public double CalculArea(double radio) {
        return 4 * Math.PI * Math.pow(radio, 2);
    }

    public double volumenEsfera(double radio) {
        return 4 / 3 * Math.PI * Math.pow(radio, 3);
    }

}
