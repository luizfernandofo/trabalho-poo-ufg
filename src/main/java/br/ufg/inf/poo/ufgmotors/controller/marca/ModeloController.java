package br.ufg.inf.poo.ufgmotors.controller.marca;

import br.ufg.inf.poo.ufgmotors.model.marca.Modelo;
import br.ufg.inf.poo.ufgmotors.repository.marca.MarcaRepository;
import br.ufg.inf.poo.ufgmotors.repository.marca.ModeloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/modelos")
public class ModeloController {

    @Autowired
    private ModeloRepository modeloRepository;

    @Autowired
    private MarcaRepository marcaRepository;

    @PostMapping("/cadastrar_modelo")
    public @ResponseBody String addNewModel(@RequestParam Map<String, String> allParams){

        Modelo modelo = new Modelo();

        modelo.setModelo(allParams.get("modelo"));

        modelo.setMarca(marcaRepository.findMarcaByMarca(allParams.get("marca")));

        modeloRepository.save(modelo);

        return "Modelo cadastrado com sucesso";
    }
}
