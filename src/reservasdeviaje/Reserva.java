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
public class Reserva {
    
    private String nombreCliente;
    private String idCliente;
    private String fechaViaje;
    private int viajeros; 
    private String ciudadOrigen;
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
    
    Reserva(String nombreCliente, String idCliente, String fechaViaje, int viajeros, 
            String ciudadOrigen, String ciudadDestino, int diasViaje, String nombreHotel, 
            double costoHotel, String nombreAerolinea, double costoAerolinea, String tipoTransporte,
            double costoTransporte, String infoEventos, double costoEventos) {
        this.nombreCliente = nombreCliente;
        this.idCliente = idCliente;
        this.fechaViaje = fechaViaje;
        this.viajeros = viajeros; 
        this.ciudadOrigen = ciudadOrigen;
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
    
    public double costoTotalHotel(){
        return this.costoHotel * this.diasViaje * this.viajeros;
    }

    public double costoViajeTotal() {
        return costoTotalHotel() +  this.costoEventos + 
                this.costoTransporte + this.costoAerolinea;
    }
    
    public String getInformacion() {
        String infoReserva = "Nombre Cliente: " + this.nombreCliente + "\n" + "ID Cliente: " + this.idCliente + "\n" +
                "Fecha de Viaje: " + this.fechaViaje + "\n" + "Cantidad de Viajeros: " + this.viajeros + "\n" + 
                "Ciudad Origen: " + this.ciudadOrigen + "\n" + "Ciudad Destino: " + this.ciudadDestino + "\n" +
                "Dias de Viaje: " + Integer.toString(this.diasViaje) + "\n" + "Nombre Hotel: " + this.nombreHotel + "\n" +
                "Costo Hotel: " + Double.toString(this.costoHotel) + "\n" + "Nombre Aerolinea" + this.nombreAerolinea + "\n" +
                "Costo Aerolina: " + Double.toString(this.costoAerolinea) + "\n" + "Tipo Transporte: " +  this.tipoTransporte + "\n" +
                "Costo Transporte: " + Double.toString(this.costoTransporte) + "\n" + "Informacion Eventos: " + "\n" + 
                this.infoEventos + "\n" + "CostoEventos: " + Double.toString(this.costoEventos);
                
        return infoReserva;
    }
    
}
