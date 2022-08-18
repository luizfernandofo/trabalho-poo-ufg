package br.ufg.inf.poo.ufgmotors.model.veiculo;

import br.ufg.inf.poo.ufgmotors.enumeration.CarroceriaEnum;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Acessorios")
public class Acessorios extends veiculo{

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private AcessoriosEnum Acessorios;

}
