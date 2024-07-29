package com.pivot.wewow.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "INDUSTRIA")
@Getter @Setter
public class Industra {
    @Id
    private Short indid;
    private String indnombre;
}
