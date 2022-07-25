package br.ufg.inf.poo.ufgmotors.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    String name;
    String email;
    String password;
    Boolean signedIn;
    LocalDateTime signUpDate;

}
