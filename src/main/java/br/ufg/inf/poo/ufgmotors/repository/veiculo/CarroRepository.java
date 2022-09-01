package br.ufg.inf.poo.ufgmotors.repository.veiculo;

import br.ufg.inf.poo.ufgmotors.model.veiculo.Carro;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CarroRepository extends CrudRepository<Carro, Long> {

   /* @Modifying
    @Query("update Carro c set c = carro where c.id == carro.id")
    void updateCarro(@Param("carro") Carro carro);*/
}
