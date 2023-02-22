package com.attornatus.api.gerenciamento.models.dtos.requests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PessoaRequestDto{

        private String nome;
        private LocalDate dataDeAniversario;
}
