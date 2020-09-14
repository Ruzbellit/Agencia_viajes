/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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

    RegistroAcademico() {
        this.listaEstudiantes = new ArrayList<>();
    }

    public void registrarEstudiante() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre");
        String codigo = JOptionPane.showInputDialog("Ingrese el codigo");
        int semestre = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de semestre"));
        if ((semestre > 10) || (semestre < 1)) 
        {
            JOptionPane.showMessageDialog(null, "El numero de semestre no puede ser superior a 10 ni menor a 12");
            semestre = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de semestre"));
        }
        String plan = JOptionPane.showInputDialog("Ingres el plan");
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Ingres el nota1"));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Ingres el nota2"));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Ingres el nota3"));
        double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Ingres el nota4"));
        Estudiante nuevoEstudiante = new Estudiante(nombre, codigo, semestre, plan, nota1, nota2,
                nota3, nota4);
        this.listaEstudiantes.add(nuevoEstudiante);
    }

    public void listarEstudiantes() {
        String totalEstudiantes = "";
        for (Estudiante estudiante : this.listaEstudiantes) {
            totalEstudiantes += "Nombre: " + estudiante.getNombre() + "\n"
                    + "Semestre: " + estudiante.getSemestre() + "\n"
                    + "Promedio: " + Double.toString(estudiante.getPromedio()) + "\n"
                    + "___________________" + "\n";
        }

        if (totalEstudiantes == "") {
            JOptionPane.showMessageDialog(null, "No se han ingresado estudiantes");
        } else {
            JOptionPane.showMessageDialog(null, totalEstudiantes);
        }
    }

    private void buscarEstudianteCodigo() {
        String elCodigo = JOptionPane.showInputDialog("Ingrese el codigo");
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

    public void listarEstudiantesEstimulo() 
    {
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
        String listaEstudiantesEstimulo = "";
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
                 if (Math.abs(estudiantesCandidatos.get(i).getPromedio() - promedioMax) < 0.01 ) {
                   estudiantesEstimulo.add(estudiantesCandidatos.get(i));
                   listaEstudiantesEstimulo += "Puesto " + puestoEstimulo + "\n"
                           + "Nombre: " + estudiantesCandidatos.get(i).getNombre() + "\n"
                           + "Promedio: " + Double.toString(estudiantesCandidatos.get(i).getPromedio()) + "\n";
                   // estudiantesCandidatos.remove(i);
                 }
                 else 
                 {
                    estudiantesSinGanar.add(estudiantesCandidatos.get(i));
                 }
            }
             estudiantesCandidatos = estudiantesSinGanar;
            // estudiantesEstimulo.remove();
            puestoEstimulo++;
        }
        while (puestoEstimulo < 6);
        JOptionPane.showMessageDialog(null, listaEstudiantesEstimulo);

    }

    public void listarEstudiantesBajos() {
        String estudiantesEnBajos = "";
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

    public void menu() {
        String opcion = JOptionPane.showInputDialog("Escoga el tipo de informacion que desea ingresar\n"
                + "1. Registrar un estudiante\n"
                + "2. Listar estudiantes ingresados\n"
                + "3. Buscar estudiante con codigo\n"
                + "4. Listar estudiantes con estimulos acaemicos\n"
                + "5. Listar estudiantes con bajo rendimiento(\n"
                + "6. Salir\n");
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

    public void registrarDatosPrueba() {
        this.listaEstudiantes.add(new Estudiante("Bryan baboso", "2701", 10, "ing sistemas", 5, 4.5, 4.0, 4.9));
        this.listaEstudiantes.add(new Estudiante("Ruzbellit", "1708", 10, "ing sistemas", 5, 5, 4.9, 4.9));
        this.listaEstudiantes.add(new Estudiante("Valeria Tabarez", "2303", 5, "Psicologia", 5, 5, 4.9, 4.9));
        this.listaEstudiantes.add(new Estudiante("George Romero", "2610", 9, "Tec sistemas", 5, 4.5, 3.0, 2.9));
        this.listaEstudiantes.add(new Estudiante("Yuli Zunga", "0000", 1, "Aseadora", 1.0, 1.2, 0.0, 1.9));
        this.listaEstudiantes.add(new Estudiante("Leidy Perra ", "1010", 2, "ing sistemas", 3.0, 3.0, 3.0, 1.0));
        this.listaEstudiantes.add(new Estudiante("Moyano La Grilla", "666", 0, "ing sistemas", 1, 1.5, 3.0, 3.5));

    }

    public static void main(String[] args) {
        RegistroAcademico miRegistroAcademico = new RegistroAcademico();
        miRegistroAcademico.registrarDatosPrueba();
        miRegistroAcademico.menu();
    }

}
