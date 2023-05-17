package com.company.dtk.microservicescompra.controller;

import com.company.dtk.microservicescompra.model.Compra;
import com.company.dtk.microservicescompra.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/compra")
public class CompraController {

    @Autowired
    private CompraService compraService;

    @PostMapping
    public ResponseEntity<?> createCompra(@RequestBody Compra compra) {
        return new ResponseEntity<>(
                compraService.createCompra(compra),
                HttpStatus.CREATED);
    }

    @GetMapping("{userId}")
    public ResponseEntity<?> getAllCompraOfUser(@PathVariable Long userId) {
        return ResponseEntity.ok(compraService.findAllCompraOfUser(userId));
    }
}
