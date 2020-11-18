package com.OlivePress;

import java.util.List;

public class OlivePress implements Press{
    private int currentOil;
    public int getOil(List<Olive> olives){
        int totalOil = currentOil;
        for (Olive o: olives) {
//            System.out.println(o.getName());
            totalOil += o.Crush();
        }
        return totalOil;
    }

    @Override
    public void setOil(int oil) {
        this.currentOil = oil;
    }
}
