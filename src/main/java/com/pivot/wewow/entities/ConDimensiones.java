package com.pivot.wewow.entities;

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
    private ConDemograficosId conDimensionesId;

    private Short statement_resultvalue;
    private Float statement_standarddeviation;
    private Float benchmark1;
    private Float benchmark2;
    private Float benchmark3;
    private Float benchmark4;
    private Float benchmark5;
    private Float benchmark6;
    private Float benchmark7;
    private Float benchmark8;
    private Float benchmark9;
    private Float benchmark10;
}
