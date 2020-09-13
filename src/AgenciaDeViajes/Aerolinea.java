/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgenciaDeViajes;


import java.util.*;
/**
 *
 * @author Daniel
 */
public class Aerolinea {
    
    private String nombre;
    
    ArrayList<Vuelo> vuelos;

    /*Funcion que crea la aerolinea con su nombre*/
     Aerolinea(String nombre)
        {
          this.nombre = nombre;
        }
     
     /*Funcion que obtiene el nombre de la aerolinea*/
     public String getNombre()
     {
         return this.nombre;
     }
     
     /*Funcion que indica si un vuelo se encuenta disponible o no*/
     public boolean consultarVuelo(String origen, String destino)
     {
       boolean vueloDisponible = true;
      
      for (Vuelo x: vuelos)
      {
          
          if((x.getOrigen().equals(origen)) && x.getDestino().equals(destino))
          {
              return vueloDisponible;
          }
          else 
          {
              vueloDisponible = false;
          }
      }  
      
      return vueloDisponible;
      
     }
     
    /*Funcion que retorna el precio de un vuelo al consultar su origen y destino*/     
    public double precioVuelo(String origen, String destino)
    {
      double precioVuelo = 0;
         
      for (Vuelo x: vuelos)
      {    
          if((x.getOrigen().equals(origen)) && x.getDestino().equals(destino))
          {
              precioVuelo = x.getPrecio();
          }
      }     
          
      
      return precioVuelo;
      
    }
    
    public void agregarVuelo (String origen, String destino, double precio)
    {   
        
        vuelos.add(new Vuelo(origen, destino, precio));
        
    }
    
    
    
}