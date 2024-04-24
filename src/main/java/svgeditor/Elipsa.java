package svgeditor;
import java.awt.*;


public class Elipsa implements MujTvar{
    private int vyska;
    private int sirka;
    private int poziceX;
    private int poziceY;
    private int tlouska;
    private Color barva;

    public Elipsa(int vyska, int sirka, int poziceX, int poziceY, int tlouska, Color barva) {
        this.vyska = vyska;
        this.sirka = sirka;
        this.poziceX = poziceX;
        this.poziceY = poziceY;
        this.tlouska = tlouska;
        this.barva = barva;
    }

    public int getVyska() {
        return vyska;
    }

    public void setVyska(int vyska) {
        this.vyska = vyska;
    }

    public int getSirka() {
        return sirka;
    }

    public void setSirka(int sirka) {
        this.sirka = sirka;
    }

    public int getPoziceX() {
        return poziceX;
    }

    public void setPoziceX(int poziceX) {
        this.poziceX = poziceX;
    }

    public int getPoziceY() {
        return poziceY;
    }

    public void setPoziceY(int poziceY) {
        this.poziceY = poziceY;
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
        g.drawOval(poziceX,poziceY,sirka,vyska);

    }
}
