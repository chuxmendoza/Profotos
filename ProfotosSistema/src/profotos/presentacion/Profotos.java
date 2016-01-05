/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profotos.presentacion;

import javax.swing.JOptionPane;
import negocio.Clases.EgresoNegocio;
import negocio.Clases.IvaNegocio;
import negocio.Clases.UsuarioNegocio;
import profotos.entidades.clases.Egreso;
import profotos.entidades.clases.Usuario;

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
        Egreso egreso = EgresoNegocio.Obtener(1);
        if (egreso != null)
            System.out.println(""+egreso.getNombre());
        else 
            System.out.println("null");
//        if (login)
//            System.out.println("Login con éxito");
//        else 
//            System.out.println("Login fallido");
    } 
}
