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
    
    public double[] getArrayNotas()
    {
        return this.notas;
    }
    
    public double getPromedio()
    {
        double suma = 0;
        for(double nota: this.notas)
        {
           suma += nota;
        }
        double elPromedio = suma/4;
        return elPromedio;
    }

    public String getStringNotas()
    {
        String acumulNotas = "\n";
        for(double nota: this.notas)
        {
            acumulNotas = "Nota: " + Double.toString(nota) + "\n";
        }
        return acumulNotas;
    }

}
