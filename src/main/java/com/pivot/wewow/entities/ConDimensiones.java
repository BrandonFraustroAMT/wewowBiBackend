package com.pivot.wewow.entities;

import java.math.BigDecimal;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Concentrado_Dimensiones")
@Getter @Setter
public class ConDimensiones {
    @EmbeddedId
    private ConDimensionesId conDimensionesId;

    private BigDecimal statement_resultvalue;
    private BigDecimal statement_standarddeviation;
    private BigDecimal benchmark1;
    private BigDecimal benchmark2;
    private BigDecimal benchmark3;
    private BigDecimal benchmark4;
    private BigDecimal benchmark5;
    private BigDecimal benchmark6;
    private BigDecimal benchmark7;
    private BigDecimal benchmark8;
    private BigDecimal benchmark9;
    private BigDecimal benchmark10;
}
