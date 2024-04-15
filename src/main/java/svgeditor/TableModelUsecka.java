package svgeditor;

import javax.swing.table.AbstractTableModel;

public class TableModelUsecka extends AbstractTableModel {


        Usecka usecka;
        public TableModelUsecka(Usecka usecka){

            this.usecka = usecka;
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
                        return usecka.getPoziceX();

                    case 1:
                        return usecka.getPoziceY();

                    case 2:
                        return usecka.getSirka();
                    case 3:
                        return usecka.getVyska();
                    case 4:
                        return usecka.getBarva();

                    case 5:
                        return usecka.getTlouska();

                    default:
                        return null;}
            }
            return null;}
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        // Make cells editable only in specific columns (e.g., column 0)
        return columnIndex == 1;
    }
    }





