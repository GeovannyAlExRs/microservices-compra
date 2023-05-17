package com.company.dtk.microservicescompra.service;

import com.company.dtk.microservicescompra.model.Compra;
import com.company.dtk.microservicescompra.repository.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CompraServiceImpl implements CompraService {

    @Autowired
    private CompraRepository compraRepository;

    @Override
    public Compra createCompra(Compra compra) {
        compra.setDate(LocalDateTime.now());
        return compraRepository.save(compra);
    }

    @Override
    public List<Compra> findAllCompraOfUser(Long userId) {
        return compraRepository.findAllByUserId(userId);
    }

}
