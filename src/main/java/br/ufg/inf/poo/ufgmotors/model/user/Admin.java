package br.ufg.inf.poo.ufgmotors.model.user;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@NoArgsConstructor
@Entity
@Table(name = "admins")
public class Admin extends User{
}
