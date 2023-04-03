module com.dlsearch {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.dlsearch to javafx.fxml;
    exports com.dlsearch;
}
