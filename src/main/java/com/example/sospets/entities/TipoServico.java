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
public class TipoServico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String servico;

    @OneToMany(mappedBy = "tiposervico")
    private List<Servico> servicos;
}
