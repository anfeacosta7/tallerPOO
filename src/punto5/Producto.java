/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto5;

/**
 *
 * @author Acosta
 */
public class Producto {
    
    //Atributos
    
    private String nombre;
    private int cantidad;
    private int ventas;
    private double iva;
    private double precio;
    
    //Constructores

    public Producto() {
    }

    public Producto(String nombre, int cantidad, double iva, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.iva = iva;
        this.precio = precio;
    }
    
    //Encapsulamiento (set & get)

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }
    
    
    
}
