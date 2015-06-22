package com.ninja_squad.geektic.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by Robin on 22/06/2015.
 */
@RestController
@Transactional
@RequestMapping("/api/new")
public class UserManager {

    @RequestMapping(method = GET)
    public HelloMessage sayHello() {
        return new HelloMessage();
    }
}
