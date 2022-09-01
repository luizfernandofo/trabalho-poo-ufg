package br.ufg.inf.poo.ufgmotors.model.user;

import br.ufg.inf.poo.ufgmotors.model.veiculo.Carro;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "clientes")
public class Cliente extends User{

    @Column(nullable = false)
    private String endereco;

    @Column(nullable = false)
    private String cep;

    @Column(nullable = false)
    private String telefone;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "cliente_id")
    private List<Carro> carros;

}
