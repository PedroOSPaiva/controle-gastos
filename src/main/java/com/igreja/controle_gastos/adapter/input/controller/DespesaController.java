package com.igreja.controle_gastos.adapter.input.controller;


import com.igreja.controle_gastos.domain.model.Despesa;
import com.igreja.controle_gastos.domain.service.DespesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/despesas")
public class DespesaController {

    @Autowired
    private DespesaService despesaService;

    @GetMapping
    public List<Despesa> listarTodas() {
        return despesaService.listarTodas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Despesa> buscarPorId(@PathVariable Long id) {
        Optional<Despesa> despesa = despesaService.buscarPorId(id);
        return despesa.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Despesa salvar(@RequestBody Despesa despesa) {
        return despesaService.salva(despesa);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Despesa> atualizar(@PathVariable Long id, @RequestBody Despesa despesa) {
        if (!despesaService.buscarPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        despesa.setId(id);
        return ResponseEntity.ok(despesaService.salva(despesa));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        if (!despesaService.buscarPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        despesaService.excluir(id);
        return ResponseEntity.noContent().build();
    }
}

