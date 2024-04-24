    package svgeditor;
    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.*;

    public class Frame extends JFrame {
        private int startX,startY,endX,endY;
        Obrazek obrazek;
        HlPanel hlpanel;
        LeftPanel lfpanel;
        MouseAdapter obdelnikMouseListener;


        public Frame(Obrazek obrazek) {
            this.obrazek = obrazek;
            hlpanel = new HlPanel(obrazek);
            lfpanel = new LeftPanel(obrazek,hlpanel);

            setVisible(true);
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setBackground(Color.white);
            setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);


            add(hlpanel,BorderLayout.CENTER);
            add(lfpanel,BorderLayout.WEST);

            setVisible(true);

            JToolBar tlbar = new JToolBar();
            add(tlbar,BorderLayout.NORTH);

            JButton btn1 = new JButton("otevřít");
            tlbar.add(btn1);

            JButton btn2 = new JButton("uložit");
            tlbar.add(btn2);

            JToggleButton btn3 = new JToggleButton("obdelnik");
            tlbar.add(btn3);

            JButton btn4 = new JButton("elipsa");
            tlbar.add(btn4);

            JButton btn5 = new JButton("usecka");
            tlbar.add(btn5);


            obdelnikMouseListener = new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    super.mousePressed(e);

                    startX = e.getX();
                    startY = e.getY();
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    super.mouseReleased(e);

                    endX = e.getX();
                    endY = e.getY();

                    // Vykreslit tvar na základě počátečního a koncového bodu

                    obrazek.addTvar(new Obdelnik((Math.abs(endY - startY)), Math.abs(endX - startX), startX - lfpanel.getWidth(), startY - (tlbar.getHeight()), 10, Color.YELLOW));

                    hlpanel.repaint();
                    lfpanel.repaint();



                    // Resetovat počáteční a koncový bod
                    startX = startY = endX = endY = 0;
                }
            };
            btn3.addItemListener(new ItemListener() {
                public void itemStateChanged(ItemEvent e) {
                    if (e.getStateChange() == ItemEvent.SELECTED) {

                        // Změna: Přidání a odebrání MouseAdapteru podle stavu JToggleButtonu
                        addMouseListener(obdelnikMouseListener);
                        System.out.println("Tlačítko je zapnuté.");
                    } else {
                        // Změna: Přidání a odebrání MouseAdapteru podle stavu JToggleButtonu
                        removeMouseListener(obdelnikMouseListener);
                        System.out.println("Tlačítko je vypnuté.");
                    }
                }
            });
        }



    }
