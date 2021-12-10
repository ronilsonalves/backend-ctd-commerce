package com.ctd.commerce.controller;
import com.ctd.commerce.model.Categoria;
import com.ctd.commerce.model.Produto;
import com.ctd.commerce.service.CategoriaService;
import com.ctd.commerce.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "https://ctdcommercet4g4.vercel.app")
@RestController
@RequestMapping("/produto")
public class ProdutoController {

    private ProdutoService produtoService;

    private CategoriaService categoriaService;

    @Autowired
    public ProdutoController(ProdutoService produtoService, CategoriaService categoriaService) {
        this.produtoService = produtoService;
        this.categoriaService = categoriaService;
    }

    @PostMapping
    private ResponseEntity<Produto> cadastrarProduto(@RequestBody Produto produto){
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoService.cadastrarProduto(produto));
    }

    @GetMapping
    private ResponseEntity<List<Produto>> listarTodosProdutos(){
        return ResponseEntity.ok(produtoService.listarTodosProdutos());
    }


    @GetMapping("/{id}")
    private ResponseEntity<Optional<Produto>> buscarPorId(@PathVariable Integer id){
        return ResponseEntity.ok(produtoService.buscarPorId(id));
    }

    @GetMapping("/by/{titulo}") // Rota que busca o produto pelo nome.
    private ResponseEntity<List<Produto>> listarPorTitulo(@PathVariable String titulo){
        return ResponseEntity.ok(produtoService.listarPorTitulo(titulo));
    }

    @PostMapping("/categoria")
    private ResponseEntity<Categoria> cadastrarCategoria(@RequestBody Categoria categoria){
        return ResponseEntity.status(HttpStatus.CREATED).body(categoriaService.adicionarCategoria(categoria));
    }

    @GetMapping("/categoria/{nome}")
    private ResponseEntity<List<Categoria>> produtosDeUmaCategoria(@PathVariable String nome){
        return ResponseEntity.ok(categoriaService.findByNome(nome));
    }

    @GetMapping("/categoria")
    private ResponseEntity<List<Categoria>> listarTodasCategorias(){
        return ResponseEntity.ok(categoriaService.listarCategorias());
    }
}
