package demo_crud;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtil {
    private static Connection conn;
    
    public static Connection getConnection()
    {
        try {
            if (conn == null || conn.isClosed()) {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String dbUser = "sa", dbPass = "Aa@123456",
                    dbUrl = "jdbc:sqlserver://localhost:1433;databaseName=su22b2_sof203;encrypt=true;trustServerCertificate=true;";

                JdbcUtil.conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
                System.out.println("Kết nối thành công");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return conn;
    }
}
