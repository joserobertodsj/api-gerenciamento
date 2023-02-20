package com.attornatus.api.gerenciamento.models.dtos.responses;

import com.attornatus.api.gerenciamento.models.Endereco;

import java.time.LocalDate;
import java.util.List;

public record PessoaResponseDto(
        Long idPessoa,
        String nome,
        LocalDate dataDeAniversario,
        List<Endereco> enderecos



) {
}
