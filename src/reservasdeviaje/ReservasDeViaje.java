/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservasdeviaje;

import javax.swing.*;
import java.util.*;

/**
 *
 * @author ruzbe
 */
public class ReservasDeViaje {

    //declaracion de los array de reservas, hoteles, aerolineas y transportes
    ArrayList<Reserva> reservaciones;
    //ArrayList<Hotel> hoteles;
    //ArrayList<Aerolinea> aerolineas;
    ArrayList<EventoCultural> eventosCulturales;
    ArrayList<TransporteCiudad> transportes;

   //declaración del area de texto
    JTextArea area;
    JScrollPane barras;
  
  ReservasDeViaje()
  {
        //inicializamos las listas
        reservaciones = new ArrayList<>();
        //hoteles = new ArrayList<>();
        //aerolineas = new ArrayList<>();
        eventosCulturales = new ArrayList();
        transportes = new ArrayList<>();
        
        //creación del area de texto
        area = new JTextArea();
        barras = new JScrollPane(area);
  }

  public void ingresarInformacion()
  {

  }

  public void mostrarCatalogo()
  {

  }

  public void listarHoteles()
  {
      /*
      String datos = null;
      for(EventoCultural x: hoteles)
      {
          datos += x.getInformacion();
      }
      area.setText(datos);
      JOptionPane.showMessageDialog(null, barras);
      */
  }
  
  public void listarEventosCulturales()
  {
      String datos = null;
      for(EventoCultural x: eventosCulturales)
      {
          datos += x.getInformacion();
      }
      area.setText(datos);
      JOptionPane.showMessageDialog(null, barras);
  }
  
  public void realizarReserva()
  {

  }

  public void consultarReserva()
  {
      String buscarReserva = JOptionPane.showInputDialog("Ingrese el documento de identidad del cliente").trim();
      for(Reserva x: reservaciones)
      {
          if(x.getIdentCliente().equals(buscarReserva))
          {
              area.setText(x.getInformacion());
              JOptionPane.showMessageDialog(null, barras);
              break;
          }
      }
      
  }

  public void menu()
  {
      int opcion;
      do
      {
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Viajemos por Colombia:\n"
            + "1. Ingresar Informacion\n"
            + "2. Consultar Opciones Disponibles\n"
            + "3. Listar Hoteles\n"
            + "4. Listar Eventos Culturales\n"
            + "5. Realizar Reservacion\n"
            + "6. Consultar Reserva\n"
            + "7. Estadisticas\n"
            + "8. Salir"));
      
        switch(opcion)
        {
            case 1: //ingresar informacion
                
            case 2: // consultar todas las opciones disponibles
                break;
            case 3: //listar hoteles
                listarHoteles();
                break;
            case 4: //listar eventos culturales
                listarEventosCulturales();
                break;
            case 5: //realizar reservacion
                break;
            case 6: //consultar reservaciones
                break;
            case 7: //mostrar estadisticas
                
                break;
            default:
                JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");
        }
      }while(opcion != 8);
  }
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ReservasDeViaje app = new ReservasDeViaje();
        app.menu();
    }
    
}
