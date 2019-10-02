/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto4;

import javax.swing.JOptionPane;


public class Terrestre extends Animal {
    
    String clima;
    int numPatas;
    
    // constructores

    public Terrestre() {
    }

    public Terrestre(String clima, int numPatas) {
        this.clima = clima;
        this.numPatas = numPatas;
    }

    public Terrestre(String clima, int numPatas, String nom_especie, String tipoAnimal) {
        super(nom_especie, tipoAnimal);
        this.clima = clima;
        this.numPatas = numPatas;
    }
   
    // set get

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }
    
    // metodos
    
    @Override
    public void alimentacion () {
        JOptionPane.showMessageDialog(null, "Loas animales terrestres normalmente comen de todo");
    }

    
}
