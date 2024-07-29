package com.pivot.wewow.entities;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter @Setter
public class CompetenciasId {
    private Short dimid;
    private Short comid;
}
