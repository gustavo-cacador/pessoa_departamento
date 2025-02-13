package br.com.gustavo.pessoa_departamento.services;

import br.com.gustavo.pessoa_departamento.dto.PessoaDTO;
import br.com.gustavo.pessoa_departamento.dto.PessoaDepartamentoDTO;
import br.com.gustavo.pessoa_departamento.entities.Departamento;
import br.com.gustavo.pessoa_departamento.entities.Pessoa;
import br.com.gustavo.pessoa_departamento.repositories.DepartamentoRepository;
import br.com.gustavo.pessoa_departamento.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private DepartamentoRepository departamentoRepository;

    @Transactional
    public PessoaDepartamentoDTO insert(PessoaDepartamentoDTO dto) {

        Pessoa entity = new Pessoa();
        entity.setNome(dto.getNome());
        entity.setSalario(dto.getSalario());

        // aqui estamos referenciando departamento para qnd formos criar pessoa, retornar o nome do departamento dando o parametro departamento_id
        Departamento departamento = departamentoRepository.getReferenceById(dto.getDepartamento().getId());

        /*
        Departamento departamento = new Departamento();
        departamento.setId(dto.getDepartamento().getId());
         */

        entity.setDepartamento(departamento);

        entity = pessoaRepository.save(entity);

        return new PessoaDepartamentoDTO(entity);
    }

    @Transactional
    public PessoaDTO insert(PessoaDTO dto) {

        Pessoa entity = new Pessoa();
        entity.setNome(dto.getNome());
        entity.setSalario(dto.getSalario());

        // aqui estamos referenciando departamento para qnd formos criar pessoa, retornar o nome do departamento dando o parametro departamento_id
        Departamento departamento = departamentoRepository.getReferenceById(dto.getDepartamentoId());

        /*
        Departamento departamento = new Departamento();
        departamento.setId(dto.getDepartamentoId());
         */

        entity.setDepartamento(departamento);

        entity = pessoaRepository.save(entity);

        return new PessoaDTO(entity);
    }
}
