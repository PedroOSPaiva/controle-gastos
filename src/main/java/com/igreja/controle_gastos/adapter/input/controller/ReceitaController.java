package com.igreja.controle_gastos.adapter.input.controller;


import com.igreja.controle_gastos.domain.model.Receita;
import com.igreja.controle_gastos.domain.service.ReceitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/receitas")
public class ReceitaController {

    @Autowired
    private ReceitaService receitaService;

    @GetMapping
    public List<Receita> listarTodas() {
        return receitaService.listarTodas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Receita> buscarPorId(@PathVariable Long id) {
        Optional<Receita> receita = receitaService.buscarPorId(id);
        return receita.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Receita salvar(@RequestBody Receita receita) {
        return receitaService.salvar(receita);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Receita> atualizar(@PathVariable Long id, @RequestBody Receita receita) {
        if (!receitaService.buscarPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        receita.setId(id);
        return ResponseEntity.ok(receitaService.salvar(receita));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        if (!receitaService.buscarPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        receitaService.excluir(id);
        return ResponseEntity.noContent().build();
    }
}
