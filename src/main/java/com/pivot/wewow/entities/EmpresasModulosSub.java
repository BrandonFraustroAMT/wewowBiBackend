package com.pivot.wewow.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "EMPRESASModulosSUB", schema = "dbo")
@Getter @Setter
public class EmpresasModulosSub {
    @Id
    private Short subid;
    @ManyToOne
    @JoinColumn(name = "modid")
    private EmpresasModulos id;
    private String subnom;
}
