/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profotos.presentacion;

import java.util.List;
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
import profotos.entidades.clases.Perfil;
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
        
        List<Usuario> entidad = UsuarioNegocio.Buscar("ch");
        
        for(Usuario u : entidad)
        {
            System.out.println(u.getNombre());
        }
    } 
}
