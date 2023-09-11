package com.example.demo.service;

import com.example.demo.entity.Department;
import com.example.demo.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;

    public void saveDepartment(Department department){
         departmentRepository.save(department);
    }

    public List<Department> printAllDepartment() {
        return departmentRepository.findAll();
    }

    public String updateEmployee(Long id, Department department) {
        Optional<Department> fromDB = departmentRepository.findById(id);
        if(fromDB.isPresent()){
            Department dep = fromDB.get();
            dep.setCgpa(department.getCgpa());
            dep.setDepartmentName(department.getDepartmentName());
            dep.setStudentName(department.getStudentName());
            departmentRepository.save(dep);
        }
        return fromDB.isPresent() ? "Updated" : "ID not found";
    }

    public void deleteEmployee(Long id) {
        departmentRepository.deleteById(id);
    }

    public Department findById(Long id) {
        Optional<Department> dept =  departmentRepository.findById(id);
        return dept.orElse( null);
    }

    public Department findByStudentName(String studentName) {
        Optional<Department> dept =  departmentRepository.findByStudentNameIgnoreCase(studentName);
        return dept.orElse( null);
    }
}
