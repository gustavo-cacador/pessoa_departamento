package br.com.gustavo.pessoa_departamento.dto;

import br.com.gustavo.pessoa_departamento.entities.Pessoa;

public class PessoaDepartamentoDTO {

    private Long id;
    private String nome;
    private Double salario;

    private DepartamentoDTO departamento;

    public PessoaDepartamentoDTO() {
    }

    public PessoaDepartamentoDTO(Long id, String nome, Double salario, DepartamentoDTO departamento) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    public PessoaDepartamentoDTO(Pessoa entity) {
        id = entity.getId();
        nome = entity.getNome();
        salario = entity.getSalario();
        departamento = new DepartamentoDTO(entity.getDepartamento());
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

    public DepartamentoDTO getDepartamento() {
        return departamento;
    }
}
