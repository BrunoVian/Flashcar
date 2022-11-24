package br.com.unipar.flashcar.exceptions;

public class DescricaoInvalidaException extends Exception {
    
   public DescricaoInvalidaException() {
        super("Descrição Vazia ou invalida. Verifique!");
    }
}
