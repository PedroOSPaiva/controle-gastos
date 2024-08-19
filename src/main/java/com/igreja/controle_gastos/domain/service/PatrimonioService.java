package com.igreja.controle_gastos.domain.service;


import com.igreja.controle_gastos.adapter.output.PatrimonioRepository;
import com.igreja.controle_gastos.domain.model.Patrimonio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatrimonioService {

    @Autowired
    private PatrimonioRepository patrimonioRepository;

    public List<Patrimonio> listarTodos() {
        return patrimonioRepository.findAll();
    }

    public Optional<Patrimonio> buscarPorId(Long id) {
        return patrimonioRepository.findById(id);
    }

    public Patrimonio salvar(Patrimonio patrimonio) {
        return patrimonioRepository.save(patrimonio);
    }

    public void excluir(Long id) {
        patrimonioRepository.deleteById(id);
    }
}
