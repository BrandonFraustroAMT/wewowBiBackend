package com.pivot.wewow.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TWWDIMCOMPSUBCOMP")
@Getter @Setter
public class Twwdimcompsubcomp {
    @EmbeddedId
    private CompetenciasId cId;
    private Short subcomid;
    private String subcomdesc;
}
