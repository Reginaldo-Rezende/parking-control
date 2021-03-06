package com.api.parkingcontrol.services;

import com.api.parkingcontrol.models.VagaDoCarroModel;
import com.api.parkingcontrol.repositories.VagaDoCarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class VagaDoCarroService {

   // @Autowired
   // VagaDoCarroRepository vagaDoCarroRepository;

    // fazer o codigo a cima é a msm coisa que fazer um construtor igual este abaixo

    final VagaDoCarroRepository vagaDoCarroRepository;

    public VagaDoCarroService(VagaDoCarroRepository vagaDoCarroRepository){
        this.vagaDoCarroRepository = vagaDoCarroRepository;
    }

    @Transactional
    public VagaDoCarroModel SALVAR(VagaDoCarroModel variaveLmodel) {

        return vagaDoCarroRepository.save(variaveLmodel);
    }

    public boolean existePlacaDoCarro(String placaDoCarro) {
     return vagaDoCarroRepository.existsByPlacaDoCarro(placaDoCarro);
    }

    public boolean existeNumeroDaVaga(String numVaga) {
        return vagaDoCarroRepository.existsByNumVaga(numVaga);
    }


    public boolean existeApartamentoAndBloco(String apartamento, String blocoApartamento) {
        return vagaDoCarroRepository.existsByApartamentoAndBlocoApartamento(apartamento,blocoApartamento);
    }

    public List<VagaDoCarroModel> trazerTodos() {
    return vagaDoCarroRepository.findAll();
    }

    public Optional<VagaDoCarroModel> encontrarPorId(UUID id) {
        return vagaDoCarroRepository.findById(id);
    }

    @Transactional
    public void deletar(VagaDoCarroModel vagaDoCarroModel) {
        vagaDoCarroRepository.delete(vagaDoCarroModel);
    }
}
