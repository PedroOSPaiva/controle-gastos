package com.igreja.controle_gastos.domain.service;

import com.igreja.controle_gastos.adapter.output.DespesaRepository;
import com.igreja.controle_gastos.domain.model.Despesa;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DespesaService {

    private DespesaRepository despesaRepository;

    public List<Despesa> listarTodas(){
        return despesaRepository.findAll();
    }

    public Optional<Despesa> buscarPorId(Long id){
        return despesaRepository.findById(id);
    }

    public Despesa salva( Despesa despesa){
        return despesaRepository.save(despesa);
    }

    public void excluir(Long id){
        despesaRepository.findById(id);
    }
}
