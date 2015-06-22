package com.ninja_squad.geektic.service;

import java.util.List;

/**
 * Created by Robin on 22/06/2015.
 */
public class Search {
    public String sexe;
    public int centreInteret;

    public Search(String sexe, int centreInteret) {
        this.sexe = sexe;
        this.centreInteret = centreInteret;
    }
    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public int getCentreInteret() {
        return centreInteret;
    }

    public void setCentreInteret(int centreInteret) {
        this.centreInteret = centreInteret;
    }

    public List<Geek> compare()
    {
       String _sexe = this.sexe;
        int _centreInteret = this.centreInteret;



    }

}
