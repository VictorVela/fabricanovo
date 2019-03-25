package com.example.fabricanovo.service;

import com.example.fabricanovo.model.Personagem;
import com.example.fabricanovo.repository.PersonagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonagemService {

    @Autowired
    private PersonagemRepository personagemRepository;

    public List<Personagem> findAll(){
        return personagemRepository.findAll();
    }

    public Personagem findById(Long id){
        return personagemRepository.findById(id).get();
    }

    public String saveOrUpdate (Personagem personagem){
        if (personagemRepository.save(personagem) != null){
            return "deu boa";
        }

        return "não deu boa";
    }

    public void delete(Personagem personagem){
         personagemRepository.delete(personagem);
    }

//    public String delete(Long id){
//       if(personagemRepository.existsById(id)){
//           personagemRepository.deleteById(id);
//           return !personagemRepository.existsById(id) ? "Objeto deletado" : "Erro no delete";
//       }
//
//        return  "Não deu boa";
//    }

}
