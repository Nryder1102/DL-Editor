module com.dleditor {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;

    opens com.dleditor to javafx.fxml,com.google.gson,javafx.controls;
    opens com.dleditor.classes to com.google.gson;
    exports com.dleditor;
}
