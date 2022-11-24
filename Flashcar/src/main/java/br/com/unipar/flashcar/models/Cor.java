package br.com.unipar.flashcar.models;

import lombok.AllArgsConstructor;
import lombok.Data;


public class Cor {
    private int id;
    private String descricao;

    public Cor() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Cor{" + "id=" + id + ", descricao=" + descricao + '}';
    }

    

}
