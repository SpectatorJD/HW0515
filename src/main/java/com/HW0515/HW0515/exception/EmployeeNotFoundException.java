package com.HW0515.HW0515.exception;

public class EmployeeNotFoundException extends  RuntimeException{
    public EmployeeNotFoundException(String message) {
        super(message);
    }
}
