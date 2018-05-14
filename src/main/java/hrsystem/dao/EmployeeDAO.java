package hrsystem.dao;


import java.sql.ResultSet;
import java.sql.SQLException;

import com.github.underscore.$;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import hrsystem.models.Employee;
import hrsystem.util.DBUtil;

public class EmployeeDAO {

    public static ObservableList<Employee> selectEmployees () throws SQLException, ClassNotFoundException {
        ObservableList<Employee> empList = FXCollections.observableArrayList();

        String selectStmt = "SELECT * FROM employee";
        try {
            ResultSet rs = DBUtil.dbExecuteQuery(selectStmt);

            while (rs.next()) {
                Employee emp = new Employee();
                emp.setId(rs.getInt("id"));
                emp.setFirstName(rs.getString("fname"));
                emp.setSurname(rs.getString("surname"));
                emp.setSsn(rs.getInt("ssn"));
                System.out.println(emp.getFirstName() + emp.getSurname());
                empList.add(emp);
            }

            return empList;
        } catch (SQLException e) {
            System.out.println("SQL select operation has been failed: " + e);
            throw e;
        }
    }

    public static void insertEmployee (String firstName, String surname, Integer ssn) throws SQLException, ClassNotFoundException {
        String insertStmt = $.format("INSERT INTO employee (fname, surname, ssn) VALUES ('{}','{}', {});", firstName, surname, ssn);
        System.out.println(insertStmt);
        try {
            DBUtil.dbExecuteUpdate(insertStmt);
        } catch (SQLException e) {
            System.out.print("Error occurred while INSERT Operation: " + e);
            throw e;
        }
    }
}
