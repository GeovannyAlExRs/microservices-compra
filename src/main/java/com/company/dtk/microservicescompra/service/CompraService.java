package com.company.dtk.microservicescompra.service;

import com.company.dtk.microservicescompra.model.Compra;

import java.util.List;

public interface CompraService {
    Compra createCompra(Compra compra);

    List<Compra> findAllCompraOfUser(Long userId);
}
