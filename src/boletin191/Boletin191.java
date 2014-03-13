/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package boletin191;

/**
 *
 * @author npedrosapena
 */
public class Boletin191
{

    /**
     * @param args the command line arguments
     */
    public static void main ( String[] args )
    {
        Xestion obx= new Xestion();

        obx.crearLista ();
        obx.crearAlumno ();
        obx.crearAlumno ();
        obx.crearAlumno ();
        obx.visualizarLista ();
        System.out.println ( "***" );
        obx.verNotaAlumnoDeterminado ();
                
    }
    
}
