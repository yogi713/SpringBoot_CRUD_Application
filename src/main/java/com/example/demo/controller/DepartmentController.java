package com.example.demo.controller;

import com.example.demo.entity.Department;
import com.example.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    //    PRINT DEPARTMENT
    @GetMapping("/print")
    public List<Department> printAllDepartment(){
        return departmentService.printAllDepartment();
    }

    //    SAVE DEPARTMENT
    @PostMapping("/save")
    public String saveDepartment(@RequestBody Department department){
        departmentService.saveDepartment(department);
        return "Saved";
    }
//       UPDATE DEPARTMENT
    @PutMapping("/update/{id}")
    public String updateEmployee(@PathVariable Long id, @RequestBody Department department){
        return departmentService.updateEmployee(id, department);
    }

    //    DELETE DEPARTMENT
    @DeleteMapping("/delete/{id}")
    public void deleteEmployee(@PathVariable Long id){
         departmentService.deleteEmployee(id);
    }

    //    FIND BY ID
    @GetMapping("/print/{id}")
    public Department findById(@PathVariable Long id){
         return departmentService.findById(id);
    }

    //    FIND BY NAME
    @GetMapping("/print/name/{studentName}")
    public Department findByStudentName(@PathVariable String studentName){
        return departmentService.findByStudentName(studentName);
    }
}
