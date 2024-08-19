package com.igreja.controle_gastos.adapter.input.controller;


import com.igreja.controle_gastos.domain.model.Patrimonio;
import com.igreja.controle_gastos.domain.service.PatrimonioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patrimonios")
public class PatrimonioController {

    @Autowired
    private PatrimonioService patrimonioService;

    @GetMapping
    public List<Patrimonio> listarTodos() {
        return patrimonioService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Patrimonio> buscarPorId(@PathVariable Long id) {
        return patrimonioService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Patrimonio criar(@RequestBody Patrimonio patrimonio) {
        return patrimonioService.salvar(patrimonio);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        patrimonioService.excluir(id);
        return ResponseEntity.noContent().build();
    }
}
