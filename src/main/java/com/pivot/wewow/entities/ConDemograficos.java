package com.pivot.wewow.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Concentrado_Demograficos")
@Getter @Setter
public class ConDemograficos {
    @EmbeddedId
    private ConDemograficosId conDemograficosId;

    private Short demographic_afirmid;
    private String demographic_afirmname;
    private Short demographic_respid;
    private String demographic_resp_name;
    private Long demographic_userrespondent;
    private Float demographic_resultvalue;
    private Float demographic_standarddeviation;
    private Float demographic_overral;
    private Float demographic_benchmark_overall;
}
