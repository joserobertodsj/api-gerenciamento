package com.attornatus.api.gerenciamento.services.impl;

import com.attornatus.api.gerenciamento.exceptions.ModelException;
import com.attornatus.api.gerenciamento.models.Endereco;
import com.attornatus.api.gerenciamento.models.Pessoa;
import com.attornatus.api.gerenciamento.models.dtos.requests.EnderecoRequestDto;
import com.attornatus.api.gerenciamento.models.dtos.responses.EnderecoResponseDto;
import com.attornatus.api.gerenciamento.repositories.EnderecoRepository;
import com.attornatus.api.gerenciamento.services.EnderecoService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EnderecoServiceImpl implements EnderecoService {


    private final EnderecoRepository enderecoRepository;
    private final PessoaServiceImpl pessoaService;


    private final ModelMapper modelMapper;


    //------------------------------------------------------------------------------------------------------------------

    public EnderecoResponseDto buscarPorId(Long idEndereco){
        return modelMapper.map(enderecoRepository.findById(idEndereco).orElseThrow(ModelException::new), EnderecoResponseDto.class);
    }

    @Override
    public EnderecoResponseDto salvarEndereco(Long idPessoa, EnderecoRequestDto enderecoRequestDto) {

        Pessoa pessoa = modelMapper.map(pessoaService.buscarPorId(idPessoa), Pessoa.class);
        var endereco = modelMapper.map(enderecoRequestDto, Endereco.class);
        endereco.setEnderecoPrincipal(pessoa.getEnderecos().isEmpty());
        endereco.setPessoa(pessoa);
        enderecoRepository.save(endereco);
        return modelMapper.map(endereco, EnderecoResponseDto.class);
    }


    public Endereco atualizarEnderecoPrincipal(Long idEndereco){
        var endereco = modelMapper.map(enderecoRepository.findById(idEndereco), Endereco.class);

        endereco.getPessoa().getEnderecos().forEach(e ->{
            e.setEnderecoPrincipal(false);
            enderecoRepository.save(e);
        });
        endereco.setEnderecoPrincipal(true);

        return enderecoRepository.save(endereco);
    }




}
