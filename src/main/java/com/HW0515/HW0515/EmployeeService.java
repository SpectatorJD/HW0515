package com.HW0515.HW0515;

import com.HW0515.HW0515.exception.EmployeeAlreadyAddedException;
import com.HW0515.HW0515.exception.EmployeeNotFoundException;
import com.HW0515.HW0515.exception.EmployeeStorageIsFullException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
@Service
public interface EmployeeService {
    Employee add (String firstName, String lastName);
    Employee remove (String firstName, String lastName);
    Employee find (String firstName, String lastName);

    Collection<Employee> findAll();
}
