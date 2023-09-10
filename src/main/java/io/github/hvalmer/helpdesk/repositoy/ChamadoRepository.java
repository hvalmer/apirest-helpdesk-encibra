package io.github.hvalmer.helpdesk.repositoy;

import io.github.hvalmer.helpdesk.domain.Chamado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {
}
