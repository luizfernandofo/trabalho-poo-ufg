package br.ufg.inf.poo.ufgmotors.controller;

import br.ufg.inf.poo.ufgmotors.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Map;

@RestController
public class UserController {
    @PostMapping("/newuser")
    public HttpStatus newuser(@RequestParam Map<String, String> allParams){
        // chama método para criar user
        //new User(allParams.get("name"), allParams.get("email"), allParams.get("password"), false, LocalDateTime.now());
        return HttpStatus.CREATED;
    }
}
