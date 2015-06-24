package com.ninja_squad.geektic.service;

import javax.persistence.*;

/**
 * Created by Robin on 24/06/2015.
 */
@Entity(name="CentreInteret")
@SequenceGenerator(name="USER_SEQ", sequenceName="user_seq")
public class CentreInteret {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="USER_SEQ")
    public int id;
    public String centreInteret;

    public String getCentreInteret() {
        return centreInteret;
    }

    public void setCentreInteret(String centreInteret) {
        this.centreInteret = centreInteret;
    }
}
