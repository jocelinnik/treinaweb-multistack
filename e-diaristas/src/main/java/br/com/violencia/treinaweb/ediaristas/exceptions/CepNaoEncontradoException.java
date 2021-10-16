package br.com.violencia.treinaweb.ediaristas.exceptions;

public class CepNaoEncontradoException extends RuntimeException {
    
    public CepNaoEncontradoException(String message){
        super(message);
    }
}
