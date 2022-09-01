package br.ufg.inf.poo.ufgmotors.model.acessorio;

import br.ufg.inf.poo.ufgmotors.repository.acessorio.AcessorioRepository;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "acessorios")
public class Acessorio {

    public Acessorio(String acessorio){
        this.acessorio = acessorio;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String acessorio;

}
