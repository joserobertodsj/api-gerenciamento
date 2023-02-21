package com.attornatus.api.gerenciamento.repositories;

import com.attornatus.api.gerenciamento.models.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
