package br.ufg.inf.poo.ufgmotors.controller.acessorio;

import br.ufg.inf.poo.ufgmotors.model.acessorio.Acessorio;
import br.ufg.inf.poo.ufgmotors.model.marca.Marca;
import br.ufg.inf.poo.ufgmotors.repository.acessorio.AcessorioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/acessorios")
public class AcessorioController {

    @Autowired
    private AcessorioRepository acessorioRepository;

    @PostMapping("/cadastrar_acessorio")
    public @ResponseBody String addNewBrand(@RequestParam(name = "acessorio") String nome){

        Acessorio acessorio = new Acessorio();

        acessorio.setAcessorio(nome);

        acessorioRepository.save(acessorio);

        return "Acessório cadastrado com sucesso";
    }
}
