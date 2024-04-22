package svgeditor;

import javax.swing.*;


import java.awt.*;


public class LeftPanel extends JPanel {
    HlPanel hlPanel;
    Obrazek obrazek;


    public LeftPanel(Obrazek obrazek, HlPanel hlpanel) {
        this.obrazek = obrazek;
        this.hlPanel = hlpanel;

        setPreferredSize(new Dimension(350,0));

        setBackground(Color.BLUE);
        setLayout(new GridLayout(2,1));
        JTable horniTabulka = new JTable();
        JTable dolniTabulka = new JTable();
        TableModel1 m1 = new TableModel1(new Obrazek());
        horniTabulka.setModel(m1);
        add(horniTabulka);
        add(dolniTabulka);



        horniTabulka.getSelectionModel().addListSelectionListener(e->{
            int row = horniTabulka.getSelectedRow();
            MujTvar tvar = obrazek.getTvars().get(row);

            if(tvar instanceof Obdelnik){
                TableModelObdelnik m2 = new TableModelObdelnik((Obdelnik)tvar);
                dolniTabulka.setModel(m2);


            }else if (tvar instanceof Elipsa) {
                TableModelElipsa m2 = new TableModelElipsa((Elipsa) tvar);
                dolniTabulka.setModel(m2);

            }else if (tvar instanceof Usecka) {
                TableModelUsecka m2 = new TableModelUsecka((Usecka) tvar);
                dolniTabulka.setModel(m2);

            }

            });


        dolniTabulka.addPropertyChangeListener(evt -> {
            hlPanel.repaint();
        });
    }}
