package com.ctd.commerce.service;

import com.ctd.commerce.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CategoriaService {

    private CategoriaRepository categoriaRepository;

    @Autowired
    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }


}
