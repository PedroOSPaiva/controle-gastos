package com.igreja.controle_gastos.adapter.output;

import com.igreja.controle_gastos.domain.model.Receita;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceitaRepository extends JpaRepository<Receita, Long> {
}
