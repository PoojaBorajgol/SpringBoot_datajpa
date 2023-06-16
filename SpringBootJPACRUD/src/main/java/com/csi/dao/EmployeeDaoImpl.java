package com.csi.dao;

import com.csi.model.Employee;
import com.csi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeDaoImpl {
    @Autowired
    EmployeeRepository employeeRepositoryimpl;


    public Employee saveData(Employee employee){
        return employeeRepositoryimpl.save(employee);
    }

    public List<Employee> getAllData(){
        return employeeRepositoryimpl.findAll();

    }

    public Employee updateData(Employee employee){
        return employeeRepositoryimpl.save(employee);
    }
    public void deleteData(int empId){
        employeeRepositoryimpl.deleteById(empId);
    }
}
