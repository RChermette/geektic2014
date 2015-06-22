package com.ninja_squad.geektic.service;

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
@RequestMapping("/geeks/{sexe}/{centreInteret}")
public class SearchService {
    @RequestMapping(method = GET)
    List<Geek> searchAction(@PathVariable("sexe") String sexe,@PathVariable("centreInteret") int centreInteret, GeekDAO geekDao) {
        return geekDao.findBySexeAndCI(sexe, centreInteret);
    }
}
