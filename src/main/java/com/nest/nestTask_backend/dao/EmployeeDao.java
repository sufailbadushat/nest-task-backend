package com.nest.nestTask_backend.dao;

import com.nest.nestTask_backend.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao extends CrudRepository<Employee,Integer> {



}
