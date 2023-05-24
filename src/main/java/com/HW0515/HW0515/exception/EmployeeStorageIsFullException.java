package com.HW0515.HW0515.exception;

public class EmployeeStorageIsFullException extends RuntimeException{
    public EmployeeStorageIsFullException (String message){
        super(message);
    }
}
