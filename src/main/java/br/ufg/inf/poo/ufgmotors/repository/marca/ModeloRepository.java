package br.ufg.inf.poo.ufgmotors.repository.marca;

import br.ufg.inf.poo.ufgmotors.model.marca.Marca;
import br.ufg.inf.poo.ufgmotors.model.marca.Modelo;
import org.springframework.data.repository.CrudRepository;

public interface ModeloRepository extends CrudRepository<Modelo, Long> {

    public Modelo findModeloByModelo(String modelo);

    public Boolean existsByModelo(String modelo);
}
