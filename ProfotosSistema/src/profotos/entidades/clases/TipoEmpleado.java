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
enum TipoEmpleado {
 LIDER(1),FOTOGRAFO(2),VENDEDOR(3);   
 private int valor = 0; 
    private TipoEmpleado(int _valor) {
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
            case 1: nombre = "Lider";break;
            case 2: nombre = "Fotografo";break;
            case 3: nombre = "Vendedor";break;
        }
        return nombre;
    }
}
