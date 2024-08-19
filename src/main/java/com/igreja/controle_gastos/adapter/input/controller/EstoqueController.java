package com.igreja.controle_gastos.adapter.input.controller;


import com.igreja.controle_gastos.domain.model.Estoque;
import com.igreja.controle_gastos.domain.service.EstoqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/estoques")
public class EstoqueController {

    @Autowired
    private EstoqueService estoqueService;

    @GetMapping
    public List<Estoque> listarTodos() {
        return estoqueService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estoque> buscarPorId(@PathVariable Long id) {
        Optional<Estoque> estoque = estoqueService.buscarPorId(id);
        return estoque.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Estoque salvar(@RequestBody Estoque estoque) {
        return estoqueService.salvar(estoque);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Estoque> atualizar(@PathVariable Long id, @RequestBody Estoque estoque) {
        if (!estoqueService.buscarPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        estoque.setId(id);
        return ResponseEntity.ok(estoqueService.salvar(estoque));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        if (!estoqueService.buscarPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        estoqueService.excluir(id);
        return ResponseEntity.noContent().build();
    }
}
