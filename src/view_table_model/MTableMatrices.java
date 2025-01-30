/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view_table_model;
import javax.swing.table.AbstractTableModel;
import controller.Matrices;
/**
 *
 * @author JAIMEUNL
 */
public class MTableMatrices extends AbstractTableModel {
    private Matrices matrices;
    
    public Matrices getMatrices(){
        return matrices;
    }
    
    public void setMatrices(Matrices matrices){
        this.matrices = matrices;
        fireTableStructureChanged();
    }
    
    @Override
    public int getRowCount() {
        if(matrices.getData() == null){
            return 0;
        }else{
            return matrices.getData().length;
        }
    }
    
    @Override
    public int getColumnCount() {
        if (matrices.getData() == null) {
            return 0;
        } else {
            return matrices.getData()[0].length;
        }   
    }

    @Override
    public Object getValueAt(int i, int j) {
        if (matrices.getData() == null) {
            return null;
        } else {
            Float[][] data = matrices.getData();
            if (i < 0 || i >= data.length || j < 0 || j >= data[0].length) {
                return null;
            }
            return data[i][j];
        }
    }
}
