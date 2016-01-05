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
enum TipoMovimiento {
    INGRESO(1),EGRESO(2);
    private int valor = 0; 
    private TipoMovimiento(int _valor) {
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
            case 1: nombre = "Alta";break;
            case 2: nombre = "Baja";break;
        }
        return nombre;
    }
}
