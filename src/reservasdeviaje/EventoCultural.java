/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservasdeviaje;
import javax.swing.*;
/**
 *
 * @author ruzbe
 */
public class EventoCultural {
    
    private String nombreEvento;
    private String ciudad;
    private double costo;
    private String horario;
    private String fecha;
    private String lugar;
    
    EventoCultural(String nombreEvento, String ciudad, double costo, 
            String horario, String fecha, String lugar){
       this.nombreEvento = nombreEvento;
       this.ciudad = ciudad;
       this.costo = costo;
       this.horario = horario;
       this.fecha = fecha;
       this.lugar = lugar;
   }
    
    public String getNombre(){
        return this.nombreEvento;
    }
    
    public String getCiudad(){
        return this.ciudad;
    }
    
    public double getCosto(){
        return this.costo;
    }
    
    public String getFecha(){
        return this.fecha;
    }
    
    public String getInfoReserva(){
        String infoToReserva = "Nombre Evento: " + getNombre() + "\nHorario: " +
                this.horario + "\nFecha: " + getFecha() + "\nLugar: " + this.lugar;
        return infoToReserva;
    }
    
    //para listar la informacion completa de el objeto
    public String getInformacion(){
        String infoTotal = "Nombre Evento: " + getNombre() + "\nCosto:" + this.costo + "\nHorario: " +
                this.horario + "\nFecha: " + getFecha() + "\nLugar: " + this.lugar;
        return infoTotal;
    }

}
