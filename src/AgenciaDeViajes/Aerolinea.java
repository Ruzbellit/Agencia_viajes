/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgenciaDeViajes;


import java.util.*;
import javax.swing.JOptionPane;


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
        
      String buscarOrigen = JOptionPane.showInputDialog("Ingrese el origen del vuelo").trim();
      String buscarDestino = JOptionPane.showInputDialog("Ingrese el destino del vuelo").trim();
      
      for (Vuelo x: vuelos)
          
          if((x.getOrigen().equals(buscarOrigen)) && x.getDestino().equals(buscarDestino))
          {
              return vueloDisponible;
                            
          }
          else 
          {
              vueloDisponible = false;
          }
      
      return vueloDisponible;
      
     }
     
    /*Funcion que retorna el precio de un vuelo al consultar su origen y destino*/     
    public double consultarPrecio(String origen, String destino)
     {
       double precioVuelo = 0;
         
      String buscarOrigen = JOptionPane.showInputDialog("Ingrese el origen del vuelo").trim();
      String buscarDestino = JOptionPane.showInputDialog("Ingrese el destino del vuelo").trim();
      
      for (Vuelo x: vuelos)
          
          if((x.getOrigen().equals(buscarOrigen)) && x.getDestino().equals(buscarDestino))
          {
              precioVuelo = x.getPrecio();
          }
           
          
      
      return precioVuelo;
      
     }     
}