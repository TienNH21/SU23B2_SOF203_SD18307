package lesson7_demo_select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        try {
            // B2: Nạp driver JDBC
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            // B3: Khai báo thông tin DB
            String dbUser = "sa", dbPass = "Aa@123456",
                dbUrl = "jdbc:sqlserver://localhost:1433;databaseName=su22b2_sof203";
            
            Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
            System.out.println("Kết nối thành công");
            
            String query = "SELECT * FROM danh_muc";
            try {
                PreparedStatement ps = conn.prepareStatement(query);
//                ResultSet rs = ps.executeQuery();
                ps.execute();
                ResultSet rs = ps.getResultSet();
                ArrayList<DanhMuc> ds = new ArrayList<>();
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String ten = rs.getString("ten");
                    String moTa = rs.getString("mo_ta");
                    int tt = rs.getInt("trang_thai");
                    DanhMuc danhMuc = new DanhMuc(id, tt, ten, moTa);
                    ds.add(danhMuc);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Kết nối thất bại");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Kết nối thất bại");
            e.printStackTrace();
        }
    }
}
