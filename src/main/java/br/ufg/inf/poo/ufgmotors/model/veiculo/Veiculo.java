package br.ufg.inf.poo.ufgmotors.model.veiculo;

import br.ufg.inf.poo.ufgmotors.model.marca.Modelo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

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

    @ManyToOne
    private Modelo modelo;
}
