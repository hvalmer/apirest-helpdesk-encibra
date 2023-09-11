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

}
