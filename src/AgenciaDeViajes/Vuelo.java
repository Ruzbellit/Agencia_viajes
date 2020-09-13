/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgenciaDeViajes;

import javax.swing.JOptionPane;

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
    
    /*Funcion que indica si el trayecto de un vuelo se encuenta disponible o no*/
    public boolean trayecto(String origen, String destino)
     {
       boolean vueloDisponible = true;
        
      String buscarOrigen = JOptionPane.showInputDialog("Ingrese el origen del vuelo").trim();
      String buscarDestino = JOptionPane.showInputDialog("Ingrese el destino del vuelo").trim();
      
                
          if((this.getOrigen().equals(buscarOrigen)) && this.getDestino().equals(buscarDestino))
          {
              return vueloDisponible;
          }
          else 
          {
              vueloDisponible = false;
          }
      
      return vueloDisponible;
      
     }
    
    
}
