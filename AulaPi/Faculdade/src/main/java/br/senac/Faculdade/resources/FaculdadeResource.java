package br.senac.Faculdade.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.senac.Faculdade.entities.Aluno;
import br.senac.Faculdade.services.FaculdadeService;

@RestController
@RequestMapping(value = "/faculdade")
public class FaculdadeResource {
    @Autowired
    private FaculdadeService faculdadeService;

    // Pesquisa por ID do aluno
    @GetMapping(value = "/{id}")
    public ResponseEntity<Aluno> findByid(@PathVariable Integer id) {
        Aluno aluno = faculdadeService.findById(id);
        return ResponseEntity.ok().body(aluno);
    }

    // Pesquisa todos os alunos
    @GetMapping
    public List<Aluno> findAll() {
        List<Aluno> aluno = faculdadeService.findAll();
        return aluno;
    }

    // Pesquisa os alunos por nome
    @GetMapping(value = "/nome/{nome}")
    public ResponseEntity<Aluno> findByNome(@PathVariable String nome) {
        Aluno aluno = faculdadeService.findByNome(nome);
        return ResponseEntity.ok().body(aluno);
    }

    // Metodo para Cadastrar aluno pelo postman
    @PostMapping
    public ResponseEntity<Aluno> gravarAluno(@RequestBody Aluno aluno) {
        aluno = faculdadeService.gravarAluno(aluno);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{ra}").buildAndExpand(aluno.getRa()).toUri();
        return ResponseEntity.created(uri).body(aluno);
    }

    // Metodo para Excluir um aluno cadsatrado
    @DeleteMapping(value = "/{ra}")
    public ResponseEntity<Void> deletar(@PathVariable Integer ra) {
        faculdadeService.deletar(ra);
        return ResponseEntity.noContent().build();
    }

    // Metodo para Alterar um aluno cadsatrado
    @PutMapping(value = "/{ra}")
    public ResponseEntity<Aluno> update(@PathVariable Integer ra, @RequestBody Aluno aluno) {
        Aluno alterado = faculdadeService.update(ra, aluno);
        return ResponseEntity.ok().body(alterado);
    }
}