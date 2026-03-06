package com.pedrodev.course.resources;

import com.pedrodev.course.entities.User;
import com.pedrodev.course.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

        /*
        ResponseEntity é um tipo específico do Spring para retornar respostas de requisições web.
        Como ele é um generics ele espera um tipo como parâmetro no caso o tipo dessa resposta é a classe User.
        Ele deve retornar um ResponseEntity.ok() para retornar a resposta com sucesso e o .body() para retornar o corpo
        da resposta.
        Para indicar que o metodo responde a requisição do tipo GET do http utiliza-se a anotação @GetMapping

     */

    private final UserService userService;

    public UserResource(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        List<User> list = userService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        Optional<User> user = userService.findById(id);
        return ResponseEntity.ok().body(user.get());
    }
}
