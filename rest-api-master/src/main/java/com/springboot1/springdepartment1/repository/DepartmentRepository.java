package com.springboot1.springdepartment1.repository;

import com.springboot1.springdepartment1.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    // rest api - validation - lombook - exception - change database

// here you can define your own method which does not provide jparepo.
//        Query()<- this jpa query write and if provide native parameter you can write sql query
//    public Department findByDepartmentName(String departmentname); // call from controller get-data-one
//    public Department findByDepartmentNameIgnorecase(String departmentname);
// this is impliment interface in  departmentserviceimpl.
// you must follow naming convension .
// 1:26:00 daily code buffer spring boot one video

//    starter-validation for validation dependancy

}
