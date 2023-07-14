package com.ems.empMgmtSys.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ems.empMgmtSys.entities.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Long> {

}
