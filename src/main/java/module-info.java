module com.example.seminariojavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.seminariojavafx to javafx.fxml;
    exports com.example.seminariojavafx;
}