package br.ufg.inf.poo.ufgmotors.controller.user;

import br.ufg.inf.poo.ufgmotors.model.user.Cliente;
import br.ufg.inf.poo.ufgmotors.model.user.User;
import br.ufg.inf.poo.ufgmotors.repository.user.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpStatusCodeException;

import java.time.LocalDateTime;
import java.util.Map;

@RestController
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @PostMapping("/cadastrar_cliente")
    public @ResponseBody String addNewUser(@RequestParam Map<String, String> allParams){

        Cliente cliente = new Cliente();

        cliente.setName(allParams.get("name"));
        cliente.setEmail(allParams.get("email"));
        cliente.setPassword(allParams.get("password"));
        cliente.setSignUpDate(LocalDateTime.now());
        cliente.setEndereco(allParams.get("endereco"));
        cliente.setCep(allParams.get("cep"));
        cliente.setTelefone(allParams.get("telefone"));


        clienteRepository.save(cliente);


        return "Cliente cadastrado com sucesso.";

    }

    @GetMapping(path="/todos_clientes")
    public @ResponseBody Iterable<Cliente> getAllUsers() {
        // This returns a JSON or XML with the users
        return clienteRepository.findAll();
    }

}
