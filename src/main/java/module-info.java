module com.example.seemanthudu.kaka1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.code to javafx.fxml;
    exports com.example.code;
    exports com.exercise.java;
    opens com.exercise.java to javafx.fxml;
}