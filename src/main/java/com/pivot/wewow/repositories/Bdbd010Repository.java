package com.pivot.wewow.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pivot.wewow.entities.Bdbd010;
import com.pivot.wewow.entities.Bdbd010Id;

@Repository
public interface Bdbd010Repository extends CrudRepository<Bdbd010, Bdbd010Id>{
    @Query("SELECT b FROM Bdbd010 b WHERE b.bdbdo10id.empid = :empid")
    List<Bdbd010> getBdbd010ByEmp(@Param("empid") Long empid);
}
