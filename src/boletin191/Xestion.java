/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package boletin191;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author npedrosapena
 */
public class Xestion
{
  //creamos un arraylist 
   ArrayList <Object> alumnos =new ArrayList <>();      
  //creo un alumno
   Alumnos nuevoAlumno= new Alumnos();
   
   Scanner datos= new Scanner(System.in);
   /**
    * creamos a lista dos alumnos cas súas notas
    */
    public void crearLista()
    {
        //introduzco en el arraylist el objeto alumno
        //el cual contiene el nombre y la nota
        
        alumnos.add (nuevoAlumno.introducirDatos ());
    }
    
    /**
     * verifica que se están escribiendo los nombres correctamente
     * @return el nombre verificado
     */
    public String peticionNombres()
    {
        Scanner datos= new Scanner(System.in);
        
        try
        {
            System.out.print ( "Nombre alumno: " );
            return datos.next ();
        }catch(Exception ex)
        {
            System.out.println ( "Error: "+ex.getMessage () );
        }
        
        return null;
    }
    
    /**
     * Pide las notas y verifica que sean válidas
     * @return 
     */
    public Integer peticionNotas()
    {
        try
        {
            System.out.print ( "Nota alumno: " );
            return datos.nextInt ();
        }catch(Exception ex)
        {
            System.out.println ( "Error: "+ex.getMessage () );
        }
        
        return null;
    }
    
    /**
     * Visualiza los elementos del array list
     */
    public void visualizarLista()
    {
        Iterator<Object> recorre = this.alumnos.iterator ();
        
        while(recorre.hasNext ())
        {
            // declaramos una variable que se usa para 
            // acceder a los metodos y también
            // para llegar al final del arraylist
            
            Alumnos alumno = ( Alumnos ) recorre.next ();
            
            System.out.println ( "nombre: "+alumno.getNombre ()+" nota: "+alumno.getNota () ); 
        }
        
    }/**
     * Visualiza los datos de un alumno con un nombre concreto
     */
        public void verNotaAlumnoDeterminado()
        {
            Iterator <Object> alumno = this.alumnos.iterator ();
            
            String nombreAlumno=this.peticionNombres ();
            Integer resultadoAlumnos[]=new Integer[this.nuevoAlumno.conten ( alumnos,nombreAlumno).length];
            resultadoAlumnos=this.nuevoAlumno.conten ( alumnos,nombreAlumno);
            Integer indices=0;
            
            while(alumno.hasNext ())
            {
                alumno.next ();
                if(indices<resultadoAlumnos.length)
                {
                    Alumnos alumnoDatos = (Alumnos) this.alumnos.get ( resultadoAlumnos[indices]);
                    System.out.println ( "Nombre: "+ alumnoDatos.getNombre ()+" Nota: "+alumnoDatos.getNota () );
                    indices+=1;
                }
            }
            
        }
        
        /**
         * crea un nuevo alumno
         */
        public void crearAlumno()
        {
            this.alumnos.add (this.nuevoAlumno.introducirDatos ());
            System.out.println ( "elementos actualmente: "+this.alumnos.size () );
        }
        
        public void eliminarAlumno()
        {
           /* Iterator <Object> recorre=this.alumnos.iterator ();
            Integer indice=0;
            
            while(recorre.hasNext())
            {
                indice+=1;
                
               Alumnos datosAlumno= ( Alumnos ) recorre.next ();
               
                System.out.println ( "nombre: "+datosAlumno.getNombre () );
            }*/
            
            this.alumnos.remove ( this.nuevoAlumno.posicion (this.peticionNombres ()));
         }
}
