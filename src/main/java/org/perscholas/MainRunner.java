package org.perscholas;

import org.perscholas.models.Employees;
import org.perscholas.services.EmployeeService;

import java.util.ArrayList;

public class MainRunner {
    public static void main(String[] args) {
        EmployeeService e = new EmployeeService();
        var lEmp = e.getAllEmployees();

        for(Employees emp: lEmp){
            System.out.println(emp);
        }
    }
}
