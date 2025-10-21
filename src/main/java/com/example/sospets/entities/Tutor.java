package com.example.sospets.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Tutor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String cpf;
    private String nome;
    private String rg;
    private String endereco;
    private String profissao;
    private String telefone;


    @OneToMany(mappedBy = "tutor")
    private List<Animal> animais;

    public Tutor(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
}
