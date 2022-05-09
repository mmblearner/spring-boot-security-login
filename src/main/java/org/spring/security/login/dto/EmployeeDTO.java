package org.spring.security.login.dto;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class EmployeeDTO {
    private String firstName;
    private String lastName;
    private long salary;
}
