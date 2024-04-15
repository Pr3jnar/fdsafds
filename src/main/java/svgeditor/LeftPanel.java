package svgeditor;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.util.EventListenerProxy;

public class LeftPanel extends JPanel {

    public LeftPanel() {
        Obrazek obrazek = new Obrazek();
        setPreferredSize(new Dimension(350,0));

        setBackground(Color.BLUE);
        setLayout(new GridLayout(2,1));
        JTable horniTabulka = new JTable();
        JTable dolniTabulka = new JTable();
        TableModel1 m1 = new TableModel1(new Obrazek());
        horniTabulka.setModel(m1);
        add(horniTabulka);


        horniTabulka.getSelectionModel().addListSelectionListener(e->{
            int row = horniTabulka.getSelectedRow();
            MujTvar tvar = obrazek.getTvars().get(row);

            if(tvar instanceof Obdelnik){
                TableModelObdelnik m2 = new TableModelObdelnik((Obdelnik)tvar);
                dolniTabulka.setModel(m2);
                add(dolniTabulka);

            }else if (tvar instanceof Elipsa) {
                TableModelElipsa m2 = new TableModelElipsa((Elipsa) tvar);
                dolniTabulka.setModel(m2);
                add(dolniTabulka);
            }else if (tvar instanceof Usecka) {
                TableModelUsecka m2 = new TableModelUsecka((Usecka) tvar);
                dolniTabulka.setModel(m2);
                add(dolniTabulka);
            }

            });





    }}
