package sample;
import java.sql.Connection ;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ConnectionDB {
    private Connection conn;

    //connect to database
    public ConnectionDB(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=QLBV;"
                    + "username=sa;password=123456");
            System.out.println(" Connect Success");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

public static void main(String[] args) {
    new ConnectionDB();
}
}
