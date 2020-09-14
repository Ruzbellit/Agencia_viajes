/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgenciaDeViajes;

import java.time.*;
/**
 *
 * @author ruzbe
 */
public class Reserva {
    
    private String nombreCliente;
    private String idCliente;
    private LocalDate fechaViaje;
    private LocalDate fechaRegreso;
    private int viajeros; 
    private String ciudadDestino;
    private int diasViaje;
    private String nombreHotel;
    private double costoHotel;
    private String nombreAerolinea;
    private double costoAerolinea;
    private String tipoTransporte;
    private double costoTransporte; 
    private String infoEventos;
    private double costoEventos;
    
    Reserva(String idCliente, LocalDate fechaViaje, LocalDate fechaRegreso, int viajeros, 
            String ciudadDestino, int diasViaje, String nombreHotel, 
            double costoHotel, String nombreAerolinea, double costoAerolinea, String tipoTransporte,
            double costoTransporte, String infoEventos, double costoEventos) {
        this.idCliente = idCliente;
        this.fechaViaje = fechaViaje;
        this.fechaRegreso = fechaRegreso;
        this.viajeros = viajeros; 
        this.ciudadDestino = ciudadDestino;
        this.diasViaje = diasViaje;
        this.nombreHotel = nombreHotel;
        this.costoHotel = costoHotel;
        this.nombreAerolinea = nombreAerolinea;
        this.costoAerolinea = costoAerolinea;
        this.tipoTransporte = tipoTransporte;
        this.costoTransporte = costoTransporte; 
        this.infoEventos = infoEventos;
        this.costoEventos = costoEventos;
    }
    
    public String getIdentCliente(){
        return this.idCliente;
    }
    
    public String getCiudadDestino(){
        return this.ciudadDestino;
    }
    
    public double costoTotalHotel(){
        return this.costoHotel * this.diasViaje * this.viajeros;
    }
    
    public double costoTotalTransporte(){
        return this.costoTransporte * this.viajeros;
    }

    public double costoViajeTotal() {
        return costoTotalHotel() +  this.costoEventos + 
                (this.costoTransporte * this.viajeros) + (this.costoAerolinea * this.viajeros);
    }
    
    public String getInformacion() {
        String infoReserva = "ID Cliente: " + this.idCliente +
                "\nFecha de Viaje: " + this.fechaViaje.toString() +
                "\nDias de Viaje: " + Integer.toString(this.diasViaje) +
                "\nFecha de Regreso: " + this.fechaRegreso.toString() +
                "\nCantidad de Viajeros: " + this.viajeros + 
                "\nCiudad Destino: " + this.ciudadDestino +
                "\n\nNombre Hotel: " + this.nombreHotel +
                "\nCosto Hotel: " + Double.toString(this.costoHotel) +
                "\nCosto Hotel Total: " + this.costoTotalHotel() +
                "\nNombre Aerolinea" + this.nombreAerolinea +
                "\nCosto Aerolina: " + Double.toString(this.costoAerolinea) +
                "\n\nTipo Transporte: " +  this.tipoTransporte +
                "\nCosto Transporte: " + Double.toString(this.costoTransporte) +
                "\nCosto Transporte Total: " + Double.toString(costoTotalTransporte()) +
                "\n\nInformacion Eventos:\n" + this.infoEventos +
                "\nCosto Eventos: " + Double.toString(this.costoEventos) +
                "\n\nCosto Total: " + costoViajeTotal();
        
        if(fechaViaje.getDayOfMonth() >= 25)
        {
            infoReserva += "\n\nDescuento del 15% de acuerdo a politico de descuento" +
                    "\n\nCosto Total (Descuento 15%): " + ( costoViajeTotal() * (1 - .15) );
        }
                
        return infoReserva;
    }
    
}
