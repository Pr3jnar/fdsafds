package svgeditor;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.plaf.ComponentUI;

public class Table1 extends JTable {
    public Table1() {
        TableModel1 tableModel1 = new TableModel1(new Obrazek());
        setModel(tableModel1);
        setTableHeader(null);


    }


}
