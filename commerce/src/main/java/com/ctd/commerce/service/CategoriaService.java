package com.ctd.commerce.service;

import com.ctd.commerce.model.Categoria;
import com.ctd.commerce.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CategoriaService {

    private CategoriaRepository categoriaRepository;

    @Autowired
    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    private List<Categoria> listarCategorias(){
        return categoriaRepository.findAll();
    }
}
