package com.nest.nestTask_backend.controller;


import com.nest.nestTask_backend.dao.EmployeeDao;
import com.nest.nestTask_backend.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addEmployee", produces = "application/json",consumes = "application/json")
    public Map<String,String> AddEmployee(@RequestBody Employee employee){

        System.out.println(employee);
        employeeDao.save(employee);
        HashMap<String,String> hashMap=new HashMap<>();
        hashMap.put("status","success");
        return hashMap;
    }

}
