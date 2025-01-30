/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view_table_model;

import controller.Matriz_result;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author JAIMEUNL
 */
public class MTableMatrizResult extends AbstractTableModel {
    
    private Matriz_result matriz_result;
    public Matriz_result getMatrices() {
        return matriz_result;
    }

    public void setMatrices(Matriz_result matrices) {
        this.matriz_result = matrices;
        fireTableStructureChanged();
    }

    @Override
    public int getRowCount() {
        return matriz_result.getData().length;
    }

    @Override
    public int getColumnCount() {
        return matriz_result.getData()[0].length;
    }

    @Override
    public Object getValueAt(int i, int j) {
        Float[][] data = matriz_result.getData();
        if(i<0 || i>=data.length || j<0 || j>=data[0].length){
            return null;
        }
        return data[i][j];
    }
}
