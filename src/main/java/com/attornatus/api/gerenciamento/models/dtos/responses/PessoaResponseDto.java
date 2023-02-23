package com.attornatus.api.gerenciamento.models.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PessoaResponseDto{
        private Long idPessoa;
        private String nome;
        private LocalDate dataDeAniversario;
        private List<EnderecoResponseDto> enderecos;
}
