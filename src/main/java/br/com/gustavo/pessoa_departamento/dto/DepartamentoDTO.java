package br.com.gustavo.pessoa_departamento.dto;

import br.com.gustavo.pessoa_departamento.entities.Departamento;

public class DepartamentoDTO {

    private Long id;

    private String nome;

    public DepartamentoDTO() {
    }

    public DepartamentoDTO(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public DepartamentoDTO(Departamento entity) {
        id = entity.getId();
        nome = entity.getNome();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
