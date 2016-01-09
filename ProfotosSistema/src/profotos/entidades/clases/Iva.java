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
public class Iva {
    private int id;
    private int tasa; 
     
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
     * @return the tasa
     */
    public int getTasa() {
        return tasa;
    }

    /**
     * @param tasa the precio to set
     */
    public void setTasa(int tasa) {
        this.tasa = tasa;
    } 
    
   //</editor-fold>
}
