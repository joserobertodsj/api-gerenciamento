package com.attornatus.api.gerenciamento.models.dtos.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
        @JsonIgnore
        private Long idPessoa;
}
