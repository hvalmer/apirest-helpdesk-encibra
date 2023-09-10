package io.github.hvalmer.helpdesk.repositoy;

import io.github.hvalmer.helpdesk.domain.Tecnico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {
}
