package sample;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource ;
import com.microsoft.sqlserver.jdbc.SQLServerException ;
import java.sql.Connection ;
import java.sql.SQLException ;

public class Testconnect {
  public static void main(String[] args){
      SQLServerDataSource ds = new SQLServerDataSource() ;
      ds.setUser("sa");
      ds.setPassword("123456");
      ds.setServerName("DESKTOP-5V1DFFI\\SQLEXPRESS");
      ds.setPortNumber(1433);
      ds.setDatabaseName("QLBV");
      try(Connection conn=ds.getConnection()){
          System.out.println(" Connection Success!");
          System.out.println(conn.getCatalog());
      } catch (SQLException throwables) {
          throwables.printStackTrace();
      }
  }
}
