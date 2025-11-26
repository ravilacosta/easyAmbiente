package com.example.demo.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data

public class EnderecoDTO {
    private String cep;
    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;

    @JsonProperty("cidade")
    public String getCidade(){
        return localidade;
    }
    @JsonProperty("estado")
    public String getEstado(){
        returnuf;
    }


}
