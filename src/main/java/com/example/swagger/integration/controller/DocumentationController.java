package com.example.swagger.integration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springfox.documentation.annotations.ApiIgnore;

/**
 * Created by Adnan Khan on 9/10/2016.
 */
@ApiIgnore
@Controller
public class DocumentationController {

    @RequestMapping
            (
                    value = "/documentation",
                    method = RequestMethod.GET
            )
    public String documentation() {
        return "redirect:swagger-ui.html";
    }
}
