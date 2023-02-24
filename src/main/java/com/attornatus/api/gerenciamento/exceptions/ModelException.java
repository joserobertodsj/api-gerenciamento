package com.attornatus.api.gerenciamento.exceptions;
public class ModelException extends RuntimeException {
    public ModelException(Long id){
        super(MensagemFormatada(id));
    }

    private static String MensagemFormatada(Long id) {
        return String.format("O Id '%d' não foi encontrado!", id);
    }
}
