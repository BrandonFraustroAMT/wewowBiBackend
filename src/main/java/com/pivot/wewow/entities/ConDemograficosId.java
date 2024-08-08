package com.pivot.wewow.entities;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter @Setter
public class ConDemograficosId {
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
}
