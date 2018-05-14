package hrsystem.controllers;

import hrsystem.dao.EmployeeDAO;
import hrsystem.models.Employee;
import hrsystem.util.StageController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.EnumMap;
import java.util.ResourceBundle;

public class EmployeesView implements Initializable {
    private static String PreviousSceneFxmlPath = "/hrsystem/fxml/index.fxml";

    @FXML
    private Button returnMain;

    @FXML
    private Button searchButton;

    @FXML
    private TextField searchText;

    @FXML
    private TableView employeeTable;
    @FXML
    private TableColumn<Employee, Integer> empIdColumn;
    @FXML
    private TableColumn<Employee, String>  empFirstNameColumn;
    @FXML
    private TableColumn<Employee, String> empSurnameColumn;
    @FXML
    private TableColumn<Employee, Integer> empSsnColumn;

    @FXML
    public void handleButtonAction(ActionEvent event){
        Stage stage = (Stage) returnMain.getScene().getWindow();
        if (event.getSource() == returnMain) {
            System.out.println("returnMain clicked.");
            try {
                StageController.switchStage(stage, PreviousSceneFxmlPath);
            } catch (IOException e) {
                System.out.println("Fxml doesn't exists or " + e.toString());
            } catch (Exception e) {
                System.out.println("Wtf " + e.toString());
            }
        } else if (event.getSource() == searchButton) {
            System.out.println(String.format("Will Search Employee at %s",searchText.getText()));
        } else {
            System.out.println("What?");
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("EmployeesView is now loaded!");

        empIdColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        empFirstNameColumn.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        empSurnameColumn.setCellValueFactory(new PropertyValueFactory<>("surname"));
        empSsnColumn.setCellValueFactory(new PropertyValueFactory<>("ssn"));

        try {
            ObservableList<Employee> empData = EmployeeDAO.selectEmployees();
            employeeTable.setItems(getEmployeeList());
        } catch (SQLException e){
            System.out.println("Error occurred while getting employees information from DB.\n" + e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private ObservableList<Employee> getEmployeeList() {
        Employee user1 = new Employee();
        user1.setId(1);
        user1.setFirstName("Emre");
        user1.setSurname("Guler");
        user1.setSsn(123123);

        Employee user2 = new Employee();
        user2.setId(2);
        user2.setFirstName("Emre2");
        user2.setSurname("Guler2");
        user2.setSsn(45435);

        Employee user3 = new Employee();
        user3.setId(3);
        user3.setFirstName("Emre3");
        user3.setSurname("Guler3");
        user3.setSsn(789789);

        ObservableList<Employee> list = FXCollections.observableArrayList();
        list.addAll(user1, user2, user3);
        return list;
    }
}