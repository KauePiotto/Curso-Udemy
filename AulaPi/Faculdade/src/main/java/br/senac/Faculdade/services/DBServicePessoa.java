package br.senac.Faculdade.services;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.senac.Faculdade.entities.Pessoa;
import br.senac.Faculdade.repositories.PessoaRepository;

@Service
public class DBServicePessoa {

    @Autowired
    private PessoaRepository pessoaRepository;

    public Pessoa findById(Long id) {
        Optional<Pessoa> pessoa = pessoaRepository.findById(id);
        return pessoa.orElse(null);
    }

    public Pessoa findByNome(String nome) {
        Optional<Pessoa> pessoa = pessoaRepository.findByNome(nome);
        return pessoa.orElse(null);
    }

    public Pessoa findByCpf(String cpf) {
        Optional<Pessoa> pessoa = pessoaRepository.findByCpf(cpf);
        return pessoa.orElse(null);
    }

    public List<Pessoa> findAll() {
        return pessoaRepository.findAll();
    }

    public Pessoa gravarAluno(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    // Metodo para Excluir pessoa
    public void deletar(Long id) {
        pessoaRepository.deleteById(id);
    }

    // Metodo para Alterar pessoa
    public Pessoa update(Long id, Pessoa pessoa) {
        Pessoa alterado = findById(id);
        if (alterado != null) {
            alterado.setNome(pessoa.getNome());
            alterado.setEmail(pessoa.getEmail());
            alterado.setCpf(pessoa.getCpf());
            alterado.setDataNaci(pessoa.getDataNaci());
            return pessoaRepository.save(alterado);
        }
        return null;
    }

    public void instanciarPessoa() {
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date dataNasc = formato.parse("14/06/2000");

            Pessoa pessoa = new Pessoa("Kaue Piotto De Lima Frerie", "Kauep@gmail.com", "432.546.666-01", dataNasc);
            pessoaRepository.saveAll(Arrays.asList(pessoa));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
