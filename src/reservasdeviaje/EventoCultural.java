/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservasdeviaje;

/**
 *
 * @author ruzbe
 */
public class EventoCultural {
    
    private String nombreEventos;
    private String ciudad;
    private double costo;
    private String horario;
    private String fecha;
    private String lugar;
    
    EventoCultural(String nombreEventos, String ciudad, double costo, 
            String horario, String fecha, String lugar){
       this.nombreEventos = nombreEventos;
       this.ciudad = ciudad;
       this.costo = costo;
       this.horario = horario;
       this.fecha = fecha;
       this.lugar = lugar;
   }
    
    
}
