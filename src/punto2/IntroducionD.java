
package punto2;

/**
 *
 * @author Lenovo
 */
public class IntroducionD {
    
    Datos p1 = new Datos();
    Datos p2 = new Datos();
    Datos p3 = new Datos();
    
    
    public void Registro() {
        
    
    p1.setNomPasajero("Andres Acosta");
    p1.setNumviaje(1);
    p1.setFecha("17/09/2019");
    p1.setHora("7:00");
    p1.setCosto(1400);
    
    p2.setNomPasajero("Andres Acosta");
    p2.setNumviaje(1);
    p2.setFecha("17/09/2019");
    p2.setHora("11:00");
    p2.setCosto(3500);
    
    p3.setNomPasajero("Leidy Alarcon");
    p3.setNumviaje(121);
    p3.setFecha("18/09/2019");
    p3.setHora("11:00");
    p3.setCosto(2700);
    
   
        
    }
    
    
    public void costos() {
        
        int resultado;
        Registro();
        resultado = p1.getCosto()+p2.getCosto()+p3.getCosto();
        
        
        System.out.println("costo total: " +resultado);
        
    }
    
    public static void main(String[] args) {
        IntroducionD i = new IntroducionD();
        i.costos();
    }
    
    
}
