package svgeditor;
import javax.swing.*;

public class Table3 extends JTable {
    TableModelObdelnik model = new TableModelObdelnik(new Obrazek());
    public Table3() {
        setModel(model);
        setTableHeader(null);
    }
}
