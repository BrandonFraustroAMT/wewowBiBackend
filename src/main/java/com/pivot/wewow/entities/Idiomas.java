package com.pivot.wewow.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "IDIOMAS", schema = "dbo")
@Getter @Setter
public class Idiomas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDIOMID")
    private Short idiomid;
    @Column(name = "IDIOMNOM")
    private String idiomnom;
}
