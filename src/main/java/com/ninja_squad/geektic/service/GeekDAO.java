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

    public GeekDAO() {}


        public List<Geek> findAll(){
            String query = "SELECT u FROM Geek u";
            return entityManager.createQuery(query, Geek.class).getResultList();
        }

    public List<Geek> findBySexeAndCI(String sexe, int centreInteret){
        String query = "SELECT g FROM Geek g WHERE g.sexe = '" + sexe+"'";
        return entityManager.createQuery(query, Geek.class).getResultList();
    }
}
