package br.com.gustavo.pessoa_departamento.repositories;

import br.com.gustavo.pessoa_departamento.entities.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoRepository extends JpaRepository <Departamento, Long> {
}
