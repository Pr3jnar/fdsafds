package svgeditor;

import javax.swing.table.AbstractTableModel;
import java.awt.*;

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
                        return "x1";
                    case 1:
                        return "y1";
                    case 2:
                        return "x2";
                    case 3:
                        return "y2";
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
                        return usecka.getX1();

                    case 1:
                        return usecka.getY1();

                    case 2:
                        return usecka.getX2();
                    case 3:
                        return usecka.getY2();
                    case 4:
                        return colorToHex(usecka.getBarva());

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
    public void setValueAt(Object aValue, int rowIndex, int columnIndex)
    {
        if(columnIndex == 1)
        {
            switch (rowIndex)
            {
                case 0: usecka.setX1(Integer.parseInt(aValue.toString())); break;
                case 1: usecka.setY1(Integer.parseInt(aValue.toString()));break;
                case 2: usecka.setX2(Integer.parseInt(aValue.toString()));break;
                case 3: usecka.setY2(Integer.parseInt(aValue.toString()));break;
                case 4: usecka.setBarva(hexToColor(aValue.toString())); break;
                case 5: usecka.setTlouska(Integer.parseInt(aValue.toString()));break;
            }



            fireTableDataChanged();

        }
    }
    private Color hexToColor(String hex) {
        return Color.decode(hex);
    }
    private String colorToHex(Color color) {
        return String.format("#%02x%02x%02x", color.getRed(), color.getGreen(), color.getBlue());
    }
    }





