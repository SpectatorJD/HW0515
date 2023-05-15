package com.HW0515.HW0515;

import com.HW0515.HW0515.exception.EmployeeAlreadyAddedException;
import com.HW0515.HW0515.exception.EmployeeNotFoundException;
import com.HW0515.HW0515.exception.EmployeeStorageIsFullException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class EmployeeService {
    private final Integer maxEmployee = 5;
    List<Employee> employees = List.of(
            new Employee("Иван", "Иванов"),
            new Employee("Кузнецов", "Владимир"),
            new Employee("Петрова", "Зинаида")
    );

    public String getEmployee(String fistName, String lastName)  {
        final Employee employee;
        if (maxEmployee >= employees.size()) {
            throw new EmployeeStorageIsFullException(" Нет места ");
        }
        employee = employees.get(maxEmployee);
        final String employ = employee.getFirstName() + " "
                + employee.getLastName();
        return employ;
    }
}
