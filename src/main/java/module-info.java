module com.example.painterappmodification {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.painterappmodification to javafx.fxml;
    exports com.example.painterappmodification;
}