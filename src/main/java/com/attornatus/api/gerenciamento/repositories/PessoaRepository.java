package com.attornatus.api.gerenciamento.repositories;

import com.attornatus.api.gerenciamento.models.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long > {
}
