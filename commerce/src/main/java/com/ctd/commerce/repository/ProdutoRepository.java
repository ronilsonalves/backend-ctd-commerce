package com.ctd.commerce.repository;

import com.ctd.commerce.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Integer> {

    // Custom Query para buscar os produtos pelo nome.
    @Query(value = "SELECT p FROM Produto p WHERE p.titulo LIKE %?1%")
    List<Produto> findByTitulo(String titulo);
}
