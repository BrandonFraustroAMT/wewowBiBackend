package com.pivot.wewow.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "EMPRESASModulos")
@Getter @Setter
public class EmpresasModulos {
    @Id
    private Short modid;
    private Short empid;
    private String modnom;
    private String moddescre;
}
