package br.senac.Faculdade.services;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.senac.Faculdade.entities.Aluno;
import br.senac.Faculdade.repositories.AlunoRepository;

@Service
public class DBService {

    @Autowired
    private AlunoRepository alunoRepository;

    public void instanciarBD() throws Exception {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        Aluno aluno1 = new Aluno("Marcos Monteiro", "12345-000", 101, "Bloco A", 8.5, 9.0, formato.parse("01/08/2022"), true);
        Aluno aluno2 = new Aluno("Rodrigo Silva", "54321-000", 202, "Ap 12", 7.0, 7.5, formato.parse("09/01/2018"), false);
        Aluno aluno3 = new Aluno("Marcos Pontes", "78910-000", 303, "Casa 3", 9.0, 8.8, formato.parse("01/01/2012"), false);
        Aluno aluno4 = new Aluno("Juca Monteiro", "45678-000", 404, "Bloco C", 6.0, 6.5, formato.parse("01/01/2020"), true);

        alunoRepository.saveAll(Arrays.asList(aluno1, aluno2, aluno3, aluno4));
    }
}