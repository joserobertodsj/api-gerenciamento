package com.attornatus.api.gerenciamento.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table()
public class Endereco {

    private String logradouro;
    private String cep;
    private String numero;
    private String cidade;
    private Pessoa pessoa;
    private Boolean enderecoPrincipal;
}
