package com.igreja.controle_gastos.adapter.output;


import com.igreja.controle_gastos.domain.model.Patrimonio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatrimonioRepository extends JpaRepository<Patrimonio, Long> {
}
