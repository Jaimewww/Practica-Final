/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import controller.*;
import javax.swing.JOptionPane;
import util.*;
import view_table_model.MTableInforme;
/**
 *
 * @author JAIMEUNL
 */
public class Frm_Informe extends javax.swing.JFrame {

    /**
     * Creates new form main_Frame
     */
    private Informe informe = new Informe();
    private MTableInforme mTableInforme = new MTableInforme();
    private final String direc = "informes";
    
    private void cargarTabla(){
        mTableInforme.setInforme(informe);
        tblTablita.setModel(mTableInforme);
        tblTablita.updateUI();
    }
    
    private void crearArreglos(){
        String year = yearIndex.getText();
        
        if(year.isEmpty()|| year == null || Utiles.validateInt(year) == false || year.length() > 4 || year.length() < 4){
            JOptionPane.showMessageDialog(null, "Ingrese un valor entero de 4 digitos", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("ERRO");
        }else{
            informe.crear();
            btnAgregar.setEnabled(true);
            input_venta.setEnabled(true);
            input_gasto.setEnabled(true);
            box_months.setEnabled(true);
            cargarTabla();
            generar_datos.setEnabled(true);
            btn_guardar.setEnabled(true);
        }
    }
    
    public Frm_Informe() {
        initComponents();
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        input_venta = new javax.swing.JTextField();
        input_gasto = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        generar_datos = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        lbl_venta_mayor = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_gasto_mayor = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_venta_menor = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_gasto_menor = new javax.swing.JLabel();
        box_months = new javax.swing.JComboBox<>();
        btn_guardar = new javax.swing.JButton();
        btn_cargar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTablita = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        yearIndex = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt_totalventas = new javax.swing.JLabel();
        lbl_ventas = new javax.swing.JLabel();
        txt_totalgastos = new javax.swing.JLabel();
        lbl_gastos = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbl_promVentas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel1.setText("INFORME DE VENTAS ANUALES");
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 50));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        input_venta.setBorder(javax.swing.BorderFactory.createTitledBorder("Precio total ventas"));
        input_venta.setEnabled(false);
        input_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_ventaActionPerformed(evt);
            }
        });

        input_gasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Precio total gastos"));
        input_gasto.setEnabled(false);

        btnAgregar.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setEnabled(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        generar_datos.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        generar_datos.setText("Generar datos adicionales");
        generar_datos.setEnabled(false);
        generar_datos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generar_datosActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setText("Venta más alta");

        lbl_venta_mayor.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lbl_venta_mayor.setText("0.0");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setText("Gasto mas alto");

        lbl_gasto_mayor.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lbl_gasto_mayor.setText("0.0");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setText("Venta más baja");

        lbl_venta_menor.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lbl_venta_menor.setText("0.0");

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setText("Gasto más bajo");

        lbl_gasto_menor.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lbl_gasto_menor.setText("0.0");

        box_months.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        box_months.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE" }));
        box_months.setBorder(javax.swing.BorderFactory.createTitledBorder("Mes"));
        box_months.setEnabled(false);
        box_months.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_monthsActionPerformed(evt);
            }
        });

        btn_guardar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btn_guardar.setText("Guardar Archivo");
        btn_guardar.setEnabled(false);
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_cargar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btn_cargar.setText("Cargar Archivo");
        btn_cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cargarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Verdana", 2, 10)); // NOI18N
        jLabel8.setText("Datos adicionales generados");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(box_months, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(574, 574, 574)
                        .addComponent(btn_guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(265, 265, 265))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(input_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(input_gasto, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(btnAgregar)
                .addGap(246, 246, 246)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_venta_menor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_venta_mayor, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_gasto_menor, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_gasto_mayor, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(generar_datos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(box_months, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn_guardar)
                                .addComponent(btn_cargar))
                            .addGap(22, 22, 22)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_gasto_menor)
                            .addComponent(jLabel6)
                            .addComponent(lbl_venta_mayor)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_gasto_mayor)
                            .addComponent(lbl_venta_menor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(generar_datos)
                        .addContainerGap(41, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(input_venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(input_gasto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 1000, 200));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        tblTablita.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblTablita.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblTablita);

        background.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1000, 280));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        yearIndex.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        yearIndex.setBorder(javax.swing.BorderFactory.createTitledBorder("Año"));
        yearIndex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearIndexActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton2.setText("Generar Tabla");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Verdana", 2, 10)); // NOI18N
        jLabel7.setText("Ingrese el año para generar la Tabla");

        txt_totalventas.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        txt_totalventas.setText("Total de ventas");

        lbl_ventas.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lbl_ventas.setText("0.0");

        txt_totalgastos.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        txt_totalgastos.setText("Total de gastos");

        lbl_gastos.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lbl_gastos.setText("0.0");

        jLabel5.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        jLabel5.setText("Promedio ventas");

        lbl_promVentas.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lbl_promVentas.setText("0.0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(yearIndex))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_promVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_totalventas, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_totalgastos))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_ventas, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_gastos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_totalventas)
                            .addComponent(lbl_ventas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_totalgastos)
                            .addComponent(lbl_gastos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_promVentas)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(yearIndex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))))
        );

        background.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 620, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 1004, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void input_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_ventaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_input_ventaActionPerformed

    private void box_monthsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_monthsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_monthsActionPerformed
    
    private Boolean verificar(){
        String mes = (String) box_months.getSelectedItem(); //mes

        String ventas = input_venta.getText() != null ? input_venta.getText() : ""; //ventas
        String gastos = input_gasto.getText() != null ? input_gasto.getText() : "";
        if (!ventas.isEmpty() && !gastos.isEmpty()) {
            System.out.println(mes + "\n" + Utiles.transformStringFloat(ventas) + "\n" + Utiles.transformStringFloat(gastos));
            if (Utiles.validate(ventas) && Utiles.validate(gastos)) {
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "Ingrese un numero valido", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Llene todas las casillas", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }//gastos
        
    }
    
    private void limpiar() {
        input_venta.setText("");
        input_gasto.setText("");
        //lblpromedio.setText("0.0");
        cargarTabla();
        //fila = -1;
        tblTablita.clearSelection();
    }
    
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        
        //informe.agregarDato(evt);
        if(verificar()){
            informe.guardarDato(box_months.getSelectedIndex() + 1, input_venta.getText(), input_gasto.getText());
            mTableInforme.actualizarDatos(informe.getData());
            limpiar();
        }
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void yearIndexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearIndexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearIndexActionPerformed

    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //informe.crear();
        crearArreglos();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void generar_datosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generar_datosActionPerformed
        // TODO add your handling code here:
        if(informe.verificar()){
            String total_ventas = String.valueOf(informe.calc_ventas());
            Float promedio_ventas = Utiles.transformStringFloat(total_ventas)/12;
            promedio_ventas = Utiles.redondear(promedio_ventas);
            lbl_promVentas.setText(promedio_ventas.toString());
            lbl_ventas.setText(total_ventas);
            lbl_gastos.setText(String.valueOf(informe.calc_gastos()));
            
            String[] matriz_ventas = informe.data_ord(0);
            String mes_ventaMayor = informe.findMes(tblTablita, 0,matriz_ventas[1]);
            lbl_venta_mayor.setText(mes_ventaMayor + ": " + matriz_ventas[1]);
            String mes_ventaMenor = informe.findMes(tblTablita, 0, matriz_ventas[12]);
            lbl_venta_menor.setText(mes_ventaMenor + ": " + matriz_ventas[12]);
            
            
            
            String[] matriz_gastos = informe.data_ord(1);
            String mes_gastoMayor = informe.findMes(tblTablita, 1, matriz_gastos[1]);
            lbl_gasto_mayor.setText(mes_gastoMayor + ": " + matriz_gastos[1]);
            String mes_gastoMenor = informe.findMes(tblTablita, 1, matriz_gastos[12]);
            lbl_gasto_menor.setText(mes_gastoMenor + ": " + matriz_gastos[12]);
            
            
        } else{
            JOptionPane.showMessageDialog(null, "Llene todos los datos de la tabla", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        //informe.print_matriz(matriz);
    }//GEN-LAST:event_generar_datosActionPerformed

    private void btn_cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cargarActionPerformed
        // TODO add your handling code here:
        if(informe.cargarArchivo(direc)){
            cargarTabla();
            generar_datos.setEnabled(true);
            btnAgregar.setEnabled(true);
            input_venta.setEnabled(true);
            input_gasto.setEnabled(true);
            box_months.setEnabled(true);
            btn_guardar.setEnabled(true);
        }
    }//GEN-LAST:event_btn_cargarActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        // TODO add your handling code here:
        informe.generateFile();
    }//GEN-LAST:event_btn_guardarActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_Informe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Informe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Informe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Informe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Informe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JComboBox<String> box_months;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btn_cargar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JToggleButton generar_datos;
    private javax.swing.JTextField input_gasto;
    private javax.swing.JTextField input_venta;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_gasto_mayor;
    private javax.swing.JLabel lbl_gasto_menor;
    private javax.swing.JLabel lbl_gastos;
    private javax.swing.JLabel lbl_promVentas;
    private javax.swing.JLabel lbl_venta_mayor;
    private javax.swing.JLabel lbl_venta_menor;
    private javax.swing.JLabel lbl_ventas;
    private javax.swing.JTable tblTablita;
    private javax.swing.JLabel txt_totalgastos;
    private javax.swing.JLabel txt_totalventas;
    private javax.swing.JTextField yearIndex;
    // End of variables declaration//GEN-END:variables
}
