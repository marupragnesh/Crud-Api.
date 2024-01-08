package com.springboot1.springdepartment1.services;

import com.springboot1.springdepartment1.entity.Department;
import com.springboot1.springdepartment1.exception.DepartmentNotFoundException;
import com.springboot1.springdepartment1.repository.DepartmentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department savedDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> getdata(Department department) {
        return departmentRepository.findAll();
    }

    @Override
    public Department getdataone(long department_id) throws DepartmentNotFoundException {
      Optional <Department> department = departmentRepository.findById(department_id);
      if(!department.isPresent()){
        throw  new DepartmentNotFoundException("Department is not exist");
        }else{
            return department.get();
        }
    }

    @Override
    public String deletedataone(Long departmentId) {
         departmentRepository.deleteById(departmentId);
         return "Delete successfully ";
    }

    @Override
    public Department updatedata(Long departmentId,Department department) {
//        checking id in database.
        Department db = departmentRepository.findById(departmentId).get();

            db.setDepartment_name(department.getDepartment_name());
            db.setDepartment_address(department.getDepartment_address());
            db.setDepartment_code(department.getDepartment_code());
            departmentRepository.save(db);
            System.out.println(db);
            return db;
    }


}
