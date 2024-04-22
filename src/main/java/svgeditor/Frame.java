package svgeditor;
import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    Obrazek obrazek;
    HlPanel hlpanel;
    LeftPanel lfpanel;


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



    }
}
