module com.example.chatui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.chatui to javafx.fxml;
    exports com.example.chatui;
}