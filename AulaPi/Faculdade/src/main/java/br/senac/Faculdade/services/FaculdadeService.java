package br.senac.Faculdade.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.senac.Faculdade.entities.Aluno;
import br.senac.Faculdade.repositories.AlunoRepository;

@Service
public class FaculdadeService {

    @Autowired
    private AlunoRepository alunoRepository;

    // Pesquisar todos os alunos por ID
    public Aluno findById(Integer ra) {
        Optional<Aluno> aluno = alunoRepository.findById(ra);
        return aluno.orElse(null);
    }

    // Pesquisar todos os alunos ativos
    public List<Aluno> listarAbertos() {
        return alunoRepository.listarTodosAbertos();
    }

    // Pesquisar todos os alunos inativos
    public List<Aluno> listarFechados() {
        return alunoRepository.listarFechados();
    }

    // Pequisar todos os alunos cadastrdas
    public List<Aluno> findAll() {
        return alunoRepository.findAll();
    }

    // Pesquisar por nome de todaos os alunos cadastrdas
    public Aluno findByNome(String nome) {
        Optional<Aluno> aluno = alunoRepository.findByNome(nome);
        return aluno.orElse(null);
    }

    // Metodo para adicionar aluno
    public Aluno gravarAluno(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    // Metodo para Excluir aluno
    public void deletar(Integer ra) {
        alunoRepository.deleteById(ra);
    }

    // Metodo para Alterar aluno
    public Aluno update(Integer ra, Aluno aluno) {
        Aluno alterado = findById(ra);
        if (alterado != null) {
            alterado.setNome(aluno.getNome());
            alterado.setDataCadastro(aluno.getDataCadastro());
            alterado.setAtivo(aluno.isAtivo());
            return alunoRepository.save(alterado);
        }
        return null;
    }
}