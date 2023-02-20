package com.attornatus.api.gerenciamento.models.dtos.responses;

import com.attornatus.api.gerenciamento.models.Pessoa;

public record EnderecoResponseDto(

        Long idEndereco,
        String logradouro,
        String cep,
        String numero,
        String cidade,
        Pessoa pessoa,
        Boolean enderecoPrincipal



) {
}
