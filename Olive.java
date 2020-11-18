package com.OlivePress;

public abstract class Olive {
    private OliveName name = OliveName.KALAMATA;
    private OliveColor color;
    private int oliveOil = 3;

    public Olive(OliveName name, OliveColor color, int oliveOil) {
        this.name = name;
        this.color = color;
        this.oliveOil = oliveOil;
    }

    public OliveName getName() {
        return name;
    }

    public void setName(OliveName name) {
        this.name = name;
    }

    public OliveColor getColor() {
        return color;
    }

    public void setColor(OliveColor color) {
        this.color = color;
    }

    public int Crush() {
        String msg = name + " from " + getOrigin() + " : " + oliveOil + "units";
        System.out.println(msg);
        return oliveOil;
    }

    public void setOlive(int olive) {
        this.oliveOil = olive;
    }

    public abstract String getOrigin();

    @Override
    public String toString() {
        return name.toString();
    }
}
