package br.senac.Faculdade.resources;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import br.senac.Faculdade.entities.Aluno;
import br.senac.Faculdade.services.FaculdadeService;

@RestController
@RequestMapping("/aluno")
public class AlunoResource {

    @Autowired
    private FaculdadeService faculdadeService;

    @GetMapping(value = "/abertos")
    public ResponseEntity<List<Aluno>> listarAbertos() {
        List<Aluno> alunos = faculdadeService.listarAbertos();
        return ResponseEntity.ok().body(alunos);
    }

    @GetMapping(value = "/fechados")
    public ResponseEntity<List<Aluno>> listarFechados(){
        List<Aluno> alunos2 = faculdadeService.listarFechados();
        return ResponseEntity.ok().body(alunos2);
    }
}