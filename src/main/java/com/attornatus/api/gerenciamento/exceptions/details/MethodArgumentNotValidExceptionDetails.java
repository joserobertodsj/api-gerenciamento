package com.attornatus.api.gerenciamento.exceptions.details;

import lombok.Getter;

import java.time.LocalDateTime;
@Getter
public class MethodArgumentNotValidExceptionDetails {
    private String titulo;
    private int status;
    private LocalDateTime timestamp;
    private String mensagem;

    public MethodArgumentNotValidExceptionDetails(){

    }

    public static final class MethodArgumentNotValidExceptionDetailsBuilder {
        private String titulo;
        private int status;
        private LocalDateTime timestamp;
        private String mensagem;

        private MethodArgumentNotValidExceptionDetailsBuilder() {
        }

        public static MethodArgumentNotValidExceptionDetailsBuilder newBuilder() {
            return new MethodArgumentNotValidExceptionDetailsBuilder();
        }

        public MethodArgumentNotValidExceptionDetailsBuilder withTitulo(String titulo) {
            this.titulo = titulo;
            return this;
        }

        public MethodArgumentNotValidExceptionDetailsBuilder withStatus(int status) {
            this.status = status;
            return this;
        }

        public MethodArgumentNotValidExceptionDetailsBuilder withTimestamp(LocalDateTime timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public MethodArgumentNotValidExceptionDetailsBuilder withMensagem(String mensagem) {
            this.mensagem = mensagem;
            return this;
        }

        public MethodArgumentNotValidExceptionDetails build() {
            MethodArgumentNotValidExceptionDetails methodArgumentNotValidExceptionDetails = new MethodArgumentNotValidExceptionDetails();
            methodArgumentNotValidExceptionDetails.status = this.status;
            methodArgumentNotValidExceptionDetails.titulo = this.titulo;
            methodArgumentNotValidExceptionDetails.timestamp = this.timestamp;
            methodArgumentNotValidExceptionDetails.mensagem = this.mensagem;
            return methodArgumentNotValidExceptionDetails;
        }
    }
}
