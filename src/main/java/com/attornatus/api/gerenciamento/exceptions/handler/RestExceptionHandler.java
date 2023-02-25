package com.attornatus.api.gerenciamento.exceptions.handler;

import com.attornatus.api.gerenciamento.exceptions.ModelException;
import com.attornatus.api.gerenciamento.exceptions.details.MethodArgumentNotValidExceptionDetails;
import com.attornatus.api.gerenciamento.exceptions.details.ModelExceptionDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class RestExceptionHandler {
    @ExceptionHandler(ModelException.class)
    public ResponseEntity<?> handleModelException(ModelException e){
        ModelExceptionDetails modelExceptionDetails = ModelExceptionDetails.ModelExceptionDetailsBuilder
                .newBuilder()
                .withTitulo("ModelException")
                .withStatus(HttpStatus.NOT_FOUND.value())
                .withMensagem(e.getMessage())
                .withTimestamp(LocalDateTime.now())
                .build();
        return new ResponseEntity<>(modelExceptionDetails, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> handleMethodArgumentNotValidException(MethodArgumentNotValidException e){
        MethodArgumentNotValidExceptionDetails methodArgumentNotValidExceptionDetails = MethodArgumentNotValidExceptionDetails
                .MethodArgumentNotValidExceptionDetailsBuilder
                .newBuilder()
                .withTitulo("MethodArgumentNotValidException")
                .withStatus(HttpStatus.BAD_REQUEST.value())
                .withMensagem("Campo obrigatório!")
                .withTimestamp(LocalDateTime.now())
                .build();
        return new ResponseEntity<>(methodArgumentNotValidExceptionDetails, HttpStatus.BAD_REQUEST);
    }
}
