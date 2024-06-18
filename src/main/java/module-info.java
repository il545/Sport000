module com.ptcm.sport000 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ptcm.sport000 to javafx.fxml;
    exports com.ptcm.sport000;
}