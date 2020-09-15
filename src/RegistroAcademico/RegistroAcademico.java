/*
  Autor: Ruzbellit Rossy Romero Ramirez (1925456)
  Email: ruzbellit.romero@correounivalle.edu.co
  Autor: Daniel Rodriguez Sanchez (1927631)
  Email: daniel.rodriguez.sanchez@correounivalle.edu.co
  Autor: Christian Villanueva Paez (1924546)
  Email: christian.villanueva@correounivalle.edu.co
  Fecha última modificación: 2020-09-14
 */
package RegistroAcademico;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author ruzbe
 */

public class RegistroAcademico {

    private ArrayList<Estudiante> listaEstudiantes;
    
     //declaración del area de texto
    JTextArea area;
    JScrollPane barras;

    /**
     * Inicializa listas y areas de texto.
     */
    RegistroAcademico() {
        this.listaEstudiantes = new ArrayList<>();
        
        area = new JTextArea();
        barras = new JScrollPane(area);
    }

    /**
     * Metodo que permite registrar a todos los estudiantes con un nombre, codigo, semestre actual y cuatro notas.
     */
    public void registrarEstudiante() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre").trim();
        String codigo = JOptionPane.showInputDialog("Ingrese el codigo").trim();
        int semestre = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de semestre").trim());
        if ((semestre > 10) || (semestre < 1)) {
            JOptionPane.showMessageDialog(null, "El numero de semestre no puede ser superior a 10 ni menor a 1");
            semestre = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de semestre").trim());
        }
        String plan = JOptionPane.showInputDialog("Ingrese el plan");
        double nota1 = -1;
        while ((nota1 > 5.0) || (nota1 < 0)) {
            nota1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 1").trim());
            if( (nota1 > 5.0) || (nota1 < 0))
            {
                JOptionPane.showMessageDialog(null, "El numero de nota no puede ser superior a 5.0 ni menor a 0");
            }
        }
        double nota2 = -1;
        while ((nota2 > 5.0) || (nota2 < 0)) {
            nota2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 2").trim());
            if( (nota2 > 5.0) || (nota2 < 0))
            {
                JOptionPane.showMessageDialog(null, "El numero de nota no puede ser superior a 5.0 ni menor a 0");
            }
        }
        double nota3 = -1;
        while ((nota3 > 5.0) || (nota3 < 0)) {
            nota3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 3").trim());
            if( (nota3 > 5.0) || (nota3 < 0))
            {
                JOptionPane.showMessageDialog(null, "El numero de nota no puede ser superior a 5.0 ni menor a 0");
            }
        }
        double nota4 = -1;
        while ((nota4 > 5.0) || (nota4 < 0)) {
            nota4 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 4").trim());
            if( (nota4 > 5.0) || (nota4 < 0))
            {
                JOptionPane.showMessageDialog(null, "El numero de nota no puede ser superior a 5.0 ni menor a 0");
            }
        }
        Estudiante nuevoEstudiante = new Estudiante(nombre, codigo, semestre, plan, nota1, nota2,
                nota3, nota4);
        this.listaEstudiantes.add(nuevoEstudiante);
    }

    /**
     * Muestra una lista de estudiantes registrados, con su nombre, semestre y promedio.
     */
    public void listarEstudiantes() {
        String totalEstudiantes = "";
        for (Estudiante estudiante : this.listaEstudiantes) {
            totalEstudiantes += "Nombre: " + estudiante.getNombre() + "\n"
                    + "Semestre: " + estudiante.getSemestre() + "\n"
                    + "Promedio: " + Double.toString(estudiante.getPromedio()) + "\n"
                    + "___________________" + "\n";
        }

        if (totalEstudiantes == "") {
             area.setText("No se han ingresado estudiantes");
            JOptionPane.showMessageDialog(null, barras);
        } else {
              area.setText(totalEstudiantes);
            JOptionPane.showMessageDialog(null, barras);
        }

          
    }

    /**
     * Busca un estudiante con su respectivo codigo y lo muestra con todos sus datos.
     */
    private void buscarEstudianteCodigo() {
        String elCodigo = JOptionPane.showInputDialog("Ingrese el codigo").trim();
        boolean encontrado = false;
        for (Estudiante estudiante : this.listaEstudiantes) {

            if ((estudiante.getCodigo()).equals(elCodigo)) {
                String elEstudiante = "Nombre: " + estudiante.getNombre() + "\n"
                        + "Codigo: " + estudiante.getCodigo() + "\n"
                        + "Semestre: " + estudiante.getSemestre() + "\n"
                        + "Plan: " + estudiante.getPlan() + "\n"
                        + "Notas: " + estudiante.getStringNotas() + "\n"
                        + "Promedio: " + Double.toString(estudiante.getPromedio()) + "\n";
                encontrado = true;
                JOptionPane.showMessageDialog(null, elEstudiante);
            }
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "no existe estudiante con ese código");
        }
    }

    /**
     * Lista cinco puestos con los estudiantes que ganaron estimulos academicos
     */
    public void listarEstudiantesEstimulo() {
        // Estudiantes candidatos para estimulo
        ArrayList<Estudiante> estudiantesCandidatos = new ArrayList<>();
        for (Estudiante estudiante : this.listaEstudiantes) {
            if (estudiante.getPromedio() > 3.8) {
                boolean perdioAlgunaMateria = false;
                // comprueba si perdio alguna materia
                for (Double nota : estudiante.getArrayNotas()) {
                    if (nota < 3) {
                        perdioAlgunaMateria = true;
                    }
                }
                if (!perdioAlgunaMateria) {
                    estudiantesCandidatos.add(estudiante);
                }
            }
        }

        int puestoEstimulo = 1;
        ArrayList<Estudiante> estudiantesEstimulo = new ArrayList<>();
        String listaEstudiantesEstimulo = "Estudiantes con estimulo: \n";
        do {
            // promedio máximo
            double promedioMax = 0;
            for (Estudiante estudiante : estudiantesCandidatos) {
                if (estudiante.getPromedio() > promedioMax) {
                    promedioMax = estudiante.getPromedio();
                }
            }

            // Estudiantes que ganaron estimulo
            ArrayList<Estudiante> estudiantesSinGanar = new ArrayList<>();
            for (int i = 0; i < estudiantesCandidatos.size(); i++) {
                if (Math.abs(estudiantesCandidatos.get(i).getPromedio() - promedioMax) < 0.01) {
                    estudiantesEstimulo.add(estudiantesCandidatos.get(i));
                    listaEstudiantesEstimulo += "Puesto " + puestoEstimulo + "\n"
                            + "Nombre: " + estudiantesCandidatos.get(i).getNombre() + "\n"
                            + "Promedio: " + Double.toString(estudiantesCandidatos.get(i).getPromedio()) + "\n";
                } else {
                    estudiantesSinGanar.add(estudiantesCandidatos.get(i));
                }
            }
            estudiantesCandidatos = estudiantesSinGanar;
            puestoEstimulo++;
        } 
        while (puestoEstimulo < 6);
        JOptionPane.showMessageDialog(null, listaEstudiantesEstimulo);
        
    }

    /**
     * Lista los estudiantes que estan en bajo rendimiento academico segun
     * sus calificaciones y promedio.
     */
    public void listarEstudiantesBajos() {
        String estudiantesEnBajos = "Estudiantes con bajo rendimiento: \n";
        for (Estudiante estudiante : this.listaEstudiantes) {
            int materiasPerdidas = 0;
            for (double nota : estudiante.getArrayNotas()) {
                if (nota < 3.0) {
                    materiasPerdidas += 1;
                }
            }

            if ((materiasPerdidas >= 2) || (estudiante.getPromedio() < 3.0)) {
                estudiantesEnBajos += "Nombre: " + estudiante.getNombre() + "\n"
                        + "Codigo: " + estudiante.getCodigo() + "\n"
                        + "Semestre: " + estudiante.getSemestre() + "\n"
                        + "Notas: " + estudiante.getStringNotas() + "\n"
                        + "___________" + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, estudiantesEnBajos);
    }

    /**
     * Despliega todas las opciones a elegir.
     */
    public void menu() {
        String opcion = JOptionPane.showInputDialog("Escoga el tipo de informacion que desea ingresar\n"
                + "1. Registrar un estudiante\n"
                + "2. Listar estudiantes ingresados\n"
                + "3. Buscar estudiante con codigo\n"
                + "4. Listar estudiantes con estimulos academicos\n"
                + "5. Listar estudiantes con bajo rendimiento\n"
                + "6. Salir\n").trim();
        switch (opcion) {
            case "1":
                registrarEstudiante();
                break;
            case "2":
                listarEstudiantes();
                break;
            case "3":
                buscarEstudianteCodigo();
                break;
            case "4":
                listarEstudiantesEstimulo();
                break;
            case "5":
                listarEstudiantesBajos();
                break;
            case "6":
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "ha ingresado una opción no válida, ingrese una que esté en el menú");

        }
        menu();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RegistroAcademico miRegistroAcademico = new RegistroAcademico();
        miRegistroAcademico.menu();
    }

}
