package com.attornatus.api.gerenciamento.services;

import com.attornatus.api.gerenciamento.models.dtos.requests.PessoaRequestDto;
import com.attornatus.api.gerenciamento.models.dtos.responses.EnderecoResponseDto;
import com.attornatus.api.gerenciamento.models.dtos.responses.PessoaResponseDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PessoaService {
    PessoaResponseDto salvar (PessoaRequestDto pessoaRequestDto);
    PessoaResponseDto buscarPorId (Long idPessoa);
    Page<PessoaResponseDto> buscarTodos (Pageable pageable);
    PessoaResponseDto atualizar (Long idPessoa, PessoaRequestDto pessoaRequestDto);
    List<EnderecoResponseDto> buscarTodosEnderecos (Long idPessoa);

}
