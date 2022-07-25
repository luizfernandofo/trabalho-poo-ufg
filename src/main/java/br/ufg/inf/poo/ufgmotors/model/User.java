package br.ufg.inf.poo.ufgmotors.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "clients")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    private Integer id;
    private String name;
    private String email;
    private String password;
    private Boolean signedIn;
    private LocalDateTime signUpDate;

}
