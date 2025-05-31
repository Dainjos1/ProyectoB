
package com.mycompany.proyectob;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JOptionPane;

public class ConsultaDirecciones extends javax.swing.JFrame {

    private Direcciones Direcciones;
    
    public ConsultaDirecciones() {
        initComponents();
        pintarTabla();
    }

        private void pintarTabla(){

        String cabeceras[] = {"Calle","Avenida","Direccion Completa","Zona"};
        
        DefaultTableModel t = new DefaultTableModel(cabeceras,Proyectob.Direcciones.size());
        jTable1.setModel(t);

        TableModel tabla = jTable1.getModel();
        
        for (int i = 0; i < Proyectob.Direcciones.size();i++){
          Direcciones d = Proyectob.Direcciones.get(i);
          tabla.setValueAt(d.getCalle(),i,0);
          tabla.setValueAt(d.getAvenida(),i,1);
          tabla.setValueAt(d.getDireccionCompleta(),i,2);
          tabla.setValueAt(d.getZona(),i,3);
        }   
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
