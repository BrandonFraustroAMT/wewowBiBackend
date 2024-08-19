package com.pivot.wewow.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "BDBD010")
@Getter @Setter
public class Bdbd010 {
    @EmbeddedId
    private Bdbd010Id bdbdo10id;

    private String bdname;
    private String bdnumem;
    private Short dbdyearn;
    private String bdidhai;
    private String bdemail;
    private String bdnamejd;
    private String bdnumjd;
    private String bdcont;
    private String bdlocal;
    private String bdjer1;
    private String bdjer2;
    private String bdjer3;
    private String bdjer4;
    private String bdjer5;
    private String bdjer6;
    private String bdjer7;
    private String bdjer8;
    private String bdjer9;
    private String bdjer10;
    private String bdarea;
    private String bdcargo;
    private String bdcargoho;
    private String bdcondcion;
    private String bdesquemac;
    private String bdgenero;
    private String bdgradac;
    private String bdclnum;
    private String bddate;
    private String bdhddh;
    private String bdhddhd;
    private String utytycdec;
    private String bdapellidos;
    private String bdlocalb;
    private String bdlocalc;
    private String bdgeneracion;
    private String bdclext;
    private String bdclnumemp;
    private String bdantiguedad;
    private Short bdavan;
    private Short bdavanm;
    private Long bdareaid;
    private String bdpaiscertificacion;
    private String bdbusinessunit;
    private String bdbanemail;
    private String bdidhai2;
}
