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
   
   RegistroAcademico()
   {
       this.listaEstudiantes = new ArrayList<>();
   }
   
   public void registrarEstudiante()
   {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre");
        String codigo = JOptionPane.showInputDialog("Ingrese la codigo");
        int semestre = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de semestre"));
        String plan = JOptionPane.showInputDialog("Ingres el plan");
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Ingres el nota1"));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Ingres el nota2"));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Ingres el nota3"));
        double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Ingres el nota4"));
        Estudiante nuevoEstudiante = new Estudiante(nombre, codigo, semestre, plan, nota1, nota2,
                nota3, nota4);
        this.listaEstudiantes.add(nuevoEstudiante);
        
   }
   
    
    
    
    
    
    
    
     public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
