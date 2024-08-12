package com.pivot.wewow.entities;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TINDL010")
@Getter @Setter
public class Tindl010 {
    @EmbeddedId
    private Tindl010Id tindl010Id;

    private Long indxlsecn;
    private String indxldesc;
    private String indxltipc;
    private String indxciclc;
    private String indxfilac;
    private String indxcolc;
    private String indalerta;
    private Long indciaproq;
    private String indmandat;
    private String indclasifi;
    private BigDecimal indvalpon;
    private String inddivpon;
    private String indtxtadi;
    private String indxcprtck;
    private BigDecimal resultvalue;
    private BigDecimal benchmark;
}
