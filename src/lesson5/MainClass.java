package lesson5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class MainClass {
    public static void main(String[] args) {
        try {
            // B2: Nạp driver JDBC
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            // B3: Khai báo thông tin DB
            String dbUser = "sa", dbPass = "Aa@123456",
                dbUrl = "jdbc:sqlserver://localhost:1433;databaseName=su22b2_sof203"
                    + ";encrypt=true;trustServerCertificate=true;";
            
            Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
            System.out.println("Kết nối thành công");
            
            String ten = "Ao Nam TT2";
            String moTa = "...";
            int tt = 1;
            String query = 
                "INSERT INTO danh_muc(ten, mo_ta, trang_thai)"
                + " VALUES(?, ?, ?)";

            PreparedStatement s = conn.prepareStatement(query);
            s.setString(1, ten);
            s.setString(2, moTa);
            s.setInt(3, tt);
            s.execute();
        } catch (ClassNotFoundException e) {
            System.out.println("Kết nối thất bại");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Kết nối thất bại");
            e.printStackTrace();
        }
    }
}
