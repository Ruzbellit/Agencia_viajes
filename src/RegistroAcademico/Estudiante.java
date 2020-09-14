/*
  Autor: Ruzbellit Rossy Romero Ramirez (1925456)
  Email: ruzbellit.romero@correounivalle.edu.co
  Autor: Daniel Rodriguez Sanchez (1927631)
  Email: daniel.rodriguez.sanchez@correounivalle.edu.co
  Autor: Christian Villanueva Paez
  Email: christian.villanueva@correounivalle.edu.coFecha creación: 2019-11-08
  Fecha última modificación: 2020-09-14
*/
package RegistroAcademico;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * @author ruzbe
 */
public class Estudiante {
    
    private String nombre;
    private String codigo;
    private int semestre;
    private String plan;
    private double[] notas;
    
    Estudiante(String nombre, String codigo, int semestre,
            String plan, double nota1, double nota2, double nota3,
            double nota4){
        this.nombre = nombre;
        this.codigo = codigo;
        this.semestre = semestre;
        this.plan = plan;
        this.notas = new double[]{nota1, nota2, nota3, nota4};
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    
    public String getCodigo()
    {
        return this.codigo;
    }
    
    public int getSemestre()
    {
        return this.semestre;
    }
    
    public String getPlan()
    {
        return this.plan;
    }
    
    public double[] getArrayNotas()
    {
        return this.notas;
    }
    
    public double getPromedio()
    {
        double suma = 0;
        for(double nota : this.notas)
        {
           suma += nota;
        }
        double elPromedio = suma/4;
        return elPromedio;
    }

    public String getStringNotas()
    {
        String acumulNotas = ", ";
        for(double nota: this.notas)
        {
            acumulNotas += Double.toString(nota) + ", ";
        }
        return acumulNotas;
    }

}
