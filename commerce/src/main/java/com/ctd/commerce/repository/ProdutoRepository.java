package com.ctd.commerce.repository;

import com.ctd.commerce.model.Categoria;
import com.ctd.commerce.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Integer> {

    List<Produto> findAllByCategoria(Categoria categoria);
}
