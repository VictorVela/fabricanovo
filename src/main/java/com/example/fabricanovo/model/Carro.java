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
@Table(name = "CARRO")
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDCARRO")
    private Long id;

    @NonNull
    private String modelo;

    @NonNull
    private String marca;

    @NonNull
    private int ano;

}
