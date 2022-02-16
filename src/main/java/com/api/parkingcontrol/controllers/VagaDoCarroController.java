package com.api.parkingcontrol.controllers;

import com.api.parkingcontrol.dtos.VagaDoCarroDto;
import com.api.parkingcontrol.models.VagaDoCarroModel;
import com.api.parkingcontrol.services.VagaDoCarroService;
import org.springframework.beans.BeanUtils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "*",maxAge = 3600)
@RequestMapping("/parking-spot")
public class VagaDoCarroController {

    final VagaDoCarroService VARIAVELservice;

    public VagaDoCarroController(VagaDoCarroService vagaDoCarroService) {
        this.VARIAVELservice = vagaDoCarroService;
    }

    @PostMapping
    public ResponseEntity<Object> salvarVAGA (@RequestBody @Valid VagaDoCarroDto VARIAVELdto ){

        if(VARIAVELservice.existePlacaDoCarro(VARIAVELdto.getPlacaDoCarro())){
            return ResponseEntity.status(HttpStatus.CONFLICT) .body("ERRO: A placa do carro ja consta no sistema");
        }
        if(VARIAVELservice.existeNumeroDaVaga(VARIAVELdto.getNumVaga())){
            return ResponseEntity.status(HttpStatus.CONFLICT) .body("ERRO: O numero da vaga ja esta em uso");
        }
        if(VARIAVELservice.existeApartamentoAndBloco(VARIAVELdto.getApartamento(),VARIAVELdto.getBlocoApartamento())){
            return ResponseEntity.status(HttpStatus.CONFLICT) .body("ERRO: o apartamento/bloco ja esta cadastrado no sistema");
        }
        var VARIAVELmodel = new VagaDoCarroModel();
        BeanUtils.copyProperties(VARIAVELdto, VARIAVELmodel);
        VARIAVELmodel.setDataDoRegistro(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.CREATED).body(VARIAVELservice.SALVAR(VARIAVELmodel));

    }

    @GetMapping
    public ResponseEntity<List<VagaDoCarroModel>> retornarTodasAsVagas() {
           return ResponseEntity.status(HttpStatus.OK).body(VARIAVELservice.trazerTodos());
    }

   @GetMapping("/{id}")
    public ResponseEntity<Object> retornarUmaVaga(@PathVariable(value = "id") UUID id){
       Optional<VagaDoCarroModel> VariavelOpcional = VARIAVELservice.encontrarPorId(id);
       if (!VariavelOpcional.isPresent()){
           return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Vaga não encontrada");
       }
       return ResponseEntity.status(HttpStatus.OK).body(VariavelOpcional.get());
   }

}
