/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto4;

import javax.swing.JOptionPane;


public class main {

    float largo, anch;

    public void llenar_acuatico() {

        Acuatico nemo = new Acuatico(3, "Pequeño", "Pez Payaso", "Acuatico");
        
        JOptionPane.showMessageDialog(null, "INFORMACION DEL DINOSAURIO\n"
                + "Nombre: " + nemo.getNom_especie()+ "\n"
                + "Tipo: " + nemo.getTipoAnimal()+ "\n"
                + "Aletas: " + nemo.getNumAletas()+ "\n"
                + "Tamaño: " + nemo.getTamaño()+ "\n");
        nemo.alimentacion();

    }

    public void llenar_terrestre() {

        Terrestre osoPolar = new Terrestre("Nevado", 4, "Oso Polar", "Terrestre");
        
        JOptionPane.showMessageDialog(null, "INFORMACION DEL DINOSAURIO\n"
                + "Nombre: " + osoPolar.getNom_especie()+ "\n"
                + "Tipo: " + osoPolar.getTipoAnimal()+ "\n"
                + "Clima: " + osoPolar.getClima()+ "\n"
                + "Numero de patas: " + osoPolar.getNumPatas()+ "\n");
        osoPolar.alimentacion();

    }

    public void llenar_volador() {

        Ave aguila = new Ave(true, "Curvo", "Aguila", "Volador");
        
        JOptionPane.showMessageDialog(null, "INFORMACION DEL DINOSAURIO\n"
                + "Nombre: " + aguila.getNom_especie()+ "\n"
                + "Tipo: " + aguila.getTipoAnimal()+ "\n"
                + "Plumas: " + aguila.isPlumas()+ "\n"
                + "Forma del pico: " + aguila.getPico()+ "\n");
        aguila.alimentacion();

    }

    public static void main(String[] args) {

        main m = new main();

        String opcion = JOptionPane.showInputDialog(null, "Elija una opcio\n"
                + "1. Animal Terrestre\n"
                + "2. Animal Volador\n"
                + "3. Animal Acuatico\n"
                + "4. Salir\n");

        int op = Integer.parseInt(opcion);

        do {

            op = Integer.parseInt(opcion);

            switch (op) {
                case 1:
                    m.llenar_terrestre();
                    break;
                case 2:
                    m.llenar_volador();
                    break;
                case 3:
                    m.llenar_acuatico();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Goodbye");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Valor no valido");
                    break;
            }
            
            opcion = JOptionPane.showInputDialog(null, "Elija una opcio\n"
                    + "1. Animal Terrestre\n"
                    + "2. Animal Volador\n"
                    + "3. Animal Acuatico\n"
                    + "4. Salir\n");

            

        } while (op != 4);

    }
}
