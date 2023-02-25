package com.attornatus.api.gerenciamento.models.dtos.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EnderecoRequestDto{
        @NotBlank
        private String logradouro;
        @NotBlank
        private String cep;
        @NotBlank
        private String numero;
        @NotBlank
        private String cidade;

        private Boolean enderecoPrincipal;
        @JsonIgnore
        private Long idPessoa;
}
