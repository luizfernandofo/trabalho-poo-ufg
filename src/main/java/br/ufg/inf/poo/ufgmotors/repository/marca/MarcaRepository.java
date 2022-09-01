package br.ufg.inf.poo.ufgmotors.repository.marca;

import br.ufg.inf.poo.ufgmotors.model.marca.Marca;
import br.ufg.inf.poo.ufgmotors.model.marca.Modelo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MarcaRepository extends CrudRepository<Marca, Long> {

    public Marca findMarcaByMarca(String marca);

}
