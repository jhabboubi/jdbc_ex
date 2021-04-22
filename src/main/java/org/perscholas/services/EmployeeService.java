package org.perscholas.services;

import lombok.extern.java.Log;
import org.perscholas.dao.AbstractDAO;
import org.perscholas.dao.IemployeeMethods;
import org.perscholas.dao.IemployeesDAO;
import org.perscholas.models.Employees;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
@Log
public class EmployeeService extends AbstractDAO implements IemployeeMethods {


    @Override
    public List<Employees> getAllEmployees() {

        // List
        List<Employees> employees = new ArrayList<Employees>(25);
        // connect
        this.connect();
        // prepared statement
        try {
            ps = conn.prepareStatement(IemployeesDAO.SQL.GET_ALL_EMPLOYEES.getQuery());

            // execution
            rs = ps.executeQuery();

            // result set

            while(rs.next()){

                employees.add(new Employees(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getString(8)

                ));

            }

        } catch (SQLException e ){
            log.severe("Something bad happened! ");
        }

        // dispose
        this.dispose();

        return employees;
    }

    @Override
    public Employees getEmployeeById(int id) {
        return null;
    }
}
