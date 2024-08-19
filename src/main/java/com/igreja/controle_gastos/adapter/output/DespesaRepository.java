package com.igreja.controle_gastos.adapter.output;

import com.igreja.controle_gastos.domain.model.Despesa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DespesaRepository extends JpaRepository<Despesa, Long> {
}
