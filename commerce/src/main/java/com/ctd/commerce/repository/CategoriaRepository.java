package com.ctd.commerce.repository;

import com.ctd.commerce.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaRepository extends JpaRepository <Categoria, Integer> {
    List<Categoria> findByNome(String nome);
}
