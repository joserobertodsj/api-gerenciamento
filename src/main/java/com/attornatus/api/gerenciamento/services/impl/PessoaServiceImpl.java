package com.attornatus.api.gerenciamento.services.impl;

import com.attornatus.api.gerenciamento.models.dtos.requests.PessoaRequestDto;
import com.attornatus.api.gerenciamento.models.dtos.responses.EnderecoResponseDto;
import com.attornatus.api.gerenciamento.models.dtos.responses.PessoaResponseDto;
import com.attornatus.api.gerenciamento.repositories.PessoaRepository;
import com.attornatus.api.gerenciamento.services.PessoaService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaServiceImpl implements PessoaService {

    private PessoaRepository pessoaRepository;

    public PessoaServiceImpl(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }


    //------------------------------------------------------------------------------------------------------------------

    @Override
    public PessoaResponseDto salvar(PessoaRequestDto pessoaRequestDto) {
        return null;
    }

    @Override
    public PessoaResponseDto buscarPorId(Long idPessoa) {
        return null;
    }

    @Override
    public Page<PessoaResponseDto> buscarTodos(Pageable pageable) {
        return null;
    }

    @Override
    public PessoaResponseDto atualizar(Long idPessoa, PessoaRequestDto pessoaRequestDto) {
        return null;
    }

    @Override
    public List<EnderecoResponseDto> buscarTodosEnderecos(Long idPessoa) {
        return null;
    }
}
