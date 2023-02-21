package com.attornatus.api.gerenciamento.services.impl;

import com.attornatus.api.gerenciamento.models.dtos.requests.EnderecoRequestDto;
import com.attornatus.api.gerenciamento.models.dtos.responses.EnderecoResponseDto;
import com.attornatus.api.gerenciamento.repositories.EnderecoRepository;
import com.attornatus.api.gerenciamento.services.EnderecoService;
import org.springframework.stereotype.Service;

@Service
public class EnderecoServiceImpl implements EnderecoService {


    private EnderecoRepository enderecoRepository;

    public EnderecoServiceImpl(EnderecoRepository enderecoRepository) {
        this.enderecoRepository = enderecoRepository;
    }

    //------------------------------------------------------------------------------------------------------------------

    @Override
    public EnderecoResponseDto salvarEndereco(EnderecoRequestDto enderecoRequestDto) {
        return null;
    }
}
