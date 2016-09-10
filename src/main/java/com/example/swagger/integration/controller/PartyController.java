package com.example.swagger.integration.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Adnan Khan on 9/10/2016.
 */

@RestController
public class PartyController {

    @RequestMapping(
            value = "/party",
            method = RequestMethod.GET
    )
    ResponseEntity getParty() {
                return new ResponseEntity("Party", HttpStatus.OK);
    }

}
