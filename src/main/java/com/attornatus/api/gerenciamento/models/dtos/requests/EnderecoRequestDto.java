package com.attornatus.api.gerenciamento.models.dtos.requests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EnderecoRequestDto{

        private String logradouro;
        private String cep;
        private String numero;
        private String cidade;
        private Boolean enderecoPrincipal;
        private Long idPessoa;
}
