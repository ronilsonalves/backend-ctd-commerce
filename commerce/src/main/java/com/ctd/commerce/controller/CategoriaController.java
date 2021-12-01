package com.ctd.commerce.controller;
import com.ctd.commerce.model.Categoria;
import com.ctd.commerce.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    private CategoriaService categoriaService;

    @Autowired
    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @GetMapping("/products/categories")
    private ResponseEntity<List<String>> listarTodasCategorias(){
        return ResponseEntity.ok(categoriaService.listarCategorias());
    }

    @PostMapping
    private ResponseEntity<Categoria> cadastrarCategoria(@RequestBody Categoria categoria){
        return ResponseEntity.status(HttpStatus.CREATED).body(categoriaService.cadastrarCategoria(categoria));
    }



}
