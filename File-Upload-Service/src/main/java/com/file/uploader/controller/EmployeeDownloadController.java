package com.file.uploader.controller;

import com.file.uploader.entity.Employee;
import com.file.uploader.service.EmployeeDownloadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class EmployeeDownloadController {
    @Autowired
    private EmployeeDownloadService employeeDownloadService;

    @PostMapping("/download")
    public ResponseEntity <Employee> saveDownload(@RequestBody Employee employee ){
        Employee employee1=employeeDownloadService.saveDownload(employee);
        return new ResponseEntity<Employee>(employee1, HttpStatus.OK);
    }















}
