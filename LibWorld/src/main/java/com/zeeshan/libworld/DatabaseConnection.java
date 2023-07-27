package com.zeeshan.libworld;

import javafx.scene.control.Alert;
import java.sql.*;

public class DatabaseConnection {
    public static Connection Data() {
        Connection JDBC = null;
        try {
            JDBC = DriverManager.getConnection("jdbc:mysql://localhost:3306/libworld", "root", "");
        }
        catch(SQLException e){
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setTitle("Connection error");
            a.setContentText("Please check your\ninternet connection.\n\nThank-you");
            a.setHeaderText(null);
            a.show();
            System.out.println("ERROR:\n" + e);
        }
        return JDBC;
    }
}
