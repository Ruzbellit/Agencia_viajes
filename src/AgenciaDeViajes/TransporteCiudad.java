/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AgenciaDeViajes;


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

  public String getCiudad(){
      return ciudad;
  }
  
  public double getPrecio(String tipoTransporte)
  {
    switch(tipoTransporte)
    {
      case "bus":
        return precioBus;
      case "chiva":
        return precioChiva;
      case "bicicleta":
        return precioBicicleta;
      default:
        return 0;
    }
  }

   public String getPreciosTransporte()
   {
       return "bus: " + precioBus + "\nchiva: " + precioChiva + "\nbicicleta: " + precioBicicleta;
   }
  
}

