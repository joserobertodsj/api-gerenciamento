package com.attornatus.api.gerenciamento.services.impl;

import com.attornatus.api.gerenciamento.exceptions.ModelException;
import com.attornatus.api.gerenciamento.models.Pessoa;
import com.attornatus.api.gerenciamento.models.dtos.requests.PessoaRequestDto;
import com.attornatus.api.gerenciamento.models.dtos.responses.EnderecoResponseDto;
import com.attornatus.api.gerenciamento.models.dtos.responses.PessoaResponseDto;
import com.attornatus.api.gerenciamento.repositories.PessoaRepository;
import com.attornatus.api.gerenciamento.services.PessoaService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PessoaServiceImpl implements PessoaService {


    private final ModelMapper modelMapper;
    private final PessoaRepository pessoaRepository;




    //------------------------------------------------------------------------------------------------------------------

    @Override
    public PessoaResponseDto salvar(PessoaRequestDto pessoaRequestDto) {

        Pessoa pessoa = pessoaRepository.save(modelMapper.map(pessoaRequestDto, Pessoa.class));
        return modelMapper.map(pessoa, PessoaResponseDto.class);
    }

    @Override
    public PessoaResponseDto buscarPorId(Long idPessoa) {
        return modelMapper.map(pessoaRepository.findById(idPessoa)
                .orElseThrow(ModelException::new), PessoaResponseDto.class);

    }

    @Override
    public Page<PessoaResponseDto> buscarTodos(Pageable pageable) {
        return pessoaRepository.findAll(pageable).map(pessoa -> modelMapper.map(pessoa, PessoaResponseDto.class));
    }

    @Override
    public PessoaResponseDto atualizar(Long idPessoa, PessoaRequestDto pessoaRequestDto) {
        Pessoa pessoa = modelMapper.map(buscarPorId(idPessoa), Pessoa.class);
        atualizarAtributos(pessoaRequestDto, pessoa);
        pessoaRepository.save(pessoa);
        return modelMapper.map(pessoa, PessoaResponseDto.class);


    }

    @Override
    public List<EnderecoResponseDto> buscarTodosEnderecos(Long idPessoa) {
        return null;
    }

    private void atualizarAtributos(PessoaRequestDto pessoaRequestDto, Pessoa pessoa){
        pessoa.setNome(pessoaRequestDto.getNome());
        pessoa.setDataDeAniversario(pessoaRequestDto.getDataDeAniversario());
    }
}


