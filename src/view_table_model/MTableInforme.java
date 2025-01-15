/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view_table_model;
import controller.Informe;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author JAIMEUNL
 */
public class MTableInforme extends AbstractTableModel {
    private Informe informe;

    public Informe getInforme(){
        return informe;
    }
    
    public void setInforme(Informe informe){
        this.informe = informe;
    }

    @Override
    public int getRowCount() {
        return informe.getData().length;
    }

    @Override
    public int getColumnCount() {
        return 13;
    }
    
    @Override
    public Object getValueAt(int i, int i1) {
        switch(i1){
            case 0: return informe.getData()[i][0];
            case 1: return informe.getData()[i][1];
            case 2: return informe.getData()[i][2];
            case 3: return informe.getData()[i][3];
            case 4: return informe.getData()[i][4];
            case 5: return informe.getData()[i][5];
            case 6: return informe.getData()[i][6];
            case 7: return informe.getData()[i][7];
            case 8: return informe.getData()[i][8];
            case 9: return informe.getData()[i][9];
            case 10: return informe.getData()[i][10];
            case 11: return informe.getData()[i][11];
            case 12: return informe.getData()[i][12];
            default: return null;
        } 
    }
    @Override
    public String getColumnName(int i) {
        switch (i) {
            case 0: return informe.getData()[0][0];
            case 1: return informe.getData()[1][0];
            case 2: return informe.getData()[2][0];
            default: return null;
        }
    }
}
