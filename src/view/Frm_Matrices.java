/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import controller.*;
import javax.swing.JOptionPane;
import view_table_model.*;
import util.Utiles;
/**
 *
 * @author JAIMEUNL
 */
public class Frm_Matrices extends javax.swing.JFrame {
    Matrices matrices = new Matrices();
    MTableMatrices mTableMatrices = new MTableMatrices();
    MTableMatrizResult mTableMatrizResult = new MTableMatrizResult();
    Matriz_result matriz_result = new Matriz_result();
    private final String direc = "matrices";
    private final String direc_result = "m_operacion";
    /**
     * Creates new form Frm_Matrices
     */
    public Frm_Matrices() {
        initComponents();
    }
    
    public void duplicar(){
        matriz_result.duplicarMatriz(matrices.getData());
        mTableMatrizResult.setMatrices(matriz_result);
        tbl_result.setModel(mTableMatrizResult);
        tbl_result.revalidate();
        tbl_result.repaint();
        
    }
    
    public void cargarMatriz() {
        mTableMatrices.setMatrices(matrices);
        tbl_matriz_init.setModel(mTableMatrices);
        tbl_matriz_init.revalidate();
        tbl_matriz_init.repaint(); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_matriz_init = new javax.swing.JTable();
        txt_filas = new javax.swing.JTextField();
        txt_column = new javax.swing.JTextField();
        btn_generar = new javax.swing.JButton();
        btn_guardarArch = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_result = new javax.swing.JTable();
        btn_deletePrim = new javax.swing.JButton();
        btn_saveResult = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_deletMult = new javax.swing.JButton();
        fld_mult = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_matriz_init.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbl_matriz_init);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 400, 300));

        txt_filas.setBorder(javax.swing.BorderFactory.createTitledBorder("Filas(n)"));
        txt_filas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_filasActionPerformed(evt);
            }
        });
        jPanel1.add(txt_filas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 100, -1));

        txt_column.setBorder(javax.swing.BorderFactory.createTitledBorder("Columnas(m)"));
        txt_column.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_columnActionPerformed(evt);
            }
        });
        jPanel1.add(txt_column, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 100, -1));

        btn_generar.setText("Generar");
        btn_generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_generar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 100, -1));

        btn_guardarArch.setText("Guardar archivo");
        btn_guardarArch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarArchActionPerformed(evt);
            }
        });
        jPanel1.add(btn_guardarArch, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, -1, -1));

        jButton1.setText("Cargar archivo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 120, -1));

        tbl_result.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tbl_result);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 410, 300));

        btn_deletePrim.setText("Eliminar Primos");
        btn_deletePrim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deletePrimActionPerformed(evt);
            }
        });
        jPanel1.add(btn_deletePrim, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, -1, 30));

        btn_saveResult.setText("Guardar resultado");
        btn_saveResult.setEnabled(false);
        btn_saveResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveResultActionPerformed(evt);
            }
        });
        jPanel1.add(btn_saveResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 310, -1, -1));

        jLabel1.setText("Operaciones");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        btn_deletMult.setText("Eliminar multiplo");
        btn_deletMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deletMultActionPerformed(evt);
            }
        });
        jPanel1.add(btn_deletMult, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 130, -1));

        fld_mult.setBorder(javax.swing.BorderFactory.createTitledBorder("Multiplo"));
        fld_mult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fld_multActionPerformed(evt);
            }
        });
        jPanel1.add(fld_mult, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 100, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_filasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_filasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_filasActionPerformed

    private void txt_columnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_columnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_columnActionPerformed

    private void btn_generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generarActionPerformed
        // TODO add your handling code here:
        String filas = (txt_filas.getText() == null || txt_filas.getText().isEmpty()) ? " " : txt_filas.getText();
        String columnas = (txt_column.getText() == null || txt_column.getText().isEmpty()) ? " " : txt_column.getText();
        
        if(Utiles.validateInt(filas) && Utiles.validateInt(columnas)){
            if(filas == null || columnas == null){
                JOptionPane.showMessageDialog(null, "Ingrese dos dimensiones enteras", "Error", JOptionPane.ERROR_MESSAGE);
            }else{
                if (Utiles.transformStringInt(txt_filas.getText()) <= 15 && Utiles.transformStringInt(columnas) <= 15) {
                    matrices.crear(Utiles.transformStringInt(filas), Utiles.transformStringInt(columnas));
                    cargarMatriz();
                } else {
                    JOptionPane.showMessageDialog(null, "Dimensiones maximas 6x6", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese dos dimensiones enteras", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_generarActionPerformed

    private void btn_guardarArchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarArchActionPerformed
        // TODO add your handling code here:
        matrices.generateFile(matrices.getData(), direc);
    }//GEN-LAST:event_btn_guardarArchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
        if (matrices.cargarArchivo(direc)) {
            cargarMatriz();
            //lblpromedio.setText(e_Notas.promedio().toString());
            //btnagregar.setEnabled(true);
            //btn_guardar_archivo.setEnabled(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_deletePrimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deletePrimActionPerformed
        // TODO add your handling code here:
        duplicar();
        matrices.deletePrim(matriz_result.getData());
        mTableMatrizResult.setMatrices(matriz_result);
        tbl_result.setModel(mTableMatrizResult);
        tbl_result.revalidate();
        tbl_result.repaint();
        btn_saveResult.setEnabled(true);
    }//GEN-LAST:event_btn_deletePrimActionPerformed

    private void btn_deletMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deletMultActionPerformed
        // TODO add your handling code here:
        if( !(fld_mult.getText().isEmpty()) && Utiles.validateInt(fld_mult.getText()) ){
            int multiplo = Utiles.transformStringInt(fld_mult.getText());
            duplicar();
            matrices.deleteMult(matriz_result.getData(), multiplo);
            mTableMatrizResult.setMatrices(matriz_result);
            tbl_result.setModel(mTableMatrizResult);
            tbl_result.revalidate();
            tbl_result.repaint();
            btn_saveResult.setEnabled(true);
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese un numero entero", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_deletMultActionPerformed

    private void btn_saveResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveResultActionPerformed
        // TODO add your handling code here:
        matrices.generateFile(matriz_result.getData(), direc_result);
    }//GEN-LAST:event_btn_saveResultActionPerformed

    private void fld_multActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fld_multActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fld_multActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frm_Matrices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Matrices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Matrices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Matrices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Matrices().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_deletMult;
    private javax.swing.JButton btn_deletePrim;
    private javax.swing.JButton btn_generar;
    private javax.swing.JButton btn_guardarArch;
    private javax.swing.JButton btn_saveResult;
    private javax.swing.JTextField fld_mult;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_matriz_init;
    private javax.swing.JTable tbl_result;
    private javax.swing.JTextField txt_column;
    private javax.swing.JTextField txt_filas;
    // End of variables declaration//GEN-END:variables
}
