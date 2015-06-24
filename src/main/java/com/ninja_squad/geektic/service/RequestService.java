package com.ninja_squad.geektic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by Robin on 22/06/2015.
 */
@RestController
@Transactional
@RequestMapping("/ci")
public class RequestService {

    @Autowired
    CentreInteretDAO centreInteretDAO;


    @RequestMapping(method = GET)
    List<CentreInteret> findAllCI() {
        return centreInteretDAO.findAll();
    }
}
