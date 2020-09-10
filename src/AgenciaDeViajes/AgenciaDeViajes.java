/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgenciaDeViajes;

import javax.swing.*;
import java.util.*;
import java.time.*;
/**
 *
 * @author villa
 */
public class AgenciaDeViajes {

    //declaracion de los array de reservas, hoteles, aerolineas y transportes
    ArrayList<Reserva> reservaciones;
    ArrayList<Hotel> hoteles;
    ArrayList<Aerolinea> aerolineas;
    ArrayList<EventoCultural> eventosCulturales;
    ArrayList<TransporteCiudad> transportes;

   //declaración del area de texto
    JTextArea area;
    JScrollPane barras;
  
  /**
   * inicializa las listas y las areas de texto
   */
  AgenciaDeViajes()
  {
        reservaciones = new ArrayList<>();
        hoteles = new ArrayList<>();
        aerolineas = new ArrayList<>();
        eventosCulturales = new ArrayList();
        transportes = new ArrayList<>();
        
        area = new JTextArea();
        barras = new JScrollPane(area);
  }

  /**
   * permite ingresar informacion de alguno de las opciones disponibles
   */
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
                  int estrellas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la calificacion de estrellas").trim());
                  String ciudadH = JOptionPane.showInputDialog("Ingrese la ciudad del hotel").trim();
                  double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nombre del hotel"));
                  
                  hoteles.add(new Hotel(estrellas, nombreH, ciudadH, precio));
                  
                  area.setText("Informacion del hotel ingresado con exito\n"
                          + nombreH + "\n" + estrellas + "\n" + ciudadH + "\n" + precio);
                  JOptionPane.showMessageDialog(null, barras);
                  break;
              case "2": //aerolinea
                  JOptionPane.showMessageDialog(null, "Opcion no disponible en el momento");
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

  /**
   * lista las posibles opciones a escoger de acuerdo a los parametros ingresados
   */
  public void catalogo()
  {
      String ciudadDestino = JOptionPane.showInputDialog("Ingrese la ciudad de destino");
      double valorMinimo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor minimo del viaje"));
      double valorMaximo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor maximo del viaje"));
      int cantidadPersonas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de personas a viajar"));
      
      listarHoteles(ciudadDestino);
  }

  /**
   * lista todos los hoteles
   * @return 
   */
  public String listarHoteles()
  {
      if(!hoteles.isEmpty())
      {
        String datos = "";
        for(Hotel x: hoteles)
        {
            datos += x.getInformacion();
        }
        datos += "\n";
        return datos;
      }else
      {
        return "No hay hoteles listados";
      }
  }
  
  /**
   * lista los hoteles de acuerdo a la ciudad solicitada
   * @param ciudad
   * @return 
   */
  public String listarHoteles(String ciudad)
  {
      if(!hoteles.isEmpty())
      {
        String datos = "";
        for(Hotel x: hoteles)
        {
          if(x.getCiudad().equals(ciudad))
          {
            datos += x.getInformacion();
          }
        }
        datos += "\n";
        return datos;
      }else
      {
          return "No hay hoteles listados para esta ciudad";
      }
  }
  
  /**
   * lista los hoteles de acuerdo a la ciudad y cantidad de estrellas solicitada
   * @param ciudad
   * @param estrellas
   * @return 
   */
  public String listarHoteles(String ciudad, int estrellas)
  {
      if(!hoteles.isEmpty())
      {
        String datos = "";
        int enumerador = 1;
        boolean disponible = false;
        for(Hotel x: hoteles)
        {
          if(x.getCiudad().equals(ciudad) && x.getEstrellas() == estrellas)
          {
            datos += enumerador + ". " + x.getInformacion();
            enumerador ++;
            disponible = true;
          }
        }
        if(disponible){
            datos += "\n";
            return datos; 
        }else
        {
            return "No hay hoteles listados para esta ciudad\ny con la calificacion en estrellas deseada";
        }
      }else{
          return "No hay hoteles listados para esta ciudad\ny con la calificacion en estrellas deseada";
      }
  }
  
  /**
   * lista todos los eventos
   * @return 
   */
  public String listarEventosCulturales()
  {
      if(!eventosCulturales.isEmpty()){
        String datos = "";
        for(EventoCultural x: eventosCulturales)
        {
            datos += x.getInformacion();
        }
        datos += "\n";
        return datos;
      }else
      {
        return "No hay eventos culturales listados";
      }
  }
  
  /**
   * 
   * @param ciudad
   * @return 
   */
  public String listarEventosCulturales(String ciudad)
  {
      if(!eventosCulturales.isEmpty())
      {
        String datos = "";
        for(EventoCultural x: eventosCulturales)
        {
            if(x.getCiudad().equals(ciudad)){
              datos += x.getInformacion();
            }
        }
        datos += "\n";
        return datos;
      }else
      {
          return "No hay eventos culturales listados para esta ciudad";
      }
  }
  
  /**
   * 
   * @param ciudad
   * @return 
   */
  public String listarTransporteCiudad(String ciudad){
      for(TransporteCiudad x: transportes)
      {
          if(x.getCiudad().equals(ciudad))
          {
              return x.getPreciosTransporte();
          }
      }
      return "No hay medios de transporte listados para esta ciudad";
  }
  
  /**
   * 
   */
  public void realizarReserva()
  {      
      String ciudadDestinoReserva = JOptionPane.showInputDialog("Ingrese ciudad de destino");
      
      int estrellasHotelReserva = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las estrellas del hotel deseado"));
      String escogerHotel = "Introduzca el nombre del hotel deseado:\n" + listarHoteles(ciudadDestinoReserva, estrellasHotelReserva);
      String nombreHotel = JOptionPane.showInputDialog(escogerHotel);
      double costoHotel = 0;
      for(Hotel x: hoteles)
      {
          if(x.getNombre().equals(nombreHotel))
          {
              costoHotel = x.getPrecio();
              break;
          }
      }
      
      String aerolineaReserva = JOptionPane.showInputDialog("Escoja la aerolinea deseada");
      
      int personasAViajar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de personas viajar"));
      
      String escogerMedioTransporte = "Introduza el tipo de medio de transporte deseado\n" + listarTransporteCiudad(ciudadDestinoReserva);
      String tipoTransporteDeseado = JOptionPane.showInputDialog(escogerMedioTransporte);
      double costoTransporte = 0;
      for(TransporteCiudad x: transportes)
      {
          if(x.getCiudad().equals(ciudadDestinoReserva))
          {
              costoTransporte = x.getPrecio(ciudadDestinoReserva);
              break;
          }
      }
      
      JOptionPane.showInputDialog("Escoja los eventos culturales a visitar");
      

      //Date fff = LocalDate.of(2018,10,23);
      LocalDate fechaViaje = LocalDate.parse(JOptionPane.showInputDialog("Ingrese fecha de viaje (yyyy-MM-dd)"));
      String idClienteReserva = JOptionPane.showInputDialog("Ingrese la cedula para guardar la reserva");
      
      reservaciones.add(new Reserva("Cliente", idClienteReserva, "fecha de viaje", personasAViajar, ciudadDestinoReserva, ciudadDestinoReserva, 5, nombreHotel, costoHotel, "nombreAerolinea", 10, tipoTransporteDeseado, costoTransporte, "eventos", 3));
      
  }

  /**
   * busca una reserva de acuerdo con el numero de identidad a la cual fue guardada la reserva
   */
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

  /**
   * muestra la ciudad mas solicitada para viajar y los hoteles preferidos por los usuarios
   */
  public void estadisticas()
  {
      JOptionPane.showMessageDialog(null, "Funcion no disponible en el momento");
      /*
      for(Reserva x: reservaciones)
      {
          x.getCiudad();
      }
      
      */
  }
  
  /**
   * agrega un hotel, una aerolinea, un evento y medios de transportes a las listas iniciales
   */
  public void listadoDePrueba()
  {
      hoteles.add(new Hotel(3, "prueba", "cali", 15000));
      aerolineas.add(new Aerolinea("Avianca"));
      eventosCulturales.add(new EventoCultural("feria", "cali", 4000, "5 P.M - 10 P.M", "2020-12-25", "Autopista SurOriental"));
      transportes.add(new TransporteCiudad("cali", 2000, 1500, 1000));
  }
  
  /**
   * 
   */
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
            + "8. Insertar listados de prueba\n"
            + "9. Salir");
      
        switch(opcion)
        {
            case "1": //ingresar informacion
                ingresarInformacion();
                break;
            case "2": // consultar todas las opciones disponibles
                catalogo();
                break;
            case "3": //listar hoteles
                area.setText(listarHoteles());
                JOptionPane.showMessageDialog(null, barras);
                break;
            case "4": //listar eventos culturales
                area.setText(listarEventosCulturales());
                JOptionPane.showMessageDialog(null, barras);
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
            case "8": //insertar listado de prueba
                listadoDePrueba();
                break;
            case "9": //salir
                break;
            default:
                JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");
                break;
        }
      }while(!opcion.equals("9"));
  }
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AgenciaDeViajes app = new AgenciaDeViajes();
        app.menu();
    }
   
}
