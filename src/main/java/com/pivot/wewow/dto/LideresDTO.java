package com.pivot.wewow.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter @Setter
public class LideresDTO {
    private Long empid;
    private Short modid;
    private Short subid;
    private Short encuid;
    private String encutipo;
    private String encudate;
    private Short sectorid;
    private Short tamanoid;
    private String demographic_localidad1;
    private String demographic_localidad2;
    private Short dimid;
    private Short subdimid;
    private Short comid;
    private Short afirmid;
    private Short managerid;
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
    private String dimdesc;
    private String linddescc;
    private String indclasifi;
    private String indxldesc;
}
