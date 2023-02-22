package com.attornatus.api.gerenciamento.models.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EnderecoResponseDto{

        private Long idEndereco;
        private String logradouro;
        private String cep;
        private String numero;
        private String cidade;
        private Boolean enderecoPrincipa;

}

