/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto2;

/**
 *
 * @author Lenovo
 */
public class Datos {
    
    private int  numviaje;
    private String fecha;
    private String hora;
    private  String nomPasajero;
    private int costo;

    public Datos() {
    }

    public Datos(int numviaje, String fecha, String hora, String nomPasajero, int  costo) {
        this.numviaje = numviaje;
        this.fecha = fecha;
        this.hora = hora;
        this.nomPasajero = nomPasajero;
        this.costo = costo;
    }

    public int getNumviaje() {
        return numviaje;
    }

    public void setNumviaje(int numviaje) {
        this.numviaje = numviaje;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getNomPasajero() {
        return nomPasajero;
    }

    public void setNomPasajero(String nomPasajero) {
        this.nomPasajero = nomPasajero;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
    

    
}
