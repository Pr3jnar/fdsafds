package svgeditor;
import javax.swing.table.AbstractTableModel;
import java.security.PrivateKey;
import java.util.HashMap;

public class TableModel1 extends AbstractTableModel {
    private Obrazek obrazek;
    private String[] hlavicka={"cislo","nazev"};


    public TableModel1(Obrazek obrazek) {
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

            if (columnIndex==0)
                return rowIndex+1;
            if (columnIndex == 1){

                   return obrazek.getTvars()
                    .get(rowIndex)
                    .getClass()
                    .getSimpleName();
    }return  null;
    }
}

