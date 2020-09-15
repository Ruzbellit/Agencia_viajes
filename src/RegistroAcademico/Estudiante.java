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
    
     /**
     * Inicializa atributos, datos de estudiante.
     */
    Estudiante(String nombre, String codigo, int semestre,
            String plan, double nota1, double nota2, double nota3,
            double nota4){
        this.nombre = nombre;
        this.codigo = codigo;
        this.semestre = semestre;
        this.plan = plan;
        this.notas = new double[]{nota1, nota2, nota3, nota4};
    }
    
     /**
     * Muestra el nombre del estudiante.
     * @return String con el nombre del estudiante.
     */
    public String getNombre()
    {
        return this.nombre;
    }
    
     /**
     * Muestra el codigo del estudiante.
     * @return String con el codigo del estudiante.
     */
    public String getCodigo()
    {
        return this.codigo;
    }
    
     /**
     * Muestra el semestre actual del estudiante.
     * @return String con el semestre del estudiante.
     */
    public int getSemestre()
    {
        return this.semestre;
    }
    
     /**
     * Muestra el Plan de estudio del estudiante.
     * @return String con el plan de estudio del estudiante.
     */
    public String getPlan()
    {
        return this.plan;
    }
    
     /**
     * Muestra un arreglo con las notas del estudiante.
     * @return array de tipo double con las notas del estudiante.
     */
    public double[] getArrayNotas()
    {
        return this.notas;
    }
    
     /**
     * Muestra el promedio del estudiante.
     * @return double con el promedio del estudiante.
     */
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

     /**
     * Muestra un string de las notas del estudiante.
     * @return String con las notas del estudiante.
     */
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
