package com.example.fabricanovo.repository;

import com.example.fabricanovo.model.Personagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonagemRepository extends JpaRepository<Personagem, Long> {

//    /*
//    no caso :nome recebe do que vier do Param
//     */
//    @Query(value = "SELECT * PERSONAGEM WHERE NOME = :nome", nativeQuery = true)
//    List<Personagem> procuraEsp(@Param("nome")String nome);
}
