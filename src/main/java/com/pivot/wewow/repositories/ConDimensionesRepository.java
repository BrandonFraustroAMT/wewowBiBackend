package com.pivot.wewow.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pivot.wewow.dto.DimensionesDTO;
import com.pivot.wewow.entities.ConDimensiones;
import com.pivot.wewow.entities.ConDimensionesId;

@Repository
public interface ConDimensionesRepository extends CrudRepository<ConDimensiones, ConDimensionesId>{
    @Query("SELECT new com.pivot.wewow.dto.DimensionesDTO(" +
            "cd.conDimensionesId.empid, cd.conDimensionesId.modid, cd.conDimensionesId.subid, cd.conDimensionesId.encuid, " +
            "cd.conDimensionesId.encutipo, cd.conDimensionesId.encudate, cd.conDimensionesId.sectorid, " +
            "cd.conDimensionesId.tamanoid, cd.conDimensionesId.localidad1, cd.conDimensionesId.localidad2, " + 
            "cd.conDimensionesId.dimid, cd.conDimensionesId.subdimid, cd.conDimensionesId.comid, cd.conDimensionesId.afirmid, "+
            "cd.statement_resultvalue, cd.statement_standarddeviation, cd.benchmark1, cd.benchmark2, "+
            "cd.benchmark3, cd.benchmark4, cd.benchmark5, cd.benchmark6, cd.benchmark7, cd.benchmark8, "+
            "cd.benchmark9, cd.benchmark10, "+
            "t3.dimdesc, t4.linddescc, t5.indclasifi, t5.indxldesc) " + 
            "FROM ConDimensiones cd " +
            "JOIN Dimensiones t3 ON cd.conDimensionesId.dimid = t3.dimid " +
            "LEFT JOIN Tlind010 t4 ON cd.conDimensionesId.subdimid = t4.tlind010Id.lindidlin " +
            "LEFT JOIN Tindl010 t5 ON cd.conDimensionesId.afirmid = t5.indxlsecn " +
            "WHERE cd.conDimensionesId.empid = :empid " +
            "AND t4.tlind010Id.empid = :empid " +
            "AND t5.tindl010Id.empid = :empid " +
            "AND t5.tindl010Id.lindidlin BETWEEN 2 AND 12")
    List<DimensionesDTO> findDataDimensions(@Param("empid") Long empid);

}
