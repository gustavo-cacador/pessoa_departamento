package br.com.gustavo.pessoa_departamento.repositories;

import br.com.gustavo.pessoa_departamento.entities.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
