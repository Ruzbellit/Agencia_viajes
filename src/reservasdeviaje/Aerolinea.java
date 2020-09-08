/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservasdeviaje;


import java.util.*;


/**
 *
 * @author Daniel
 */
public class Aerolinea {
    
    private String nombre;
    
    ArrayList<Vuelo> vuelos;


     Aerolinea(String nombre)
        {
          this.nombre = nombre;
        }
     
     public String getNombre()
     {
         return this.nombre;
     }
     
     /*public double precioVuelo(string origen, string destino)
     {
         
     }
     */
         
     
     
}