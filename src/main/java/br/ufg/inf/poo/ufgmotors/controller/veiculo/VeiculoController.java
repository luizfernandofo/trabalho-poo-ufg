package br.ufg.inf.poo.ufgmotors.controller.veiculo;

import br.ufg.inf.poo.ufgmotors.enumeration.CarroceriaEnum;
import br.ufg.inf.poo.ufgmotors.model.marca.Marca;
import br.ufg.inf.poo.ufgmotors.model.marca.Modelo;
import br.ufg.inf.poo.ufgmotors.model.user.Cliente;
import br.ufg.inf.poo.ufgmotors.model.veiculo.Carro;
import br.ufg.inf.poo.ufgmotors.repository.marca.MarcaRepository;
import br.ufg.inf.poo.ufgmotors.repository.user.ClienteRepository;
import br.ufg.inf.poo.ufgmotors.repository.veiculo.CarroRepository;
import br.ufg.inf.poo.ufgmotors.repository.veiculo.MotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Map;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

    @Autowired
    private CarroRepository carroRepository;

    @Autowired
    private MotoRepository motoRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private MarcaRepository marcaRepository;

    @PostMapping("/cadastrar_carro")
    public @ResponseBody String cadastraNovoCarro(@RequestParam Map<String, String> allParams){

        Modelo modelo = new Modelo();
        Marca marca = new Marca();
        Carro carro = new Carro();

        marca = marcaRepository.findMarcaByMarca(allParams.get("marca"));

        modelo.setModelo("Corsa Classic");
        modelo.setMarca(marca);


        Cliente cliente = new Cliente();

        carro.setPlaca(allParams.get("placa"));
        carro.setChassi(allParams.get("chassi"));
        carro.setQuilometragem(
                Long.parseLong(allParams.get("quilometragem")
                ));
        carro.setCor(allParams.get("cor"));
        // erro: save ... before flushing ...
        //carro.setModelo(modelo);
        if( !clienteRepository.existsById(Long.parseLong(allParams.get("cliente_id"))) ) {
            return "Cliente não existe";
        }

        carro.setCliente_id(Long.parseLong(allParams.get("cliente_id")));
        carro.setCarroceria(CarroceriaEnum.HATCHBACK);

        carroRepository.save(carro);

        return "Carro cadastrado com sucesso.";

    }


}
