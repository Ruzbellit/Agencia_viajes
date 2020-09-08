/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgenciaDeViajes;

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
      String opcion = "";
      do
      {

          opcion = JOptionPane.showInputDialog("Escoga el tipo de informacion que desea ingresar\n"
              + "1. Hotel\n"
              + "2. Aerolínea\n"
              + "3. Medios de Transporte\n"
              + "4. Eventos Culturales\n"
              + "5. Regresar al Menú"); 

          switch(opcion)
          {
              case "1": //hotel
                  String nombreH = JOptionPane.showInputDialog("Ingrese nombre del hotel").trim();
                  String estrellas = JOptionPane.showInputDialog("Ingrese la calificacion de estrellas").trim();
                  String ciudadH = JOptionPane.showInputDialog("Ingrese la ciudad del hotel").trim();
                  double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nombre del hotel"));
                  
                  //hoteles.add(Hotel(nombreH, estrellas, ciudadH, precio));
                  
                  area.setText("Informacion del hotel ingresado con exito\n"
                          + nombreH + "\n" + estrellas + "\n" + ciudadH + "\n" + precio);
                  JOptionPane.showMessageDialog(null, barras);
                  break;
              case "2": //aerolinea
                  
                  break;
                  
              case "3": //medios de transporte
                  String ciudadT = JOptionPane.showInputDialog("Ingrese la ciudad").trim();
                  double precioBus = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo del pasaje del bus"));
                  double precioChiva = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo del pasaje de chiva"));
                  double precioBicicleta = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo del alquiler de la bicicleta"));
                  
                  transportes.add(new TransporteCiudad(ciudadT, precioBus, precioChiva, precioBicicleta));
                  
                  area.setText("Informacion de los medios de trasnporte ingresado con exito\n"
                          + ciudadT + "\n" + precioBus + "\n" + precioChiva + "\n" + precioBicicleta);
                  JOptionPane.showMessageDialog(null, barras);
                  break;
                  
              case "4": //eventos culturales
                  String nombreE = JOptionPane.showInputDialog("Ingrese el nombre del evento").trim();
                  String ciudadE = JOptionPane.showInputDialog("Ingrese la ciudad").trim();
                  double costo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo por persona"));
                  String horario = JOptionPane.showInputDialog("Ingrese el horario").trim();
                  String fecha = JOptionPane.showInputDialog("Ingrese la fecha del evento").trim();
                  String lugar = JOptionPane.showInputDialog("Ingrese el lugar del evento").trim();
                  
                  eventosCulturales.add(new EventoCultural(nombreE, ciudadE, costo, horario, fecha, lugar));
                  
                  area.setText("Informacion del evento ingresado con exito\n"
                          + nombreE + "\n" + ciudadE + "\n" + costo + "\n" + horario + "\n" + fecha + "\n" + lugar );
                  JOptionPane.showMessageDialog(null, barras);
                  break;
                  
              case "5":
                  break;
                  
              default: 
                  JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");
                  break;
          }
      }while(!opcion.equals("5"));
  }

  public void catalogo()
  {
      JOptionPane.showMessageDialog(null, "Funcion no disponible en el momento");
      String ciudadDestino = JOptionPane.showInputDialog("Ingrese la ciudad de destino");
      double valorMinimo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor minimo del viaje"));
      double valorMaximo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor maximo del viaje"));
      int cantidadPersonas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de personas a viajar"));
      
      listarHoteles(ciudadDestino);

  }

  public void listarHoteles()
  {
      JOptionPane.showMessageDialog(null, "Funcion no disponible en el momento");
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
  
  public void listarHoteles(String ciudad)
  {
      /*
      String datos = null;
      for(EventoCultural x: hoteles)
      {
          if(x.getCiudad().equals(ciudad))
          {
            datos += x.getInformacion();
          }
      }
      area.setText(datos);
      JOptionPane.showMessageDialog(null, barras);
      */
  }
  
  public void listarEventosCulturales()
  {
      String datos = "";
      for(EventoCultural x: eventosCulturales)
      {
          datos += x.getInformacion();
      }
      area.setText(datos);
      JOptionPane.showMessageDialog(null, barras);
  }
  
  public void listarEventosCulturales(String ciudad)
  {
      String datos = "";
      for(EventoCultural x: eventosCulturales)
      {
          if(x.getCiudad().equals(ciudad)){
            datos += x.getInformacion();
          }
      }
      area.setText(datos);
      JOptionPane.showMessageDialog(null, barras);
  }
  
  public void realizarReserva()
  {
      JOptionPane.showMessageDialog(null, "Funcion no disponible en el momento");
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

  public void estadisticas()
  {
      JOptionPane.showMessageDialog(null, "Funcion no disponible en el momento");
  }
  
  public void menu()
  {
      String opcion;
      do
      {
        opcion =JOptionPane.showInputDialog("Viajemos por Colombia:\n"
            + "1. Ingresar Informacion\n"
            + "2. Consultar Opciones Disponibles\n"
            + "3. Listar Hoteles\n"
            + "4. Listar Eventos Culturales\n"
            + "5. Realizar Reservacion\n"
            + "6. Consultar Reserva\n"
            + "7. Estadisticas\n"
            + "8. Salir");
      
        switch(opcion)
        {
            case "1": //ingresar informacion
                ingresarInformacion();
                break;
            case "2": // consultar todas las opciones disponibles
                catalogo();
                break;
            case "3": //listar hoteles
                listarHoteles();
                break;
            case "4": //listar eventos culturales
                listarEventosCulturales();
                break;
            case "5": //realizar reserva
                realizarReserva();
                break;
            case "6": //consultar reservaciones
                consultarReserva();
                break;
            case "7": //mostrar estadisticas
                estadisticas();
                break;
            case "8":
                break;
            default:
                JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");
                break;
        }
      }while(!opcion.equals("8"));
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
