/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgenciaDeViajes;

/**
 *
 * @author Daniel
 */
public class Hotel {
    private int estrellas;
    private String nombre;
    private String ciudad;
    private double precio;
    
    /*Contructor, con el cual creamos un objeto de clase hotel*/
    Hotel(int estrellas, String nombre, String ciudad, double precio)
    {
    this.estrellas = estrellas;
    this.nombre = nombre;
    this.ciudad = ciudad;
    this.precio = precio;
    
    }
    /*Funcion para obtener el número de estrellas del hotel*/
    public int getEstrellas(){
        
        return this.estrellas;
    }
    
    /*Funcion para obtener el nombre del hotel*/
    public String getNombre(){
    
        return this.nombre;
    }
    
    /*Funcion que retorna la ciudad donde se encuentra el hotel*/
    public String getCiudad(){
    
        return this.ciudad;
    }
    
    /*Funcion qu retorna el precio del hospedaje por habitación*/
    public double getPrecio(){
        
        return this.precio;
    }
    
    
    public String getInformacion(){
    
        String infoHotel = "Nombre: "+ getNombre() +
                "\nEstrellas: " + getEstrellas() +
                "\nCiudad: " + getCiudad() +
                "\nPrecio: " + getPrecio();
        
        return infoHotel;
    }
    
    
}
