package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
    static Connection connection;

    public static Connection connectDB(){
        System.out.println("Driver loaded!");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost/oshxona","root","");
        } catch (SQLException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }
        return connection;
    }

}
