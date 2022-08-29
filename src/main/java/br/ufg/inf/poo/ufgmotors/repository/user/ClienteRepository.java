package br.ufg.inf.poo.ufgmotors.repository.user;

import br.ufg.inf.poo.ufgmotors.model.user.Cliente;
import br.ufg.inf.poo.ufgmotors.model.user.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 */
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
