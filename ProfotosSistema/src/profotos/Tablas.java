/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profotos;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Chuy
 */
public class Tablas {
 public void pasar_valores(JTable jt){
     String[] columnas = {"columna1"};
     DefaultTableModel dtm = new DefaultTableModel(null,columnas);
     String[] filas = {"fila1"};
     dtm.addRow(filas);
     jt.setModel(dtm);
 }   
}
