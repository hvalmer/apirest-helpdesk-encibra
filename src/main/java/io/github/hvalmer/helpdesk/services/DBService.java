package io.github.hvalmer.helpdesk.services;

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
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Arrays;

public class DBService {

    @Autowired
    private TecnicoRepository tecnicoRepository;
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private ChamadoRepository chamadoRepository;
    @Autowired
    private BCryptPasswordEncoder encoder;

    public void instanciaDB() {

        Tecnico tec1 = new Tecnico(null, "Alexandre Barbosa", "29807072018", "alexander@email.com", encoder.encode("123"));
        tec1.addPerfil(Perfil.ADMIN);
        Tecnico tec2 = new Tecnico(null, "Carmen Albuquerque", "99578281005", "carmenalb@email.com", encoder.encode("123"));
        Tecnico tec3 = new Tecnico(null, "Emerson Souza", "80279961049", "emersouz@email.com", encoder.encode("123"));
        Tecnico tec4 = new Tecnico(null, "Geraldo Gomes", "23846049026", "gerald@email.com", encoder.encode("123"));
        Tecnico tec5 = new Tecnico(null, "Henrique Francio", "73503295046", "henrifran@email.com", encoder.encode("123"));

        Cliente cli1 = new Cliente(null, "Leandro Silva", "31656823055", "leandrosil@mail.com", encoder.encode("123"));
        Cliente cli2 = new Cliente(null, "Amanda Gonçalves", "66521713094", "amandagonc@mail.com", encoder.encode("123"));
        Cliente cli3 = new Cliente(null, "Francy Neiva", "84159262007", "franneiva@mail.com", encoder.encode("123"));
        Cliente cli4 = new Cliente(null, "Glaucia Barros", "18094699027", "glaub@mail.com", encoder.encode("123"));
        Cliente cli5 = new Cliente(null, "Guilhermina Chaves", "47080736072", "guichaves@mail.com", encoder.encode("123"));

        Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamada 01", "Primeiro chamado", tec1, cli1);
        Chamado c2 = new Chamado(null, Prioridade.BAIXA, Status.ABERTO, "Chamada 02", "Segundo chamado", tec2, cli3);
        Chamado c3 = new Chamado(null, Prioridade.ALTA, Status.ANDAMENTO, "Chamada 03", "Terceiro chamado", tec5, cli5);

        tecnicoRepository.saveAll(Arrays.asList(tec1, tec2, tec3, tec4, tec5));
        clienteRepository.saveAll(Arrays.asList(cli1, cli2, cli3, cli4, cli5));
        chamadoRepository.saveAll(Arrays.asList(c1, c2, c3));
    }
}
