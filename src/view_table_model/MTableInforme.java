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
        return informe.getData()[0].length; // Obtiene el número de columnas del arreglo
    }
    
    @Override
    public Object getValueAt(int row, int column) {
        return informe.getData()[row][column];
    }
    
    @Override
    public String getColumnName(int i) {
        String[] columnNames = {
            "MESES",
            "ENERO",
            "FEBRERO",
            "MARZO",
            "ABRIL",
            "MAYO",
            "JUNIO",
            "JULIO",
            "AGOSTO",
            "SEPTIEMBRE",
            "OCTUBRE",
            "NOVIEMBRE",
            "DICIEMBRE"
        };
        return columnNames[i];
    }
    public void actualizarDatos(String[][] nuevosDatos) {
        informe.setData(nuevosDatos); // Actualiza los datos en el objeto informe
        fireTableDataChanged();       // Notifica que todos los datos han cambiado
    }
}
