/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profotos.entidades;

/**
 *
 * @author Chuy
 */
class Venta {
    private int id;
    private Empleado empleado;
    private ArticuloVenta articuloVenta;
    private EgresoValor egresoValor;
    
 //<editor-fold defaultstate="collapsed" desc=" Getters and Setters de la venta ">
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
     * @return the empleado
     */
    public Empleado getEmpleado() {
        return empleado;
    }

    /**
     * @param empleado the empleado to set
     */
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    /**
     * @return the articuloVenta
     */
    public ArticuloVenta getArticuloVenta() {
        return articuloVenta;
    }

    /**
     * @param articuloVenta the articuloVenta to set
     */
    public void setArticuloVenta(ArticuloVenta articuloVenta) {
        this.articuloVenta = articuloVenta;
    }

    /**
     * @return the egresoValor
     */
    public EgresoValor getEgresoValor() {
        return egresoValor;
    }

    /**
     * @param egresoValor the egresoValor to set
     */
    public void setEgresoValor(EgresoValor egresoValor) {
        this.egresoValor = egresoValor;
    }
      //</editor-fold>
}
