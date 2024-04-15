package svgeditor;
import javax.swing.*;

public class Table3 extends JTable {
    TableModelObdelnik model = new TableModelObdelnik(new Obdelnik());
    public Table3() {
        setModel(model);
        setTableHeader(null);
    }
}
