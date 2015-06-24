package com.ninja_squad.geektic.service;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Robin on 24/06/2015.
 */
@Repository
public class CentreInteretDAO {
    @PersistenceContext
    private EntityManager entityManager;

    public CentreInteretDAO() {}


    public List<CentreInteret> findAll(){
        String query = "SELECT c FROM CentreInteret c";
        return entityManager.createQuery(query, CentreInteret.class).getResultList();
    }
}
