package br.ufg.inf.poo.ufgmotors.model.user;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Cliente extends User{

    String endereco;
    String cep;
    String telefone;

}
