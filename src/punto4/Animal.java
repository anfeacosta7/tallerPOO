/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto4;

import javax.swing.JOptionPane;


public class Animal {

    private String nom_especie;
    private String tipoAnimal;
    
    
    // constructores

    public Animal() {
    }

    public Animal(String nom_especie, String tipoAnimal) {
        this.nom_especie = nom_especie;
        this.tipoAnimal = tipoAnimal;
    }
    
    // set y get

    public String getNom_especie() {
        return nom_especie;
    }

    public void setNom_especie(String nom_especie) {
        this.nom_especie = nom_especie;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }
    
    public void alimentacion () {
        JOptionPane.showMessageDialog(null, "Cualquier cosa");
    }


}
