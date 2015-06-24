package com.ninja_squad.geektic.service;

import javax.persistence.*;

/**
 * Created by Robin on 22/06/2015.
 */
@Entity(name="Geek")
@SequenceGenerator(name="USER_SEQ", sequenceName="user_seq")
public class Geek {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="USER_SEQ")
    public int id;
    public String sexe;
    public String nom;
    public String prenom;
    public String mail;
    public int id_ci;

    public int getId_ci() {
        return id_ci;
    }

    public void setId_ci(int id_ci) {
        this.id_ci = id_ci;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
