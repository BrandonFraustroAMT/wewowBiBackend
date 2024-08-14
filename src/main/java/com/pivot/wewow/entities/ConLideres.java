package com.pivot.wewow.entities;

import java.math.BigDecimal;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "facttablelideres")
@Getter @Setter
public class ConLideres {
    @EmbeddedId
    private ConLideresId conLideresId;

    private String manager_name;
    private Long total_manager;
    private Long respuestas_empleados;
    private Long empleados_totales;
    private String area;
    private String year_trabajando;
    private String cargo_homologado;
    private String educacion;
    private String generacion;
    private String genero;
    private String tipo_trabajo;
    private BigDecimal lider_resultvalue;
    private BigDecimal lider_standardeviation;
    private BigDecimal lider_benchmark_overral;
}
