package com.attornatus.api.gerenciamento.services;

import com.attornatus.api.gerenciamento.models.dtos.requests.EnderecoRequestDto;
import com.attornatus.api.gerenciamento.models.dtos.responses.EnderecoResponseDto;

public interface EnderecoService {
    EnderecoResponseDto salvarEndereco (EnderecoRequestDto enderecoRequestDto);
}
