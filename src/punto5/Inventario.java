/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto5;

import javax.swing.JOptionPane;

/**
 *
 * @author Acosta
 */
public class Inventario {
    
    //Atributos
    private String masVendido;
    private String menosVendido;
    private double ingresos;

    //Constructores
    public Inventario() {
    }

    public Inventario(String masVendido, String menosVendido, double ingresos) {
        this.masVendido = masVendido;
        this.menosVendido = menosVendido;
        this.ingresos = ingresos;
    }

    //Encapsulamiento (get & set)
    
    public String getMasVendido() {
        return masVendido;
    }

    public void setMasVendido(String masVendido) {
        this.masVendido = masVendido;
    }

    public String getMenosVendido() {
        return menosVendido;
    }

    public void setMenosVendido(String menosVendido) {
        this.menosVendido = menosVendido;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    //Operaciones
    public Producto vender(Producto p) {

        double valorIva, costoTotal;

        if (p.getCantidad() > 0) {

            valorIva = (p.getIva() * p.getPrecio()) / 100;

            costoTotal = valorIva + p.getPrecio();

            ingresos = ingresos + costoTotal;

            p.setVentas(p.getVentas() + 1);

            p.setCantidad(p.getCantidad() - 1);
        } else {
            JOptionPane.showMessageDialog(null, "No hay existencia de este producto\nSolicite el pedido.");
        }

        return p;
    }

    public Producto comprar(Producto p) {

        if (p.getPrecio() <= ingresos) {

            ingresos = ingresos - p.getPrecio();

            p.setCantidad(p.getCantidad() + 1);

        } else {
            JOptionPane.showMessageDialog(null, "No hay fondos suficientes para realizar el pedido");
        }

        return p;
    }
    
    public int masVendido (Producto p1, Producto p2, Producto p3, Producto p4) {
        
        if (p1.getVentas()>p2.getVentas() && p1.getVentas()>p3.getVentas() && p1.getVentas()>p4.getVentas()) {
            return 1;
        } else if (p2.getVentas()>p1.getVentas() && p2.getVentas()>p3.getVentas() && p2.getVentas()>p4.getVentas()) {
            return 2;
        } else if (p3.getVentas()>p1.getVentas() && p3.getVentas()>p2.getVentas() && p3.getVentas()>p4.getVentas()) {
            return 3;
        } else if (p4.getVentas()>p1.getVentas() && p4.getVentas()>p2.getVentas() && p4.getVentas()>p3.getVentas()) {
            return 4;
        }else {
            return 0;
        }
        
    }
    
    public int menosVendido (Producto p1, Producto p2, Producto p3, Producto p4) {
        
        if (p1.getVentas()<p2.getVentas() && p1.getVentas()<p3.getVentas() && p1.getVentas()<p4.getVentas()) {
            return 1;
        } else if (p2.getVentas()<p1.getVentas() && p2.getVentas()<p3.getVentas() && p2.getVentas()<p4.getVentas()) {
            return 2;
        } else if (p3.getVentas()<p1.getVentas() && p3.getVentas()<p2.getVentas() && p3.getVentas()<p4.getVentas()) {
            return 3;
        } else if (p4.getVentas()<p1.getVentas() && p4.getVentas()<p2.getVentas() && p4.getVentas()<p3.getVentas()) {
            return 4;
        }else {
            return 0;
        }
        
    }

}
