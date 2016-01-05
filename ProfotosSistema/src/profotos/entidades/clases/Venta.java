/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profotos.entidades.clases;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Chuy
 */
class Venta {
    private int id;
    private String empleado;
    private List<ArticuloVenta> articulos;
    private List<EgresoValor> egresos;
    private TipoEmpleado tipoEmpleado;
    private Date fecha;
    
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
    public String getEmpleado() {
        return empleado;
    }

    /**
     * @param empleado the empleado to set
     */
    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    /**
     * @return the articuloVenta
     */
    public List<ArticuloVenta> getArticulos() {
        return articulos;
    }

    /**
     * @param articuloVenta the articuloVenta to set
     */
    public void setArticulos(List<ArticuloVenta> articulos) {
        this.articulos = articulos;
    }

    /**
     * @return the egresoValor
     */
    public List<EgresoValor> getEgresos() {
        return egresos;
    }

    /**
     * @param egresoValor the egresoValor to set
     */
    public void setEgresos(List<EgresoValor> egresos) {
        this.egresos = egresos;
    } 

    /**
     * @return the tipoEmpleado
     */
    public TipoEmpleado getTipoEmpleado() {
        return tipoEmpleado;
    }

    /**
     * @param tipoEmpleado the tipoEmpleado to set
     */
    public void setTipoEmpleado(TipoEmpleado tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }
    
    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    //</editor-fold>

}
