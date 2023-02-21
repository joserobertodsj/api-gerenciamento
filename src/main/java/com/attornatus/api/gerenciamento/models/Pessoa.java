package com.attornatus.api.gerenciamento.models;

import jakarta.persistence.*;
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
@Table(name = "tb_pessoa")
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPessoa;
    private String nome;
    private LocalDate dataDeAniversario;
    @OneToMany(mappedBy = "pessoa", fetch =FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Endereco> enderecos = new ArrayList<>();


}
