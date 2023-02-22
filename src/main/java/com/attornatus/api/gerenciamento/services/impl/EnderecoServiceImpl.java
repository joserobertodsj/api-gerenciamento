package com.attornatus.api.gerenciamento.services.impl;

import com.attornatus.api.gerenciamento.models.dtos.requests.EnderecoRequestDto;
import com.attornatus.api.gerenciamento.models.dtos.responses.EnderecoResponseDto;
import com.attornatus.api.gerenciamento.repositories.EnderecoRepository;
import com.attornatus.api.gerenciamento.services.EnderecoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EnderecoServiceImpl implements EnderecoService {


    private final EnderecoRepository enderecoRepository;


    //------------------------------------------------------------------------------------------------------------------

    @Override
    public EnderecoResponseDto salvarEndereco(EnderecoRequestDto enderecoRequestDto) {
        return null;
    }
}
