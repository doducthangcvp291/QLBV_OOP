package sample;

import java.sql.Connection;
import java.sql.DriverManager ;
import java.sql.SQLException ;


public class DBConnect {
    public static Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=QLBV","sa", "123456");
        return connection ;
    }
}
