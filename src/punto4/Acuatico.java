/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto4;

import javax.swing.JOptionPane;


public class Acuatico extends Animal{
    
    int numAletas;
    String tamaño;
    
    
    // constructores

    public Acuatico() {
    }

    public Acuatico(int numAletas, String tamaño) {
        this.numAletas = numAletas;
        this.tamaño = tamaño;
    }

    public Acuatico(int numAletas, String tamaño, String nom_especie, String tipoAnimal) {
        super(nom_especie, tipoAnimal);
        this.numAletas = numAletas;
        this.tamaño = tamaño;
    }
    
    // set y get

    public int getNumAletas() {
        return numAletas;
    }

    public void setNumAletas(int numAletas) {
        this.numAletas = numAletas;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    // metodos
    
    @Override
    public void alimentacion () {
        JOptionPane.showMessageDialog(null, "Los peces acostumbran a comer plangton u otros peces");
    }
        
}
