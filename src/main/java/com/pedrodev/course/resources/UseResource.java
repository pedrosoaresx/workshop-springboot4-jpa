package com.pedrodev.course.resources;

import com.pedrodev.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UseResource {

    /*
        ResponseEntity é um tipo específico do Spring para retornar respostas de requisições web.
        Como ele é um generics ele espera um tipo como parâmetro no caso o tipo dessa resposta é a classe User.
        Ele deve retornar um ResponseEntity.ok() para retornar a resposta com sucesso e o .body() para retornar o corpo
        da resposta.
        Para indicar que o metodo responde a requisição do tipo GET do http utiliza-se a anotação @GetMapping

     */

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Marisa", "marisa@gmail.com", "9999999", "12345");
        return ResponseEntity.ok().body(u);
    }
}
