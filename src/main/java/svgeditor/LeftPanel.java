package svgeditor;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class LeftPanel extends JPanel {

    //Table1 table1 = new Table1();
    //Table3 table3 = new Table3();
    public void aktualizovatVzhledFramu() {
        // Získání kořenového panelu, který je součástí framu
        JRootPane rootPane = SwingUtilities.getRootPane(this);
        // Získání instance framu
        JFrame frame = (JFrame) rootPane.getParent();
        // Aktualizace vzhledu framu
        SwingUtilities.updateComponentTreeUI(frame);
    }
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

            }
            });


    }}


/*
* add(new JScrollPane(table1));
        add(new JScrollPane(table3));
        table3.setVisible(false);
        table1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

                if (!e.getValueIsAdjusting()) {
                    //int selectedRow = getSelectedRow();
                    System.out.println("Kolonka vybrana");
                    table3.setVisible(true);


                }
            }
        });*/