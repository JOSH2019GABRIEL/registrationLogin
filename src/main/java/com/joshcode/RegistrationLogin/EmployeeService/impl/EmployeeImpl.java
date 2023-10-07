package com.joshcode.RegistrationLogin.EmployeeService.impl;

import com.joshcode.RegistrationLogin.EmployeeDto.EmployeeDTO;
import com.joshcode.RegistrationLogin.EmployeeEntity.Employee;
import com.joshcode.RegistrationLogin.EmployeeRepository.EmployeeRepo;
import com.joshcode.RegistrationLogin.EmployeeService.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class EmployeeImpl implements EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public String addEmployee(EmployeeDTO employeeDTO) {
        Employee employee = new Employee(
                employeeDTO.getEmployeeId(),
                employeeDTO.getEmployeeName(),
                employeeDTO.getEmail(),
                this.passwordEncoder.encode(employeeDTO.getPassword())
        );

        employeeRepo.save(employee);
        return employee.getEmployeeName();
    }
}
