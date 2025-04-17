package br.senac.Faculdade.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import br.senac.Faculdade.entities.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer> {

    @Query("SELECT alunos FROM Alunos alunos WHERE alunos.ativo = true ORDER BY alunos.nome")
    List<Aluno> listarTodosAbertos();

    @Query("SELECT a FROM Alunos a WHERE a.ativo = false ORDER BY a.nome")
    List<Aluno> listarFechados();

    Optional<Aluno> findByNome(String nome);
}