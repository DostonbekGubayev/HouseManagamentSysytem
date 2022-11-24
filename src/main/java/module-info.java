module com.example.housemanagamentsysytem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.housemanagamentsysytem to javafx.fxml;
    exports com.example.housemanagamentsysytem;
    exports action;
    opens action to javafx.fxml;
}