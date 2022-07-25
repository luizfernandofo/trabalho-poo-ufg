package br.ufg.inf.poo.ufgmotors.repository;

import br.ufg.inf.poo.ufgmotors.model.user.User;
import org.springframework.data.repository.CrudRepository;

/**
 *
 */
public interface UserRepository extends CrudRepository<User, Integer> {
}
