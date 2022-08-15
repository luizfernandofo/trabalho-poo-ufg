package br.ufg.inf.poo.ufgmotors.repository.user;

import br.ufg.inf.poo.ufgmotors.model.user.Admin;
import org.springframework.data.repository.CrudRepository;

public interface AdminRepository extends CrudRepository<Admin, Long> {
}
