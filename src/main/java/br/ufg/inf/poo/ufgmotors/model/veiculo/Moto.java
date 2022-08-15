package br.ufg.inf.poo.ufgmotors.model.veiculo;

import br.ufg.inf.poo.ufgmotors.enumeration.EstiloEnum;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "motos")
public class Moto {

    @Enumerated(EnumType.STRING)
    private EstiloEnum estilo;
}
