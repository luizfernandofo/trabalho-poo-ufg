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
public class Acessorios extends Carro{

    @Column(nullable = false)
    private Boolean Radio;

    @Column(nullable = false)
    private Boolean Tapetes;
    
    @Column(nullable = false)
    private Boolean Arcondicionado;

    @Column(nullable = false)
    private Boolean Aparelhdesom;


}
