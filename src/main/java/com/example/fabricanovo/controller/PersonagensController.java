package com.example.fabricanovo.controller;

import com.example.fabricanovo.model.Personagem;
import com.example.fabricanovo.service.PersonagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personagens")
public class PersonagensController {

    @Autowired
    private PersonagemService personagemService;

    //http://localhost:9998/personagens/
    @GetMapping
    public List<Personagem> findAll(){
     return personagemService.findAll();
    }

    //http://localhost:9998/personagens/1
    @GetMapping("/{id}")
    public  Personagem findById(@PathVariable Long id){
        return  personagemService.findById(id);
    }

    @PostMapping
    public String create (@RequestBody Personagem personagem){
       return personagemService.saveOrUpdate(personagem);
    }

    @RequestMapping("/cadastroPersonagem")
    public String form(){
        return "personagem/cadastro";
    }


    @PutMapping("/{id}")
    public String update(@RequestBody Personagem personagem, @PathVariable Long id){
        personagem.setId(id);

        return personagemService.saveOrUpdate(personagem);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id){
        return personagemService.delete(id);

    }


}
