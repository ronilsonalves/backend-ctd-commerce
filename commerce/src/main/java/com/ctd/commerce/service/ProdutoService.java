package com.ctd.commerce.service;

import com.ctd.commerce.model.Categoria;
import com.ctd.commerce.model.Produto;
import com.ctd.commerce.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ProdutoService {

    private ProdutoRepository produtoRepository;

    @Autowired
    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    List<Produto> listarTodosProdutos(){
       return produtoRepository.findAll();
    }

    Optional<Produto> buscarPorId(Integer id){
        return produtoRepository.findById(id);
    }

    List<Produto> findAllByCategoria(Categoria categoria){
        return produtoRepository.findAllByCategoria(categoria);
    }
}
