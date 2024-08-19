package com.igreja.controle_gastos.domain.service;

import com.igreja.controle_gastos.adapter.output.ReceitaRepository;
import com.igreja.controle_gastos.domain.model.Receita;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReceitaService {

    @Autowired
    private ReceitaRepository receitaRepository;

    public List<Receita> listarTodas() {
        return receitaRepository.findAll();
    }

    public Optional<Receita> buscarPorId(Long id) {
        return receitaRepository.findById(id);
    }

    public Receita salvar(Receita receita) {
        return receitaRepository.save(receita);
    }

    public void excluir(Long id) {
        receitaRepository.deleteById(id);
    }
}
