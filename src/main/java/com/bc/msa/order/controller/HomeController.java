package com.bc.msa.order.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class HomeController {
    @GetMapping
    public RedirectView redirectToSwagger() {
        return new RedirectView("/swagger-ui.html");
    }
}
