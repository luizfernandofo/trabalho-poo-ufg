package br.ufg.inf.poo.ufgmotors.model.user;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "clientes")
public class Cliente extends User{

    @Column(nullable = false)
    String endereco;

    @Column(nullable = false)
    String cep;

    @Column(nullable = false)
    String telefone;

}
