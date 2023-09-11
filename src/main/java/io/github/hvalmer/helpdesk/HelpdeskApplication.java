package io.github.hvalmer.helpdesk;

import io.github.hvalmer.helpdesk.domain.Chamado;
import io.github.hvalmer.helpdesk.domain.Cliente;
import io.github.hvalmer.helpdesk.domain.Tecnico;
import io.github.hvalmer.helpdesk.domain.enums.Perfil;
import io.github.hvalmer.helpdesk.domain.enums.Prioridade;
import io.github.hvalmer.helpdesk.domain.enums.Status;
import io.github.hvalmer.helpdesk.repositoy.ChamadoRepository;
import io.github.hvalmer.helpdesk.repositoy.ClienteRepository;
import io.github.hvalmer.helpdesk.repositoy.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class HelpdeskApplication implements CommandLineRunner {

    @Autowired
    private TecnicoRepository tecnicoRepository;
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private ChamadoRepository chamadoRepository;

    public static void main(String[] args) {
        SpringApplication.run(HelpdeskApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Tecnico tec1 = new Tecnico(null, "José dos Santos", "12345678910", "jsantos@gmail.com", "123");
        tec1.addPerfil(Perfil.ADMIN);

        Cliente cli1 = new Cliente(null, "Paulo Mendes", "90007216017", "pmendes@mail.com", "123");

        Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamada 01", "Primeiro chamado", tec1, cli1);

        tecnicoRepository.saveAll(Arrays.asList(tec1));
        clienteRepository.saveAll(Arrays.asList(cli1));
        chamadoRepository.saveAll(Arrays.asList(c1));
    }
}
