package com.attornatus.api.gerenciamento.models.dtos.requests;

import java.time.LocalDate;

public record PessoaRequestDto(

        String nome,
        LocalDate dataDeAniversario


) {



}
