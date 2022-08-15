package br.ufg.inf.poo.ufgmotors.repository.veiculo;

import br.ufg.inf.poo.ufgmotors.model.veiculo.Carro;
import br.ufg.inf.poo.ufgmotors.model.veiculo.Moto;
import org.springframework.data.repository.CrudRepository;

public interface MotoRepository extends CrudRepository<Moto, Long> {
}
