package com.attornatus.api.gerenciamento.models.dtos.requests;

public record EnderecoRequestDto(


        String logradouro,
        String cep,
        String numero,
        String cidade,
        Boolean enderecoPrincipal,
        Long idPessoa


        ) {
}
