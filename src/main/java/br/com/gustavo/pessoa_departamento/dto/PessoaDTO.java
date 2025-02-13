package br.com.gustavo.pessoa_departamento.dto;

import br.com.gustavo.pessoa_departamento.entities.Pessoa;

public class PessoaDTO {

    private Long id;
    private String nome;
    private Double salario;
    private Long departamentoId;

    public PessoaDTO() {
    }

    public PessoaDTO(Long id, String nome, Double salario, Long departamentoId) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.departamentoId = departamentoId;
    }

    public PessoaDTO(Pessoa entity) {
        id = entity.getId();
        nome = entity.getNome();
        salario = entity.getSalario();
        departamentoId = entity.getDepartamento().getId();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Double getSalario() {
        return salario;
    }

    public Long getDepartamentoId() {
        return departamentoId;
    }
}
