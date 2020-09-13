/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgenciaDeViajes;
import javax.swing.*;
import java.time.*;
/**
 *
 * @author ruzbe
 */
public class EventoCultural {
    
    private String nombreEvento;
    private String ciudad;
    private double costo;
    private String horario;
    private LocalDate fecha;
    private String lugar;
    
    EventoCultural(String nombreEvento, String ciudad, double costo, 
            String horario, String fecha, String lugar){
       this.nombreEvento = nombreEvento;
       this.ciudad = ciudad;
       this.costo = costo;
       this.horario = horario;
       this.fecha = LocalDate.parse(fecha);
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
    
    public LocalDate getFecha(){
        return this.fecha;
    }
    
    public String getInformacion(){
        String infoTotal = "Evento: " + getNombre() +
                "\nCiudad: " + this.ciudad +
                "\nCosto: " + this.costo +
                "\nHorario: " + this.horario +
                "\nFecha: " + this.fecha.toString() +
                "\nLugar: " + this.lugar;
        return infoTotal;
    }

}
