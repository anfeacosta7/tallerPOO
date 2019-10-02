/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto4;

import javax.swing.JOptionPane;


public class Ave extends Animal {
    
    boolean plumas;
    String pico;

    // constructores

    public Ave() {
    }

    public Ave(boolean plumas, String pico) {
        this.plumas = plumas;
        this.pico = pico;
    }

    public Ave(boolean plumas, String pico, String nom_especie, String tipoAnimal) {
        super(nom_especie, tipoAnimal);
        this.plumas = plumas;
        this.pico = pico;
    }
    
    // set get

    public boolean isPlumas() {
        return plumas;
    }

    public void setPlumas(boolean plumas) {
        this.plumas = plumas;
    }

    public String getPico() {
        return pico;
    }

    public void setPico(String pico) {
        this.pico = pico;
    }
    
    // metodos
    
    @Override
    public void alimentacion () {
        JOptionPane.showMessageDialog(null, "Las aves acostumbran a comer gusanos o maiz");
    }
}
