package org.spring.security.login.service.impl;

import org.spring.security.login.dto.EmployeeDTO;
import org.spring.security.login.model.Employee;
import org.spring.security.login.repository.EmployeeRepository;
import org.spring.security.login.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {


    @Autowired
    EmployeeRepository employeeRepository;
    @Override
    public Employee createEmployee(EmployeeDTO employeeDTO) {
        Employee employee = Employee.builder().first_name(employeeDTO.getFirstName())
                .last_name(employeeDTO.getLastName())
                .salary(employeeDTO.getSalary()).build();
        return employeeRepository.save(employee);
    }
}
