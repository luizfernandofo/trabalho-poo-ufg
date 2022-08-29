package br.ufg.inf.poo.ufgmotors.controller.marca;

import br.ufg.inf.poo.ufgmotors.model.marca.Marca;
import br.ufg.inf.poo.ufgmotors.repository.marca.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/marcas")
public class MarcaController {

    @Autowired
    private MarcaRepository marcaRepository;

    @PostMapping("/cadastrar_marca")
    public @ResponseBody String addNewBrand(@RequestParam Map<String, String> allParams){
        Marca marca = new Marca();

        marca.setMarca(allParams.get("marca"));

        marcaRepository.save(marca);

        return "Marca cadastrada com sucesso";
    }
}
