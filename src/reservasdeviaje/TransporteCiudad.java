/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reservasdeviaje;

import java.util.*;
import javax.swing.*;

/**
 *
 * @author villa
 */
class TransporteCiudad
{
  private String ciudad;
  private double precioBus, precioChiva, precioBicicleta;

  TransporteCiudad(String ciudad, double precioBus, double precioChiva, double precioBicicleta)
  {
    this.ciudad = ciudad;
    this.precioBus = precioBus;
    this.precioChiva = precioChiva;
    this.precioBicicleta = precioBicicleta;
  }

  public double getPrecio(String tipoTransporte)
  {
    switch(tipoTransporte)
    {
      case "Bus":
        return precioBus;
      case "Chiva":
        return precioChiva;
      case "Bicicleta":
        return precioBicicleta;
      default:
        return 0;
    }
  }
}
