package com.joshcode.RegistrationLogin.EmployeeRepository;

import com.joshcode.RegistrationLogin.EmployeeEntity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {


}
