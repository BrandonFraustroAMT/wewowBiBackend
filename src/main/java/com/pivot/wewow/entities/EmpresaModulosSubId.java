package com.pivot.wewow.entities;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter @Setter
public class EmpresaModulosSubId {
    private Long empid;
    private Short modid;
}
