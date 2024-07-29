package com.pivot.wewow.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "PAQUETES")
@Getter @Setter
public class Paquetes {
    @Id
    private Short paqid;
    private String paqnomc;
    private String paqdesc;
    private Long paqprec;
    private Short paqlen;
}
