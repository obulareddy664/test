package com.file.uploader.exception;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class EmployeeNotFoundException extends Exception{

    private String message;


}
