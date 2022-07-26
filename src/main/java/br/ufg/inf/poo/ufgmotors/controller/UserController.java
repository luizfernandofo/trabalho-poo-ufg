package br.ufg.inf.poo.ufgmotors.controller;

import br.ufg.inf.poo.ufgmotors.model.user.User;
import br.ufg.inf.poo.ufgmotors.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;
    @PostMapping("/newuser")
    public @ResponseBody String addNewUser(@RequestParam Map<String, String> allParams){

        User u = new User();
        u.setName(allParams.get("name"));
        u.setEmail(allParams.get("email"));
        u.setPassword(allParams.get("password"));
        u.setSignUpDate(LocalDateTime.now());
        userRepository.save(u);

        return "Usuário cadastrado";
    }

    @GetMapping(path="/allusers")
    public @ResponseBody Iterable<User> getAllUsers() {
        // This returns a JSON or XML with the users
        return userRepository.findAll();
    }

}
