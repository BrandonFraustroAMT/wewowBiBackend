package com.pivot.wewow.repositories;

import java.util.List;

import org.antlr.v4.runtime.atn.SemanticContext.AND;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pivot.wewow.entities.Tindl010;
import com.pivot.wewow.entities.Tindl010Id;

@Repository
public interface Tindl010Repository extends CrudRepository<Tindl010, Tindl010Id>{
    
    @Query("SELECT t FROM Tindl010 t WHERE t.tindl010Id.empid = :empid AND t.tindl010Id.lindidlin BETWEEN 2 AND 12")
    List<Tindl010> findByEmpidAndLindidlinBetween(@Param("empid") Long empid);

    /* @Query("SELECT t.tindl010Id.empid, t2.tlind010Id.dimid, t3.dimdesc, t.tindl010Id.lindidlin, " +
            "t2.linddescc, t.indclasifi, " +
            "t.tindl010Id.indxlidln, t.indxldesc " +
            "FROM Tindl010 t " +
            "JOIN Tlind010 t2 ON t.tindl010Id.empid = t2.tlind010Id.empid AND t.tindl010Id.lindidlin = t2.tlindidlin " +
            "JOIN Dimensiones t3 ON t2.dimid = t3.dimid " +
            "WHERE t.tindl010Id.lindidlin BETWEEN 2 AND 12 " +
            "AND t.tindl010Id.empid = :empid") */
    @Query("SELECT t.tindl010Id.empid, t2.dimid, t3.dimdesc, t.tindl010Id.lindidlin, " +
            "t2.linddescc, t.indclasifi, " +
            "t.tindl010Id.indxlidln, t.indxldesc " +
            "FROM Tindl010 t " +
            "JOIN Tlind010 t2 ON t.tindl010Id.empid = t2.tlind010Id.empid AND t.tindl010Id.lindidlin = t2.tlind010Id.lindidlin " +
            "JOIN Dimensiones t3 ON t2.dimid = t3.dimid " +
            "WHERE t.tindl010Id.lindidlin BETWEEN 2 AND 12 " +
            "AND t.tindl010Id.empid = :empid")
    List<Object[]> findDataDimensions(@Param("empid") Long empid);
}
