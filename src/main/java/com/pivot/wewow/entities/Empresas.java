package com.pivot.wewow.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "EMPRESAS")
@Getter @Setter
public class Empresas {
    @Id
    private Long empid;
    private String empnombre;
    private String emprazons;
    private Long empcomp;
    private String empregp;
    private String empcompdate;
    private String emppaiscert;
    private String empenddate;
    private String empnomjp;
    private Short emppago;
    private Short emppubl;
    private String empenv;
    private String emplogo;
    private String empaboutus;
    private String emplinks;
    private Short paqid;
    private Short indid;
    private Long regionpaisid;
    private Short regionpaisregionid;
    private Long emppaiscertid;
    private String empmsjbnv;
    private char empreqtec;
}
