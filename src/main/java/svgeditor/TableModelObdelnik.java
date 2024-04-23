package svgeditor;
import javax.swing.table.AbstractTableModel;
import java.awt.*;


public class TableModelObdelnik extends AbstractTableModel {
    Obdelnik obdelnik;
    public TableModelObdelnik(Obdelnik obdelnik){
        this.obdelnik = obdelnik;
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
                 return obdelnik.getPoziceX();

            case 1:
                return obdelnik.getPoziceY();

            case 2:
                return obdelnik.getSirka();
            case 3:
                return obdelnik.getVyska();
                case 4:
                    return colorToHex(obdelnik.getBarva());


            case 5:
                return obdelnik.getTlouska();

            default:
                return null;}
        }

    return null;}
    public boolean isCellEditable(int rowIndex, int columnIndex) {

        return columnIndex == 1;
    }
    private String colorToHex(Color color) {
        return String.format("#%02x%02x%02x", color.getRed(), color.getGreen(), color.getBlue());
    }
    public void setValueAt(Object aValue, int rowIndex, int columnIndex)
    {
        if(columnIndex == 1)
        {
            switch (rowIndex)
            {
                case 0: obdelnik.setPoziceX(Integer.parseInt(aValue.toString())); break;
                case 1: obdelnik.setPoziceY(Integer.parseInt(aValue.toString()));break;
                case 2: obdelnik.setSirka(Integer.parseInt(aValue.toString()));break;
                case 3: obdelnik.setVyska(Integer.parseInt(aValue.toString()));break;
                case 4: obdelnik.setBarva(hexToColor(aValue.toString())); break;
                //case 4: obdelnik.setBarva(Color.decode(aValue.toString()));break;
                case 5: obdelnik.setTlouska(Integer.parseInt(aValue.toString()));break;
            }


            fireTableDataChanged();

        }
    }
    private Color hexToColor(String hex) {
        return Color.decode(hex);
    }
    }

