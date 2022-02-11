package com.api.parkingcontrol.controllers;

import com.api.parkingcontrol.services.VagaDoCarroService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*",maxAge = 3600)
@RequestMapping("/parking-spot")
public class VagaDoCarroController {

    final VagaDoCarroService vagaDoCarroService;

    public VagaDoCarroController(VagaDoCarroService vagaDoCarroService) {
        this.vagaDoCarroService = vagaDoCarroService;
    }
}
