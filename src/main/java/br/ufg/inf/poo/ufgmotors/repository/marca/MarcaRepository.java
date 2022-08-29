package br.ufg.inf.poo.ufgmotors.repository.marca;

import br.ufg.inf.poo.ufgmotors.model.marca.Marca;
import org.springframework.data.repository.CrudRepository;

public interface MarcaRepository extends CrudRepository<Marca, Long> {

    public Marca findMarcaByMarca(String marca);

    // criar função para adicionar somente o modelo (UPDATE)
}
