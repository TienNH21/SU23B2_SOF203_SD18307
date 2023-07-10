package lesson4_jdbc;

// B1: Import class
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DemoConnection {
    public static void main(String[] args) {
        try {
            // B2: Nạp driver JDBC
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            // B3: Khai báo thông tin DB
            String dbUser = "sa", dbPass = "Aa@123456",
                dbUrl = "jdbc:sqlserver://localhost:1433;databaseName=su22b2_sof203";
            
            Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
            System.out.println("Kết nối thành công");
        } catch (ClassNotFoundException e) {
            System.out.println("Kết nối thất bại");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Kết nối thất bại");
            e.printStackTrace();
        }
    }
}
