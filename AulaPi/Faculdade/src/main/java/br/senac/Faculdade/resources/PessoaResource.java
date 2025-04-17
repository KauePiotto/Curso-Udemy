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
import br.senac.Faculdade.entities.Pessoa;
import br.senac.Faculdade.services.DBServicePessoa;

@RestController
@RequestMapping(value = "/pessoa")
public class PessoaResource {
    @Autowired
    private DBServicePessoa servicePessoa;

    // Pesquisar Pessoa por ID
    @GetMapping(value = "/{id}")
    public ResponseEntity<Pessoa> findByid(@PathVariable Long id) {
        Pessoa pessoa = servicePessoa.findById(id);
        return ResponseEntity.ok().body(pessoa);
    }

    // Pesquisar Pessoa pelo nome
    @GetMapping(value = "/nome/{nome}")
    public ResponseEntity<Pessoa> findByNome(@PathVariable String nome) {
        Pessoa pessoa = servicePessoa.findByNome(nome);
        if (pessoa == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(pessoa);
    }

    // Pesquisar a pessoa pelo CPF
    @GetMapping(value = "/cpf/{cpf}")
    public ResponseEntity<Pessoa> findByCpf(@PathVariable String cpf) {
        Pessoa pessoa = servicePessoa.findByCpf(cpf);
        if (pessoa == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(pessoa);
    }

    // Pesquisar todas as pessoas
    @GetMapping
    public List<Pessoa> findAll() {
        List<Pessoa> pessoa = servicePessoa.findAll();
        return pessoa;
    }

    // Metodo Cadastrar Pessoa aluno
    @PostMapping
    public ResponseEntity<Pessoa> gravarAluno(@RequestBody Pessoa pessoa) {
        pessoa = servicePessoa.gravarAluno(pessoa);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(pessoa.getId()).toUri();
        return ResponseEntity.created(uri).body(pessoa);
    }

    // Metodo para Excluir um pessoa cadsatrado
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        servicePessoa.deletar(id);
        return ResponseEntity.noContent().build();
    }

    // Metodo para Alterar um aluno cadsatrado
    @PutMapping(value = "/{id}")
    public ResponseEntity<Pessoa> update(@PathVariable Long id, @RequestBody Pessoa pessoa) {
        Pessoa alterado = servicePessoa.update(id, pessoa);
        return ResponseEntity.ok().body(alterado);
    }
}