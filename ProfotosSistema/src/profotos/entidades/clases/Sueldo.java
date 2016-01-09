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
public class Sueldo {
    private int id;
    private int sueldoLider;
    private int sueldoFotografo;
    private Double sueldoVendedor;
    
    //<editor-fold defaultstate="collapsed" desc=" Getters and Setters del articulo ">
     /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the sueldoLider
     */
    public int getSueldoLider() {
        return sueldoLider;
    }

    /**
     * @param sueldoLider the sueldoLider to set
     */
    public void setSueldoLider(int sueldoLider) {
        this.sueldoLider = sueldoLider;
    }

    /**
     * @return the sueldoFotografo
     */
    public int getSueldoFotografo() {
        return sueldoFotografo;
    }

    /**
     * @param sueldoFotografo the sueldoFotografo to set
     */
    public void setSueldoFotografo(int sueldoFotografo) {
        this.sueldoFotografo = sueldoFotografo;
    }

    /**
     * @return the sueldoVendedor
     */
    public Double getSueldoVendedor() {
        return sueldoVendedor;
    }

    /**
     * @param sueldoVendedor the sueldoSendedor to set
     */
    public void setSueldoVendedor(Double sueldoVendedor) {
        this.sueldoVendedor = sueldoVendedor;
    } 
    //</editor-fold>
}
