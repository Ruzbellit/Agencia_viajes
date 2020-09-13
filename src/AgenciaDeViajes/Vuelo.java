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
public class Vuelo {
    
    private String origen;
    private String destino;
    private double precio;
    
    /*Funcion que crear el vuelo, ciudad de origen, destino y precio*/
    Vuelo(String origen, String destino, double precio)
    {
        this.origen = origen;
        this.destino = destino;
        this.precio = precio;
        
    }
    
    /*Funcion que devuelve el origen desde la que sale el vuelo*/
    public String getOrigen()
    {
        return this.origen;
        
    }
    
    /*Funcion que devuelve el destino a donde llegara el vuelo*/
    public String getDestino()
    {
        return this.destino;
        
    }
    
    /*Funcion que retorna el precio del vuelo*/
    public double getPrecio()
    {
        return this.precio;
    }
    
    /*public boolean trayecto(String origen, String destino)
    {
        boolean confirmacion = true;
        
        if(origen == getOrigen() and destino == getDestino()
        {    };
    }
    */
    
}
