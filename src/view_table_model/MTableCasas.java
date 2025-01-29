/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view_table_model;

import javax.swing.table.AbstractTableModel;
import controller.Casas;
/**
 *
 * @author JAIMEUNL
 */
public class MTableCasas extends AbstractTableModel {
    
    private Casas casas;
    
    public Casas getCasas(){
        return casas;
    }
    
    public void setCasas(Casas casas){
        this.casas = casas;
    }
    
    @Override
    public int getRowCount() {
        return casas.getData().length-1;
    }

    @Override
    public int getColumnCount() {
        return casas.getData()[0].length;
    }

    @Override
    public Object getValueAt(int row, int column) {
        return casas.getData()[row][column];
    }
    
    @Override
    public String getColumnName(int i) {
        String[] columnNames = {
            "Nro Casa",
            "Nro Pisos",
            "Largo (m)",
            "Ancho (m)"
        };
        return columnNames[i];
    }
    
    public void actualizarDatos(String[][] nuevosDatos) {
        casas.setData(nuevosDatos);
        fireTableDataChanged();
    }
    
}
