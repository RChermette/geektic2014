package com.ninja_squad.geektic.service;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Robin on 22/06/2015.
 */
@Repository
public class GeekDAO {

        @PersistenceContext
        private EntityManager entityManager;


        public List<Geek> findAll(){
            String query = "SELECT u FROM Utilisateur u";
            return entityManager.createQuery(query, Geek.class).getResultList();
        }

    public List<Geek> findBySexeAndCI(String sexe, int centreInteret){
        String query = "SELECT u FROM Utilisateur u WHERE Sexe = " + sexe;
        return entityManager.createQuery(query, Geek.class).getResultList();
    }
}
