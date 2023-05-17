package com.company.dtk.microservicescompra.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name="compra")
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "userid", nullable = false)
    private Long userId;

    @Column(name = "inmuebleId", nullable = false)
    private Long inmuebleId;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "date", nullable = false)
    private LocalDateTime date;
}
