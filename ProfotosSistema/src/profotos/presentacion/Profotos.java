/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profotos.presentacion;

import javax.swing.JOptionPane;
import negocio.Clases.EgresoNegocio;
import negocio.Clases.EgresoValorNegocio;
import negocio.Clases.EventoNegocio;
import negocio.Clases.IvaNegocio;
import negocio.Clases.SueldoNegocio;
import negocio.Clases.UsuarioNegocio;
import negocio.Clases.VentaNegocio;
import profotos.entidades.clases.Egreso;
import profotos.entidades.clases.EgresoValor;
import profotos.entidades.clases.Evento;
import profotos.entidades.clases.Sueldo;
import profotos.entidades.clases.Usuario;
import profotos.entidades.clases.Venta;

/**
 *
 * @author Chuy
 */
public class Profotos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Evento entidad = EventoNegocio.Obtener(1);
        if (entidad != null)
            System.out.println("Evento: "+entidad.getNombre()+"\n"
            +"Venta por: "+entidad.getVentas().get(0).getEmpleado());
        else 
            System.out.println("null");
//        if (login)
//            System.out.println("Login con éxito");
//        else 
//            System.out.println("Login fallido");
    } 
}
