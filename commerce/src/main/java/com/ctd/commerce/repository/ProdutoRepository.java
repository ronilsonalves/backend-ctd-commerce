package com.ctd.commerce.repository;

import com.ctd.commerce.model.Categoria;
import com.ctd.commerce.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto,Integer> {

    List<Produto> findAllByCategoria(Categoria categoria);
}
