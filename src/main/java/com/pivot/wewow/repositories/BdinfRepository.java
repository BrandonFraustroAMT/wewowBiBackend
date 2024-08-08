package com.pivot.wewow.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pivot.wewow.entities.Bdinf;
import com.pivot.wewow.entities.BdinfsId;

@Repository
public interface BdinfRepository extends CrudRepository<Bdinf,  BdinfsId>{
    @Query("SELECT b FROM Bdinf b WHERE b.bId.empid = :empid AND b.bId.bdinfid > 0")
    List<Bdinf> getAnswersByEmp(@Param("empid") Long empid);
}
