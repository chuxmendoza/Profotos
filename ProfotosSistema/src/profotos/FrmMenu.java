/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profotos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

/**
 *
 * @author Chuy
 */
public class FrmMenu extends javax.swing.JFrame {
int funcion = 0;
    /**
     * Creates new form Evento
     */
    public FrmMenu() {
        super("PROFOTOS");
        initComponents();
        this.setLayout(new FlowLayout());
        
         jpEventos = new JPanelEventos();
         this.add(jpEventos, BorderLayout.CENTER);
         this.pack();
         funcion=1;
    }
    private JPanelEventos jpEventos;
    private JPanelUsuarios jpUsuarios;   
    private JPanelEgresos jpEgresos;
  
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jMenuBarArticulo = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuUsuarios = new javax.swing.JMenuItem();
        jMenuEventos = new javax.swing.JMenuItem();
        jMenuEgresos = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        jToggleButton1.setText("jToggleButton1");

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        jMenuItem5.setText("jMenuItem5");

        jMenu4.setText("File");
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar1.add(jMenu5);

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(85, 152, 183));
        jPanel1.setLayout(null);

        jMenu1.setText("Funciones");

        jMenuUsuarios.setText("Usuarios");
        jMenuUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuUsuariosActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuUsuarios);

        jMenuEventos.setText("Eventos");
        jMenuEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEventosActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuEventos);

        jMenuEgresos.setText("Inversión");
        jMenuEgresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEgresosActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuEgresos);

        jMenuBarArticulo.add(jMenu1);

        jMenu6.setText("Configuración");

        jMenuItem6.setText("Sueldos");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem6);

        jMenuBarArticulo.add(jMenu6);

        setJMenuBar(jMenuBarArticulo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuUsuariosActionPerformed
        // TODO add your handling code here:
      
//Si ya está el otro Jpanel añadido al contenedor, entonces se elimina
  try{
          
      if(funcion == 1){
         this.remove(jpEventos);
      }else{
          if(funcion ==2){
              this.remove(jpUsuarios);
          }else{
              this.remove(jpEgresos);
          }
          
      }
 


  
}
catch(Exception e){
}
 jpUsuarios = new JPanelUsuarios();

//Agregamos la instancia al JFrame, con un layout al centro
this.add(jpUsuarios);
//Hacemos que el JFrame tenga el tamaño de todos sus elementos
this.pack();
funcion=2;

    }//GEN-LAST:event_jMenuUsuariosActionPerformed

    private void jMenuEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEventosActionPerformed
      
        try{
          
      if(funcion == 1){
         this.remove(jpEventos);
      }else{
          if(funcion ==2){
              this.remove(jpUsuarios);
          }else{
              this.remove(jpEgresos);
          }
          
      }
 
}
catch(Exception e){
}
      jpEventos = new JPanelEventos();

this.add(jpEventos);
this.pack();
funcion=1;

    }//GEN-LAST:event_jMenuEventosActionPerformed

    private void jMenuEgresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEgresosActionPerformed
        // TODO add your handling code here:
      try{
          
      if(funcion == 1){
         this.remove(jpEventos);
      }else{
          if(funcion ==2){
              this.remove(jpUsuarios);
          }else{
              this.remove(jpEgresos);
          }          
      }

  
}
catch(Exception e){
}
     jpEgresos = new JPanelEgresos();
 this.add(jpEgresos);
 this.pack();
 funcion=3;


    }//GEN-LAST:event_jMenuEgresosActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBarArticulo;
    private javax.swing.JMenuItem jMenuEgresos;
    private javax.swing.JMenuItem jMenuEventos;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuUsuarios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
