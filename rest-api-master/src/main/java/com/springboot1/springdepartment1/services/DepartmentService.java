package com.springboot1.springdepartment1.services;

import com.springboot1.springdepartment1.entity.Department;
import com.springboot1.springdepartment1.exception.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {

    public Department savedDepartment(Department department);

    public List<Department> getdata(Department department);

    public Department getdataone(long department_id) throws DepartmentNotFoundException;

    public String deletedataone(Long departmentId);

     public Department updatedata(Long departmentId,Department department);
}
