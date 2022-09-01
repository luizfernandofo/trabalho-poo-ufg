package br.ufg.inf.poo.ufgmotors.model.veiculo;

import br.ufg.inf.poo.ufgmotors.enumeration.CarroceriaEnum;
import br.ufg.inf.poo.ufgmotors.model.acessorio.Acessorio;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "carros")
public class Carro extends Veiculo{

    @Column(nullable = false)
    //@Enumerated(EnumType.STRING)
    private String carroceria;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "carros_acessorios",
            joinColumns =
            @JoinColumn(name = "carro_id", referencedColumnName = "id"),
            inverseJoinColumns =
            @JoinColumn(name = "acessorio_id", referencedColumnName = "id")
    )
    private List<Acessorio> acessorios;

}
