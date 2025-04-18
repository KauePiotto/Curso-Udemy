package br.senac.Faculdade.configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import br.senac.Faculdade.services.DBService;

@Configuration
//@Profile("teste")
public class TesteConfiguracao implements CommandLineRunner {

    @Autowired
    private DBService dbService;

    @Override
    public void run(String... args) throws Exception {
        dbService.instanciarBD();
    }
}