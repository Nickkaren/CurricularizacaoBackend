package com.example.sospets.repositories;

import com.example.sospets.entities.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepo extends JpaRepository<Funcionario, Integer> {
}
