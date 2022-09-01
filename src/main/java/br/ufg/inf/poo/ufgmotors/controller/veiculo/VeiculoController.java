package br.ufg.inf.poo.ufgmotors.controller.veiculo;

import br.ufg.inf.poo.ufgmotors.enumeration.CarroceriaEnum;
import br.ufg.inf.poo.ufgmotors.model.acessorio.Acessorio;
import br.ufg.inf.poo.ufgmotors.model.marca.Marca;
import br.ufg.inf.poo.ufgmotors.model.marca.Modelo;
import br.ufg.inf.poo.ufgmotors.model.user.Cliente;
import br.ufg.inf.poo.ufgmotors.model.veiculo.Carro;
import br.ufg.inf.poo.ufgmotors.model.veiculo.Moto;
import br.ufg.inf.poo.ufgmotors.repository.acessorio.AcessorioRepository;
import br.ufg.inf.poo.ufgmotors.repository.marca.MarcaRepository;
import br.ufg.inf.poo.ufgmotors.repository.marca.ModeloRepository;
import br.ufg.inf.poo.ufgmotors.repository.user.ClienteRepository;
import br.ufg.inf.poo.ufgmotors.repository.veiculo.CarroRepository;
import br.ufg.inf.poo.ufgmotors.repository.veiculo.MotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
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
    private ModeloRepository modeloRepository;

    @Autowired
    private AcessorioRepository acessorioRepository;

    @PostMapping("/cadastrar_carro")
    public @ResponseBody String cadastraNovoCarro(@RequestParam Map<String, String> allParams){

        Modelo modelo;
        Carro carro = new Carro();
        List<Acessorio> _acessorios = new ArrayList<>();


        if( !modeloRepository.existsByModelo(allParams.get("modelo"))){
            return "Modelo " + allParams.get("modelo") +" não existe!";
        }

        modelo = modeloRepository.findModeloByModelo(allParams.get("modelo"));

        carro.setModelo(modelo);
        carro.setPlaca(allParams.get("placa"));
        carro.setChassi(allParams.get("chassi"));
        carro.setQuilometragem(
                Long.parseLong(allParams.get("quilometragem")
                ));
        carro.setCor(allParams.get("cor"));

        if( !clienteRepository.existsById(Long.parseLong(allParams.get("cliente_id"))) ) {
            return "Cliente não existe";
        }

        carro.setCliente_id(
                clienteRepository.findById(
                        Long.parseLong(allParams.get("cliente_id"))
                ).get()
        );

        carro.setCarroceria(allParams.get("carroceria"));

        for (String str: allParams.get("acessorios").split("\\s*,\\s*")){
            if(acessorioRepository.existsByAcessorio(str)){
                _acessorios.add(acessorioRepository.findAcessorioByAcessorio(str));
            }
            else{
                return "Acessório " + str + " não existe no banco!";
            }
        }

        carro.setAcessorios(_acessorios);

        carroRepository.save(carro);

        return "Carro cadastrado com sucesso.";

    }

//    @PostMapping("/atualiza_carro")
//    public @ResponseBody String atualizaCarro(@RequestParam Map<String, String> allParams){
//
//        Carro carro;
//
//        List<Acessorio> _acessorios = new ArrayList<>();
//
//        if( !carroRepository.existsById(Long.parseLong(allParams.get("carro_id")))){
//            return "Carro id: " + allParams.get("carro_id") +" não existe!";
//        }
//
//        carro = carroRepository.findById(Long.parseLong(allParams.get("carro_id"))).get();
//
//        carro.setQuilometragem(
//                Long.parseLong(allParams.get("quilometragem")
//                ));
//        carro.setCor(allParams.get("cor"));
//
//        for (String str: allParams.get("acessorios").split("\\s*,\\s*")){
//            if(acessorioRepository.existsByAcessorio(str)){
//                _acessorios.add(acessorioRepository.findAcessorioByAcessorio(str));
//            }
//            else{
//                return "Acessório " + str + " não existe no banco!";
//            }
//        }
//
//        carro.setAcessorios(_acessorios);
//
//        carroRepository.updateCarro(carro);
//
//        return "Carro atualizado com sucesso.";
//
//    }

    @PostMapping("/cadastrar_moto")
    public @ResponseBody String cadastraNovaMoto(@RequestParam Map<String, String> allParams){

        Modelo modelo;
        Moto moto = new Moto();

        if( !modeloRepository.existsByModelo(allParams.get("modelo"))){
            return "Modelo " + allParams.get("modelo") +" não existe!";
        }

        modelo = modeloRepository.findModeloByModelo(allParams.get("modelo"));

        moto.setModelo(modelo);
        moto.setPlaca(allParams.get("placa"));
        moto.setChassi(allParams.get("chassi"));
        moto.setQuilometragem(
                Long.parseLong(allParams.get("quilometragem")
                ));
        moto.setCor(allParams.get("cor"));

        if( !clienteRepository.existsById(Long.parseLong(allParams.get("cliente_id"))) ) {
            return "Cliente não existe";
        }

        moto.setCliente_id(
                clienteRepository.findById(
                        Long.parseLong(allParams.get("cliente_id"))
                ).get()
        );

        moto.setEstilo(allParams.get("estilo"));

        motoRepository.save(moto);

        return "Moto cadastrado com sucesso.";

    }

    @GetMapping(path="/listar_carros")
    public @ResponseBody Iterable<Carro> getAllCarros() {

        return carroRepository.findAll();
    }


}
