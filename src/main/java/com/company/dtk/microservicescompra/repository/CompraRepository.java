package com.company.dtk.microservicescompra.repository;

import com.company.dtk.microservicescompra.model.Compra;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompraRepository extends JpaRepository<Compra, Long> {

    List<Compra> findAllByUserId(Long userid);

}
