/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profotos.presentacion;

import javax.swing.JOptionPane;
import negocio.Clases.UsuarioNegocio;
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
        boolean login = UsuarioNegocio.Login("admin", "admin");
        if (login)
            System.out.println("Login con éxito");
        else 
            System.out.println("Login fallido");
    } 
}
