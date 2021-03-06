/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profotos.entidades.clases;

import java.util.List;

/**
 *
 * @author Chuy
 */
public class Articulo {
    private int id;
    private Double precio;
    private int cantidad;
    private Double costo;
    private Iva iva;
    private List<Historial> historial;
    
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
     * @return the precio
     */
    public Double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the costo
     */
    public Double getCosto() {
        return costo;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(Double costo) {
        this.costo = costo;
    }

    /**
     * @return the iva
     */
    public Iva getIva() {
        return iva;
    }

    /**
     * @param iva the iva to set
     */
    public void setIva(Iva iva) {
        this.iva = iva;
    } 
    
    /**
     * @return the historial
     */
    public List<Historial> getHistorial() {
        return historial;
    }

    /**
     * @param historial the Historial to set
     */
    public void setHistorial(List<Historial> historial) {
        this.historial = historial;
    }
   //</editor-fold>
}
