module org.example.simplemenu {
    requires javafx.controls;
    requires javafx.fxml;


    opens menu to javafx.fxml;
    exports menu;
    exports menu.controller;
    opens menu.controller to javafx.fxml;
}