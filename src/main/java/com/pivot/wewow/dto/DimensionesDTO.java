package com.pivot.wewow.dto;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class DimensionesDTO {
    private Long empid;
    private Short modid;
    private Short subid;
    private Short encuid;
    private String encutipo;
    private String encudate;
    private Short sectorid;
    private Short tamanoid;
    private String localidad1;
    private String localidad2;
    private Short dimid;
    private Short subdimid;
    private Short comid;
    private Short afirmid;
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
    private String dimdesc;
    private String linddescc;
    private String indclasifi;
    private String indxldesc;

    public DimensionesDTO(Long empid, Short modid, Short subid, Short encuid, String encutipo, String encudate, 
                             Short sectorid, Short tamanoid, String localidad1, String localidad2, Short dimid, 
                             Short subdimid, Short comid, Short afirmid, BigDecimal statement_resultvalue, 
                             BigDecimal statement_standarddeviation, BigDecimal benchmark1, BigDecimal benchmark2, 
                             BigDecimal benchmark3, BigDecimal benchmark4, BigDecimal benchmark5, BigDecimal benchmark6, 
                             BigDecimal benchmark7, BigDecimal benchmark8, BigDecimal benchmark9, BigDecimal benchmark10, 
                             String dimdesc, String linddescc, String indclasifi, String indxldesc) {
        this.empid = empid;
        this.modid = modid;
        this.subid = subid;
        this.encuid = encuid;
        this.encutipo = encutipo;
        this.encudate = encudate;
        this.sectorid = sectorid;
        this.tamanoid = tamanoid;
        this.localidad1 = localidad1;
        this.localidad2 = localidad2;
        this.dimid = dimid;
        this.subdimid = subdimid;
        this.comid = comid;
        this.afirmid = afirmid;
        this.statement_resultvalue = statement_resultvalue;
        this.statement_standarddeviation = statement_standarddeviation;
        this.benchmark1 = benchmark1;
        this.benchmark2 = benchmark2;
        this.benchmark3 = benchmark3;
        this.benchmark4 = benchmark4;
        this.benchmark5 = benchmark5;
        this.benchmark6 = benchmark6;
        this.benchmark7 = benchmark7;
        this.benchmark8 = benchmark8;
        this.benchmark9 = benchmark9;
        this.benchmark10 = benchmark10;
        this.dimdesc = dimdesc;
        this.linddescc = linddescc;
        this.indclasifi = indclasifi;
        this.indxldesc = indxldesc;
    }
}
