package com.joshcode.RegistrationLogin.EmployeeController;

import com.joshcode.RegistrationLogin.EmployeeDto.EmployeeDTO;
import com.joshcode.RegistrationLogin.EmployeeService.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/employee")

public class EmployeeController {


    @Autowired
    private EmployeeService employeeService;

  @PostMapping(path = "/save")
  public String saveEmployee(@RequestBody EmployeeDTO employeeDTO)
  {
      String id = employeeService.addEmployee(employeeDTO);
      return id;
  }
}
