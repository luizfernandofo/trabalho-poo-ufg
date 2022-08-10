package br.ufg.inf.poo.ufgmotors.controller.user;

import br.ufg.inf.poo.ufgmotors.model.user.Cliente;
import br.ufg.inf.poo.ufgmotors.model.user.User;
import br.ufg.inf.poo.ufgmotors.repository.user.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Map;

@RestController
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;
    @PostMapping("/cadastrar_cliente")
    public @ResponseBody String addNewUser(@RequestParam Map<String, String> allParams){

        Cliente u = new Cliente();
        u.setName(allParams.get("name"));
        u.setEmail(allParams.get("email"));
        u.setPassword(allParams.get("password"));
        u.setSignUpDate(LocalDateTime.now());
        u.setEndereco(allParams.get("endereco"));
        u.setCep(allParams.get("cep"));
        u.setTelefone(allParams.get("telefone"));

        return clienteRepository.save(u).toString();
    }

    @GetMapping(path="/todos_clientes")
    public @ResponseBody Iterable<Cliente> getAllUsers() {
        // This returns a JSON or XML with the users
        return clienteRepository.findAll();
    }

}
