package br.senac.Faculdade.configurations;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.senac.Faculdade.services.DBServicePessoa;

@Configuration
//@Profile("Densv")
public class TesteDesenv implements CommandLineRunner {
    @Autowired
    DBServicePessoa dbServicePessoa;

    @Override
    public void run(String... args) throws ParseException {
        dbServicePessoa.instanciarPessoa();
    }
}