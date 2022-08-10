package br.ufg.inf.poo.ufgmotors.model.marca;

import java.util.HashMap;
import java.util.Map;

public class Marca {

    String marca;
    Map<Modelo, Modelo> modelos = new HashMap<>();
}
