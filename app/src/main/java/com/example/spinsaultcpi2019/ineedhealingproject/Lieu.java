package com.example.spinsaultcpi2019.ineedhealingproject;

/**
 * Created by spinsault.cpi2019 on 25/01/2018.
 */

public class Lieu {

    private String name;
    private String ville;

    public Lieu(String n,String v) {
        name = n;
        ville = v;

    }
    public String getName() {
        return name;
    }
    public String getVille() {
        return ville;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setVille(String name) {
        this.name = ville;
    }

}
