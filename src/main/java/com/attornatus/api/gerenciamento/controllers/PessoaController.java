package com.attornatus.api.gerenciamento.controllers;

import com.attornatus.api.gerenciamento.models.dtos.requests.EnderecoRequestDto;
import com.attornatus.api.gerenciamento.models.dtos.requests.PessoaRequestDto;
import com.attornatus.api.gerenciamento.models.dtos.responses.EnderecoResponseDto;
import com.attornatus.api.gerenciamento.models.dtos.responses.PessoaResponseDto;
import com.attornatus.api.gerenciamento.services.impl.EnderecoServiceImpl;
import com.attornatus.api.gerenciamento.services.impl.PessoaServiceImpl;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/pessoas")
@AllArgsConstructor
public class PessoaController {

    private final PessoaServiceImpl pessoaService;
    private final EnderecoServiceImpl enderecoService;

    @Autowired
    private ModelMapper modelMapper;



    //------------------------------------------------------------------------------------------------------------------

    @PostMapping
    public ResponseEntity<PessoaResponseDto> salvarPessoa (@RequestBody PessoaRequestDto pessoaRequestDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(pessoaService.salvar(pessoaRequestDto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<PessoaResponseDto> buscarPorId(@PathVariable(value = "id") Long idPessoa){
        return ResponseEntity.status(HttpStatus.OK).body(pessoaService.buscarPorId(idPessoa));

    }

    @GetMapping
    public ResponseEntity<Page<PessoaResponseDto>> buscarTodos(Pageable pageable){
        return ResponseEntity.status(HttpStatus.OK).body(pessoaService.buscarTodos(pageable));
    }

    @PutMapping("/{id}")
    public ResponseEntity<PessoaResponseDto> atualizarPessoa(@PathVariable(value = "id") Long id, @RequestBody PessoaRequestDto pessoaRequestDto){
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(pessoaService.atualizar(id, pessoaRequestDto));

    }

    @PostMapping("{idPessoa}/enderecos")
    public ResponseEntity<EnderecoResponseDto> salvarEndereco(@PathVariable Long idPessoa, @RequestBody EnderecoRequestDto enderecoRequestDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(enderecoService.salvarEndereco(idPessoa, enderecoRequestDto));
    }
}
