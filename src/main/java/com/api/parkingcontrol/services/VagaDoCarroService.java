package com.api.parkingcontrol.services;

import com.api.parkingcontrol.repositories.VagaDoCarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VagaDoCarroService {

   // @Autowired
   // VagaDoCarroRepository vagaDoCarroRepository;

    // fazer o codigo a cima é a msm coisa que fazer um construtor igual este abaixo

    final VagaDoCarroRepository vagaDoCarroRepository;

    public VagaDoCarroService(VagaDoCarroRepository vagaDoCarroRepository){
        this.vagaDoCarroRepository = vagaDoCarroRepository;
    }

}
