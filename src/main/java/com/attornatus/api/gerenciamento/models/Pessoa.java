package com.attornatus.api.gerenciamento.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table()
public class Pessoa {

    private Long idPessoa;
    private String nome;
    private LocalDate dataDeAniversario;
    private List<Endereco> enderecos = new ArrayList<>();


}
