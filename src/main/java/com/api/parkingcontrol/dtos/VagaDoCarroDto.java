package com.api.parkingcontrol.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class VagaDoCarroDto {

    // essas anotações (Notblak,Size,etc) vem da dependencia spring-boot-starter-validation

    @NotBlank
    private String numVaga;
    @NotBlank
    @Size(max=7)
    private String placaDoCarro;
    @NotBlank
    private String marcaDoCarro;
    @NotBlank
    private String modeloDoCarro;
    @NotBlank
    private String corDoCarro;
    @NotBlank
    private String nomeDoResponsavel;
    @NotBlank
    private String apartamento;
    @NotBlank
    private String blocoApartamento;

    public String getNumVaga() {
        return numVaga;
    }

    public void setNumVaga(String numVaga) {
        this.numVaga = numVaga;
    }

    public String getPlacaDoCarro() {
        return placaDoCarro;
    }

    public void setPlacaDoCarro(String placaDoCarro) {
        this.placaDoCarro = placaDoCarro;
    }

    public String getMarcaDoCarro() {
        return marcaDoCarro;
    }

    public void setMarcaDoCarro(String marcaDoCarro) {
        this.marcaDoCarro = marcaDoCarro;
    }

    public String getModeloDoCarro() {
        return modeloDoCarro;
    }

    public void setModeloDoCarro(String modeloDoCarro) {
        this.modeloDoCarro = modeloDoCarro;
    }

    public String getCorDoCarro() {
        return corDoCarro;
    }

    public void setCorDoCarro(String corDoCarro) {
        this.corDoCarro = corDoCarro;
    }

    public String getNomeDoResponsavel() {
        return nomeDoResponsavel;
    }

    public void setNomeDoResponsavel(String nomeDoResponsavel) {
        this.nomeDoResponsavel = nomeDoResponsavel;
    }

    public String getApartamento() {
        return apartamento;
    }

    public void setApartamento(String apartamento) {
        this.apartamento = apartamento;
    }

    public String getBlocoApartamento() {
        return blocoApartamento;
    }

    public void setBlocoApartamento(String blocoApartamento) {
        this.blocoApartamento = blocoApartamento;
    }
}
