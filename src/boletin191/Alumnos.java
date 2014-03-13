
package boletin191;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author npedrosapena
 */
public class Alumnos
{
    private String nombre;
    private Integer nota;

    
    //zona set
    
    /**
     * @param nombre the nombre to set
     */
    public void setNombre ( String nombre )
    {
        this.nombre = nombre;
    }
    
    /**
     * @param nota the nota to set
     */
    public void setNota ( Integer nota )
    {
        this.nota = nota;
    }
    
    //zona Get
    
    /**
     * @return the nombre
     */
    public String getNombre ()
    {
        return nombre;
    }

    /**
     * @return the nota
     */
    public Integer getNota ()
    {
        return nota;
    }

    public Alumnos introducirDatos()
    {
        //creo un objeto xestion
        Xestion informacion= new Xestion();
        Alumnos alumno= new Alumnos();
        //guardo los datos de este usuario utilizo los métodos de control
        //de la clase xestion
        alumno.setNombre ( informacion.peticionNombres ());
        alumno.setNota (informacion.peticionNotas ());
        
        //devuelve este objeto, para luego añadirlo al arraylist
        return alumno;
    }
    
    /**
     * dado un nombre, devuelve si existe o no
     * @param lista
     * @param nomeBuscar
     * @return boolean
     */
    public Integer[] conten(ArrayList lista,String nomeBuscar)
    {
        Integer posiciones[]=new Integer[lista.size ()];
        
        
        Integer indices =0;
        Integer indiceArray =0;
        
        Iterator <Object> interaccion = lista.iterator ();
        
        
        while(interaccion.hasNext ())
        {
            Alumnos info=( Alumnos ) interaccion.next ();
            
            if(info.getNombre().compareToIgnoreCase ( nomeBuscar )==0)
            {
               posiciones[indiceArray]=indices;
               indiceArray+=1;
            }
            indices+=1;
        }
        
        //creamos un nuevo array para ajustar el tamaño ya que
        //el array posiciones tiene un tamaño excesivo (el mismo que el arraylist
        //con todos los nombres)
        
        Integer auxArray[] = new Integer[indiceArray];
        indices=0;
        
        for (int c=0;c<indiceArray;c++)
        {
            auxArray[c]=posiciones[c];
        }
        
        return auxArray;
    }
    
    public Integer posicion(String nomeBuscar)
    {
        System.out.println ( "posicion: "+this.nombre.indexOf ( nomeBuscar ) );
        return this.nombre.indexOf ( nomeBuscar );
    }
    
}
