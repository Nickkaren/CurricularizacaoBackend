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
public class Funcionario {
    @Id
    private String cpf;
    private String nome;
    private String rg;
    private String email;
    private String profissao;
    private String endereco;

    @OneToMany(mappedBy = "funcionario")
    private List<Atendimento> atendimentos;
}
