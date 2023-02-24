package com.attornatus.api.gerenciamento.exceptions.details;

import lombok.Getter;

import java.time.LocalDateTime;
@Getter
public class ModelExceptionDetails {
    private String titulo;
    private int status;
    private LocalDateTime timestamp;
    private String mensagem;

    private ModelExceptionDetails(){

    }

    public static final class ModelExceptionDetailsBuilder {
        private String titulo;
        private int status;
        private LocalDateTime timestamp;
        private String mensagem;

        private ModelExceptionDetailsBuilder() {
        }

        public static ModelExceptionDetailsBuilder newBuilder() {
            return new ModelExceptionDetailsBuilder();
        }

        public ModelExceptionDetailsBuilder withTitulo(String titulo) {
            this.titulo = titulo;
            return this;
        }

        public ModelExceptionDetailsBuilder withStatus(int status) {
            this.status = status;
            return this;
        }

        public ModelExceptionDetailsBuilder withTimestamp(LocalDateTime timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public ModelExceptionDetailsBuilder withMensagem(String mensagem) {
            this.mensagem = mensagem;
            return this;
        }

        public ModelExceptionDetails build() {
            ModelExceptionDetails modelExceptionDetails = new ModelExceptionDetails();
            modelExceptionDetails.status = this.status;
            modelExceptionDetails.titulo = this.titulo;
            modelExceptionDetails.mensagem = this.mensagem;
            modelExceptionDetails.timestamp = this.timestamp;
            return modelExceptionDetails;
        }
    }
}
