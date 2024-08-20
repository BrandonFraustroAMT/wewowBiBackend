package com.pivot.wewow.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "BDINF")
@Getter @Setter
public class Bdinf {
    @EmbeddedId
    private BdinfsId bId;

    private String bdinfnumjd;
    private String bdinfcont;
    private String bdinflocal;
    private String bdinfjer1;
    private String bdinfjer2;
    private String bdinfjer3;
    private String bdinfjer4;
    private String bdinfjer5;
    private String bdinfjer6;
    private String bdinfjer7;
    private String bdinfjer8;
    private String bdinfjer9;
    private String bdinfjer10;
    private String bdinfarea;
    private String bdinfcondcion;
    private String bdinfgenero;
    private String bdinfgradac;
    private String bdinfindxvc;
    private Long bdinfindxvcn;
    private String bdinfname;
    private String bdinfapellidos;
    private String bdinflocalb;
    private String bdinflocalc;
    private String bdinfgenracion;
    private String bdinfantiguedad;

}
