package com.example.microservico.service;

import com.example.microservico.domain.Produto;
import com.example.microservico.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public List<Produto> listaTodos(){
        return (List<Produto>) repository.findAll();
    }

    public Produto salvar(Produto produto){
        return repository.save(produto);
    }

    public Produto buscaPorId(String sku) {
        Produto produto = repository.findById(sku).get();

        if (produto == null) {
            return null;
        }
        return produto;
    }
}
