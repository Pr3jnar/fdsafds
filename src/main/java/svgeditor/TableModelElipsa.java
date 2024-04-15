package svgeditor;

import javax.swing.table.AbstractTableModel;

public class TableModelElipsa extends AbstractTableModel {
    Elipsa elipsa;
    public TableModelElipsa(Elipsa elipsa){

        this.elipsa = elipsa;
    }
    @Override
    public int getRowCount() {
        return 6;
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex==0){
            switch (rowIndex){
                case 0:
                    return "poziceX";
                case 1:
                    return "poziceY";
                case 2:
                    return "sirka";
                case 3:
                    return "vyska";
                case 4:
                    return "barva";
                case 5:
                    return "tloustka";
                default:
                    return null;
            }}
        if (columnIndex==1){


            switch (rowIndex){
                case 0:
                    return elipsa.getPoziceX();

                case 1:
                    return elipsa.getPoziceY();

                case 2:
                    return elipsa.getSirka();
                case 3:
                    return elipsa.getVyska();
                case 4:
                    return elipsa.getBarva();

                case 5:
                    return elipsa.getTlouska();

                default:
                    return null;}
        }
        return null;}
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        // Make cells editable only in specific columns (e.g., column 0)
        return columnIndex == 1;
    }
    }


