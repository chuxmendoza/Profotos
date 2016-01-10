/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profotos.entidades.clases;

/**
 *
 * @author Chuy
 */
public enum Perfil {
    ADMIN(1), SUPERADMIN(2);  
    private int valor = 0; 
    private Perfil(int _valor) {
        this.valor = _valor;
    }  
    public int getValor()
    {
        return valor;
    }
    
    public String getNombre(int valor)
    {
        String nombre = "";
        switch(valor)
        {
            case 1: nombre = "Administrador";break;
            case 2: nombre = "Super Administrador";break;
        }
        return nombre;
    }
}
