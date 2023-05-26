package com.springboot1.springdepartment1.controller;

import com.springboot1.springdepartment1.entity.Department;
import com.springboot1.springdepartment1.exception.DepartmentNotFoundException;
import com.springboot1.springdepartment1.services.DepartmentService;
import jakarta.validation.Valid;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
public class DepartmentController {

//    private final Logger logger = (Logger) LoggerFactory.getLogger(DepartmentController.class);

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/departments")
    public String departments()
    {
        return "Hello pragnesh";
    }

    @PostMapping("/adddepartment")
    public Department savedDepartment(@RequestBody @Valid Department department)
    {
        return this.departmentService.savedDepartment(department);
    }



    @GetMapping("/get-data")
    public List<Department> getdata(Department department)
    {
        return this.departmentService.getdata(department);
    }

    @GetMapping("/get-data/{id}")
    public Department getdataone(@PathVariable("id") Long department_id) throws DepartmentNotFoundException {
        return this.departmentService.getdataone(department_id);
    }

    @DeleteMapping("/delete-data/{id}")
    public String deletedataone(@PathVariable("id") Long department_id)
    {
        return this.departmentService.deletedataone(department_id);
    }

    @PutMapping("/update-data/{id}")
    public Department updatedata(@PathVariable("id") Long department_id,@RequestBody Department department)
    {
        return this.departmentService.updatedata(department_id,department);
    }
}
