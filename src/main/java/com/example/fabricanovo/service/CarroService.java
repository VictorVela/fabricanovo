package com.example.fabricanovo.service;

import com.example.fabricanovo.model.Carro;
import com.example.fabricanovo.repository.CarroRepository;
import com.example.fabricanovo.repository.PersonagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;

    public List<Carro> findAll() {return carroRepository.findAll();}

    public  Carro findById(Long id) {return carroRepository.findById(id).get();}

    public String saveOrUpdate (Carro carro){
        if (carroRepository.save(carro) != null){
            return "Criado com sucesso";
        }

        return "não foi possivel salvar";
    }

    public String delete(Long id){
        if(carroRepository.existsById(id)){
            carroRepository.deleteById(id);
            return !carroRepository.existsById(id) ? "Objeto deletado" : "Erro ao deletar";
        }

        return "Não foi possivel deletar";
    }
}
