package com.pivot.wewow.entities;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter @Setter
public class BdinfId {
    private Long empid;
    private Short modid;
    private Short subid;

    private Long bdinfid;
    private String bdinfnumem;
    private String bdinffechi;
    private String bdinffechf;
    private String bdinfhri;
    private String bdinfhrf;
    private Short bdinfidindu;
    private Short bdinfdimid;
    private Short bdinfidenc;
    private Long bdinfidlinn;
    private Long bdinfidindn;
    private Short bdinfcompid;
    private Short bdinfsubcomp;
}
