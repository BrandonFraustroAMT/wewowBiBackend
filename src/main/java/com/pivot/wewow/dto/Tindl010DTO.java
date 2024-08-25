package com.pivot.wewow.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Tindl010DTO {
    private Long empid;
    private Short dimid;
    private String dimdesc;
    private Long lindidlin;
    private String linddescc;
    private String indclasifi;
    private Long indxlidln;
    private String indxldesc;

    public Tindl010DTO(Long empid, Short dimid, String dimdesc, Long lindidlin, String linddescc, 
        String indclasifi, Long indxlidln, String indxldesc) {
        this.empid = empid;
        this.dimid = dimid;
        this.dimdesc = dimdesc;
        this.lindidlin = lindidlin;
        this.linddescc = linddescc;
        this.indclasifi = indclasifi;
        this.indxlidln = indxlidln;
        this.indxldesc = indxldesc;
    }
}
