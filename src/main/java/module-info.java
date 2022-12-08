module com.example.housemanagamentsysytem {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    //requires de.jensd.fx.fontawesomefx.fontawesome;
    //requires mysql.connector.j;


    opens com.example.housemanagamentsysytem to javafx.fxml;
    exports com.example.housemanagamentsysytem;
    exports action;
    opens action to javafx.fxml;
    exports data;
    opens data to javafx.fxml;
}