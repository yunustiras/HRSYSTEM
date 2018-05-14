package hrsystem.controllers;

import com.github.underscore.$;
import hrsystem.dao.EmployeeDAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import hrsystem.util.StageController;

public class AddEmployee implements Initializable {
    public static String PreviousSceneFxmlPath = "/hrsystem/fxml/employees.fxml";
    Stage stage;

    @FXML
    private TextField firstName, lastName, ssn, iban, salaryAmount;

    @FXML
    private ChoiceBox<String> employeeType, accountingSoftwareType, socialSecurityType;

    @FXML
    private DatePicker jobStartDate;

    @FXML
    public void handleButtonAction(ActionEvent event) throws SQLException, ClassNotFoundException{
        stage = (Stage) firstName.getScene().getWindow();
        System.out.println(
                $.format("{},{},{},{},{},{},{},{},{}",
                        firstName.getText(),
                        lastName.getText(),
                        employeeType.getValue(),
                        jobStartDate.getValue(),
                        ssn.getText(),
                        accountingSoftwareType.getValue(),
                        iban.getText(),
                        socialSecurityType.getValue(),
                        salaryAmount.getText()
                )
        );
        try {
            EmployeeDAO.insertEmployee(firstName.getText(),lastName.getText(), Integer.parseInt(ssn.getText()));
            StageController.switchStage(stage, PreviousSceneFxmlPath);
        } catch (IOException e) {
            System.out.println("Fxml doesn't exists or " + e.toString());
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("AddEmployee is now loaded!");
    }
}