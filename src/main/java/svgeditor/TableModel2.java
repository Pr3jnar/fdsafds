package svgeditor;
import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class TableModel2 extends AbstractTableModel {



    private Obrazek obrazek;

    private String[] hlavicka = {"X", "Y", "Šířka", "Výška", "Barva"};

    public TableModel2(Obrazek obrazek) {
        this.obrazek = obrazek;
    }


    @Override
    public int getRowCount() {
        return obrazek.getTvars().size();
    }

    @Override
    public int getColumnCount() {
        return hlavicka.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        MujTvar tvar = obrazek.getTvars().get(rowIndex);
        switch (columnIndex) {

            case 0:
                if (tvar instanceof Obdelnik) {
                    return ((Obdelnik) tvar).getPoziceX();
                } else if (tvar instanceof Elipsa) {
                    return ((Elipsa) tvar).getPoziceX();
                } else if (tvar instanceof Usecka) {
                    return ((Usecka) tvar).getPoziceX();
                } else {
                    return null;
                }
            case 1:
                if (tvar instanceof Obdelnik) {
                    return ((Obdelnik) tvar).getPoziceY();
                } else if (tvar instanceof Elipsa) {
                    return ((Elipsa) tvar).getPoziceY();
                } else if (tvar instanceof Usecka) {
                    return ((Usecka) tvar).getPoziceY();
                } else {
                    return null;
                }
            case 2:
                if (tvar instanceof Obdelnik) {
                    return ((Obdelnik) tvar).getSirka();
                } else if (tvar instanceof Elipsa) {
                    return ((Elipsa) tvar).getSirka();
                } else if (tvar instanceof Usecka) {
                    return ((Usecka) tvar).getSirka();
                } else {
                    return null;
                }
            case 3:
                if (tvar instanceof Obdelnik) {
                    return ((Obdelnik) tvar).getVyska();
                } else if (tvar instanceof Elipsa) {
                    return ((Elipsa) tvar).getVyska();
                } else if (tvar instanceof Usecka) {
                    return ((Usecka) tvar).getVyska();
                } else {
                    return null;
                }
            case 4:
                if (tvar instanceof Obdelnik) {
                    return ((Obdelnik) tvar).getBarva();
                } else if (tvar instanceof Elipsa) {
                    return ((Elipsa) tvar).getBarva();
                } else if (tvar instanceof Usecka) {
                    return ((Usecka) tvar).getBarva();
                } else {
                    return null;
                }
            default:
                return null;
        }
    }


    }

