package org.perscholas.dao;

public interface IemployeesDAO {

    enum SQL {
        GET_ALL_EMPLOYEES("SELECT * FROM employees"),
        GET_EMPLOYEE_BY_ID("SELECT * FROM employees WHERE employeeNumber = ?");

        private final String query;

        private SQL(String s) {
            this.query = s;
        }

        public String getQuery() {
            return query;
        }

    }
}
