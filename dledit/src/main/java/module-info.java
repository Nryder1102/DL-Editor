module com.dledit {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.dledit to javafx.fxml;
    exports com.dledit;
}
