package br.ufg.inf.poo.ufgmotors.repository.acessorio;

import br.ufg.inf.poo.ufgmotors.model.acessorio.Acessorio;
import org.springframework.data.repository.CrudRepository;

public interface AcessorioRepository extends CrudRepository<Acessorio, Long> {

    public Acessorio findAcessorioByAcessorio(String acessorio);

    public Boolean existsByAcessorio(String acessorio);
}
