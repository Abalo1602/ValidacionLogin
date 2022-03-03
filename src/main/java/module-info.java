module com.example.validacionlogin {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.validacionlogin to javafx.fxml;
    exports com.example.validacionlogin;
}