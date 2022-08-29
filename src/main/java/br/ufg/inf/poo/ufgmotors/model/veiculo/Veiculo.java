package br.ufg.inf.poo.ufgmotors.model.veiculo;

import br.ufg.inf.poo.ufgmotors.model.acessorio.Acessorio;
import br.ufg.inf.poo.ufgmotors.model.marca.Modelo;
import br.ufg.inf.poo.ufgmotors.model.user.Cliente;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

    @ManyToOne()
    private Modelo modelo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id")
    private Long cliente_id;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "veiculo_acessorios",
    joinColumns =
    @JoinColumn(name = "veiculo_id", referencedColumnName = "id"),
    inverseJoinColumns =
    @JoinColumn(name = "acessorio_id", referencedColumnName = "id")
    )
    private List<Acessorio> acessorios;
}
