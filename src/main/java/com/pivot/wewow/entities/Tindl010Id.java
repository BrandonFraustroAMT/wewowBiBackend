package com.pivot.wewow.entities;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter @Setter
public class Tindl010Id {
    private Long empid;
    private Short modid;
    private Short subid;
    private Long lindidlin;
    private Long indxlidln;
}
