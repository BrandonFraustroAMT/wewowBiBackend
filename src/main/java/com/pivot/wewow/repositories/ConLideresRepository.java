package com.pivot.wewow.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pivot.wewow.dto.LideresDTO;
import com.pivot.wewow.entities.ConLideres;
import com.pivot.wewow.entities.ConLideresId;

@Repository
public interface ConLideresRepository extends CrudRepository<ConLideres, ConLideresId>{
    @Query("SELECT new com.pivot.wewow.dto.LideresDTO( " +
            "cl.conLideresId.empid, cl.conLideresId.modid, cl.conLideresId.subid, cl.conLideresId.encuid, " +
            "cl.conLideresId.encutipo, cl.conLideresId.encudate, cl.conLideresId.sectorid, cl.conLideresId.tamanoid, " +
            "cl.conLideresId.demographic_localidad1, cl.conLideresId.demographic_localidad2, cl.conLideresId.dimid, " +
            "cl.conLideresId.subdimid, cl.conLideresId.comid, cl.conLideresId.afirmid, cl.conLideresId.managerid, cl.manager_name, " +
            "cl.total_manager, cl.respuestas_empleados, cl.empleados_totales, " +
            "cl.area, cl.year_trabajando, cl.cargo_homologado, cl.educacion, " +
            "cl.generacion, cl.genero, cl.tipo_trabajo, cl.lider_resultvalue, " +
            "cl.lider_standardeviation, cl.lider_benchmark_overral, " +
            "t.dimdesc, t2.linddescc, t3.indclasifi, t3.indxldesc) " +
            "FROM ConLideres cl " +
            "JOIN Dimensiones t ON cl.conLideresId.dimid = t.dimid " +
            "LEFT JOIN Tlind010 t2 ON cl.conLideresId.subdimid = t2.tlind010Id.lindidlin " +
            "LEFT JOIN Tindl010 t3 ON cl.conLideresId.afirmid = t3.indxlsecn " +
            "WHERE cl.conLideresId.empid = :empid " +
            "AND t2.tlind010Id.empid = :empid " + 
            "AND t3.tindl010Id.empid = :empid " +
            "AND t3.tindl010Id.lindidlin BETWEEN 2 AND 12")
    List<LideresDTO> findDataLideres(@Param("empid") Long empid);
}
