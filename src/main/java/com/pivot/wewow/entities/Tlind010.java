package com.pivot.wewow.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TLIND010", schema = "dbo")
@Getter @Setter
public class Tlind010 {
    @EmbeddedId
    private Tlind010Id tlind010Id;
    private String linddescc;
    private String lindclasif;
    private Short lindorden;
    private char lindmanda;
    private char lindcprtck;
    private Short dimid;
    private Short comid;
    private Short subcomid;
}
