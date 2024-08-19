package com.igreja.controle_gastos.domain.service;


import com.igreja.controle_gastos.adapter.output.EstoqueRepository;
import com.igreja.controle_gastos.domain.model.Estoque;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstoqueService {

    @Autowired
    private EstoqueRepository estoqueRepository;

    public List<Estoque> listarTodos() {
        return estoqueRepository.findAll();
    }

    public Optional<Estoque> buscarPorId(Long id) {
        return estoqueRepository.findById(id);
    }

    public Estoque salvar(Estoque estoque) {
        return estoqueRepository.save(estoque);
    }

    public void excluir(Long id) {
        estoqueRepository.deleteById(id);
    }
}
