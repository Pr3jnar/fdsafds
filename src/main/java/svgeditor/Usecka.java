package svgeditor;
import java.awt.*;

public class Usecka implements MujTvar{
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int tlouska;
    private Color barva;

    public Usecka(int x1, int y1, int x2, int y2, int tlouska, Color barva) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.tlouska = tlouska;
        this.barva = barva;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
            this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getTlouska() {
        return tlouska;
    }

    public void setTlouska(int tlouska) {
        this.tlouska = tlouska;
    }

    public Color getBarva() {
        return barva;
    }

    public void setBarva(Color barva) {
        this.barva = barva;
    }

    @Override
    public void Draw(Graphics2D g) {
        g.setColor(barva);
        g.setStroke(new BasicStroke(tlouska));
        g.drawLine(x1,y1,x2,y2);
    }
}
