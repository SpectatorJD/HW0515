package com.HW0515.HW0515.exception;

public class EmployeeAlreadyAddedException extends RuntimeException {
    public EmployeeAlreadyAddedException (String message){
        super(message);
    }
}
