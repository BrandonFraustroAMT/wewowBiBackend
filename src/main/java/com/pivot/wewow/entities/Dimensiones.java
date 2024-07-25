package com.pivot.wewow.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "TWWDIM", schema = "dbo")
@Getter @Setter
@ToString
public class Dimensiones {
    @Id
    private Short dimid;
    private String dimnomc;
    private String dimdesc;
}
