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

  TransporteCiudad()
  {
    ciudad = JOptionPane.showInputDialog("Digite la ciudad");
    precioBus = Double.parseDouble(JOptionPane.showInputDialog("Digite el precio del transporte del bus"));
    precioChiva = Double.parseDouble(JOptionPane.showInputDialog("Digite el precio del transporte del bus"));
    precioBicicleta = Double.parseDouble(JOptionPane.showInputDialog("Digite el precio del transporte del bus"));
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
