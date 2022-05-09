package org.spring.security.login.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.spring.security.login.dto.EmployeeDTO;
import org.spring.security.login.model.Employee;
import org.spring.security.login.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

   @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Request Success"),
            @ApiResponse(responseCode = "400", description = "Invalid information Provided"),
            @ApiResponse(responseCode = "404", description = "Not found")})
    @ResponseBody
    @PostMapping(path = "/create")
    @Operation(description = "Creating Employee",operationId = "create_employee")
    public ResponseEntity<Employee> createEmployee(@RequestBody EmployeeDTO employeeDTO){
        Employee employee = employeeService.createEmployee(employeeDTO);
        return new ResponseEntity<>(employee, HttpStatus.CREATED);
    }
}
