package svgeditor;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;

public class Table2 extends JTable {

    private TableModel2 model;


    Obrazek obrazek = new Obrazek();

    public Table2() {
        TableModel2 mdl2 = new TableModel2(obrazek);
        setModel(mdl2);


        /*for (int i = 0; i < obr.getTvars().size(); i++) {
            model.addRow(new Object[]{i + 1, obr.getTvars().get(i).getClass().getSimpleName()});
        }*/
        setTableHeader(null);
    }}




