package org.spring.security.login.service;

import org.spring.security.login.dto.EmployeeDTO;
import org.spring.security.login.model.Employee;

public interface EmployeeService {
    public Employee createEmployee(EmployeeDTO employeeDTO);
}
