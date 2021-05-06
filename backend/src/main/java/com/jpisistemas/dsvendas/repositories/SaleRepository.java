package com.jpisistemas.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpisistemas.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
