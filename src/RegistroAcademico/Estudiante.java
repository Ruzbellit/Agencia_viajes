/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegistroAcademico;
import java.util.ArrayList;
/**
 *
 * @author ruzbe
 */
public class Estudiante {
    
    private String nombre;
    private String codigo;
    private int semestre;
    private String plan;
    private double notas[];
    private double promedio;
    
    Estudiante(String nombre, String codigo, int semestre,
            String plan, double nota1, double nota2, double nota3,
            double nota4){
        this.nombre = nombre;
        this.codigo = codigo;
        this.semestre = semestre;
        this.plan = plan;
        this.notas = new double[4];
        double notas[] = {nota1, nota2, nota3, nota4};
        
   
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    
    public String getCodigo()
    {
        return this.codigo;
    }
    
    public double[] getNotas()
    {
        return notas;
    }
    
    public double getPromedio()
    {
        double suma = 0;
        for(int i = 0; i < notas.length; i++)
        {
           suma += notas[i];
        }
        double elPromedio = suma/4;
        this.promedio = elPromedio;
        return elPromedio;
    }
    
    public String getInfoPromedio()
    {
        String infoToPromed = "Nombre Estudiante: " + this.nombre + 
                "Promedio: " + this.promedio;
        return infoToPromed;
    }
    
    public String todasLasNotas()
    {
        String acumulNotas = "\n";
        for(int i = 0; i < notas.length; i++)
        {
            acumulNotas = "Nota: " + Double.toString(notas[i]) + "\n";
        }
        return acumulNotas;
    }
    
    public String getInfoTotal()
    {
        String infoTotal = "Nombre Estudiante: " + this.nombre + "Codigo: " +
                this.codigo + "Semestre: " + Integer.toString(this.semestre) + 
                "Plan De Estudio: " + this.plan + "Todas las Notas: " + todasLasNotas() +
                "Promedio: " + this.promedio ;
        return infoTotal;
    }
    
}
