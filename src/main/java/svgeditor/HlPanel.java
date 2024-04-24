package svgeditor;
import javax.swing.*;
import java.awt.*;



public class HlPanel extends JPanel {


    private Obrazek obrazek;

    public HlPanel(Obrazek obrazek){
        this.obrazek = obrazek;

    }

    public void paintComponent( Graphics g){

        super.paintComponent(g);
        Graphics2D graphics2D=(Graphics2D) g;

        for (MujTvar tvar:obrazek.getTvars()
             ) {
            tvar.Draw(graphics2D);
        }

    }



}
