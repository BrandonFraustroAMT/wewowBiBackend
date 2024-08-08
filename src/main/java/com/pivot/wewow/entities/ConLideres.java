package com.pivot.wewow.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "FactTableLideres")
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
    private float lider_resultvalue;
    private float lider_standardeviation;
    private float lider_benchmark_overral;
}
