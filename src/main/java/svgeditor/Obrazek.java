package svgeditor;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Obrazek {


    public List<MujTvar> getTvars() {
        return tvars;
    }

    public void addTvar(MujTvar tvar) {
        tvars.add(tvar);
    }

    private List<MujTvar> tvars = new ArrayList<>();

    public Obrazek() {

        addTvar(new Obdelnik(100,200,600,900,10,Color.RED));
        addTvar(new Obdelnik(200,200,400,900,10,Color.RED));
        addTvar(new Elipsa(200,200,500,100,20,Color.GRAY));
        addTvar(new Usecka(200,300,1000,200,50,Color.CYAN));
    }


}
