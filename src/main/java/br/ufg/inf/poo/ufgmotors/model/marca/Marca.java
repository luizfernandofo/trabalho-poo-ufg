package br.ufg.inf.poo.ufgmotors.model.marca;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "marcas")
public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marca;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "modelo")
    private List<Modelo> modelos = new ArrayList<>();
}
