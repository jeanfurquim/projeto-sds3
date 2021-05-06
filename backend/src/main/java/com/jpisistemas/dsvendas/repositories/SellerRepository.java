package com.jpisistemas.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpisistemas.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
