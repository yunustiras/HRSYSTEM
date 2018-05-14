package hrsystem;

import java.io.IOException;

import javafx.application.Application;
import javafx.stage.Stage;

import hrsystem.util.SQLiteJDBC;
import hrsystem.util.StageController;
import hrsystem.util.ConfirmBox;

public class App extends Application {
    public static String FxmlScenePath = "/hrsystem/fxml/login.fxml";

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setOnCloseRequest(e -> {
            e.consume();
            Boolean answer = ConfirmBox.display("Exit", "Are you want to exit?");
            if (answer == true) {
                primaryStage.close();
            }
        });
        try {
            StageController.switchStage(primaryStage, App.FxmlScenePath);
        }
        catch (IOException e) {
            System.out.println("Login.fxml doesn't exists.");
        }
    }
    public static void main(String[] args) {
        try {
            SQLiteJDBC.isHaveDriver();
        } catch (Exception e) {
            System.out.println("You dont have sqlite jdbc driver " + e.toString());
        }
        try {
            String create_roles_query = "CREATE TABLE ROLES (ID INT PRIMARY KEY NOT NULL, NAME TEXT NOT NULL)";
            SQLiteJDBC.execute("hrsystem.db", create_roles_query);

            String insert_roles = "INSERT INTO ROLES (ID,NAME) VALUES (1, 'Yazilimci'), (2, 'Analizci');";
            SQLiteJDBC.execute("hrsystem.db", insert_roles);

            String create_employee_query = "CREATE TABLE employee (ID INTEGER PRIMARY KEY AUTOINCREMENT, fname TEXT NOT NULL, surname TEXT NOT NULL, ssn INTEGER NOT NULL);";
            SQLiteJDBC.execute("hrsystem.db", create_employee_query);
        } catch (Exception e) {
            System.out.println("Cannot create table, " + e.toString());
        }
        launch(args);
    }
}

