package com.example.microservico.controller;

import com.example.microservico.domain.Produto;
import com.example.microservico.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @GetMapping
    public List<Produto> listaTodos() {
        return service.listaTodos();
    }

    @GetMapping("/{sku}")
    public Produto buscaPorId(@PathVariable String sku){
        return service.buscaPorId(sku);
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto){
        return service.salvar(produto);
    }
}
