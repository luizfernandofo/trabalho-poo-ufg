package br.ufg.inf.poo.ufgmotors.model.veiculo;

import br.ufg.inf.poo.ufgmotors.enumeration.EstiloEnum;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "motos")
public class Moto extends Veiculo{

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private EstiloEnum estilo;
}
