package com.ctd.commerce.service;

import com.ctd.commerce.model.Categoria;
import com.ctd.commerce.repository.CategoriaRepository;
import org.hibernate.result.NoMoreReturnsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@Service
public class CategoriaService {

    private CategoriaRepository categoriaRepository;

    @Autowired
    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public List<String> listarCategorias(){

        List<String> nomesCategorias = new ArrayList<>();

        List<Categoria> categorias = categoriaRepository.findAll();

        for (Categoria categoria : categorias) {
            nomesCategorias.add(categoria.getNome());
        }

        return nomesCategorias;
    }

    public Categoria cadastrarCategoria(Categoria categoria){
        return categoriaRepository.save(categoria);
    }

}
