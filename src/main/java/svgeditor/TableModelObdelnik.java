package svgeditor;
import javax.swing.table.AbstractTableModel;
import java.awt.*;


public class TableModelObdelnik extends AbstractTableModel {
    HlPanel hlPanel;
    Obdelnik obdelnik;
    public TableModelObdelnik(Obdelnik obdelnik){
        this.obdelnik = obdelnik;
    }


    private Obrazek obrazek;



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
                 return obdelnik.getPoziceX();

            case 1:
                return obdelnik.getPoziceY();

            case 2:
                return obdelnik.getSirka();
            case 3:
                return obdelnik.getVyska();
            case 4:
                return obdelnik.getBarva();

            case 5:
                return obdelnik.getTlouska();

            default:
                return null;}
        }

    return null;}
    public boolean isCellEditable(int rowIndex, int columnIndex) {

        return columnIndex == 1;
    }
    public void setValueAt(Object value, int rowIndex, int columnIndex) {
        // Nastav hodnotu v obdelníku podle změněné hodnoty v tabulce
        if (columnIndex == 1) {
            switch (rowIndex) {
                case 0:
                    obdelnik.setPoziceX((int) value);
                    break;
                case 1:
                    obdelnik.setPoziceY((int) value);
                    break;
                case 2:
                    obdelnik.setSirka((int) value);
                    break;
                case 3:
                    obdelnik.setVyska((int) value);
                    break;
                case 4:
                    obdelnik.setBarva((Color) value);
                    break;
                case 5:
                    obdelnik.setTlouska((int) value);
                    break;
            }

            // Překresli obrazec
            hlPanel.repaint();
        }
    }
}
/*
*
*
* */