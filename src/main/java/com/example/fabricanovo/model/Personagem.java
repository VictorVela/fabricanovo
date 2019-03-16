package com.example.fabricanovo.model;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Getter @Setter
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "PERSONAGEM")
public class Personagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDPERSONAGEM")
    private Long id;

    @NonNull
    private String nome;

    @NonNull
    private int    idade;

    @NonNull
    private String classe;

}


