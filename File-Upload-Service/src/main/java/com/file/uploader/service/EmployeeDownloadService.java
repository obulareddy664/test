package com.file.uploader.service;

import com.file.uploader.entity.Employee;
import com.file.uploader.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeDownloadService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveDownload(Employee employee){
        Employee employee1=employeeRepository.save(employee);
        return employee1;

    }
}
