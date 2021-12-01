package com.ctd.commerce.controller;
import com.ctd.commerce.model.Categoria;
import com.ctd.commerce.model.Produto;
import com.ctd.commerce.service.ProdutoService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProdutoController {

    private ProdutoService produtoService;

    @Autowired
    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping
    private ResponseEntity<Produto> cadastrarProduto(@RequestBody Produto produto){




        
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoService.cadastrarProduto(produto));
    }

    @GetMapping
    private ResponseEntity<List<Produto>> listarTodosProdutos(){
        return ResponseEntity.ok(produtoService.listarTodosProdutos());
    }

    @GetMapping("/category/{nomecategoria}")
    private ResponseEntity<List<Produto>> listarProdutosPorCategoria(@PathVariable String nomeCategoria){
        return ResponseEntity.ok(produtoService.listarProdutosPorCategoria(nomeCategoria));
    }

    @GetMapping("/{id}")
    private ResponseEntity<Optional<Produto>> buscarPorId(@PathVariable Integer id){
        return ResponseEntity.ok(produtoService.buscarPorId(id));
    }

}
