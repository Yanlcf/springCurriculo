package com.api_curriculo.curriculos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api_curriculo.curriculos.model.Curriculo;

public interface CurriculoRepository extends JpaRepository<Curriculo, Long> {
    
}