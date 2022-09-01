package br.ufg.inf.poo.ufgmotors.model.veiculo;

import br.ufg.inf.poo.ufgmotors.model.acessorio.Acessorio;
import br.ufg.inf.poo.ufgmotors.model.marca.Modelo;
import br.ufg.inf.poo.ufgmotors.model.user.Cliente;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@MappedSuperclass
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String placa;

    @Column(nullable = false)
    private String chassi;

    @Column(nullable = false)
    private Long quilometragem;

    @Column(nullable = false)
    private String cor;

    @ManyToOne(fetch = FetchType.LAZY)
    private Modelo modelo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id")
    @Cascade(value = CascadeType.ALL)
    private Cliente cliente_id;

}
