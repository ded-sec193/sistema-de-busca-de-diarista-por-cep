package com.ediarista.ediarista.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ViacepResponse {
    private String cep ;

    private String logradouro;

    private String uf;

    private String localidade;

    private String complemento;

    private String bairro;
    
    private String ibge;

}
