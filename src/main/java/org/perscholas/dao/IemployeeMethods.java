package org.perscholas.dao;

import org.perscholas.models.Employees;

import java.util.List;

public interface IemployeeMethods {

    public List<Employees> getAllEmployees();

    public Employees getEmployeeById(int id);
}
