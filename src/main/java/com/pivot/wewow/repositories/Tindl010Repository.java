package com.pivot.wewow.repositories;

import java.util.List;

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
}
