package demo_crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DanhMucDAO {
    private Connection conn;
    
    public DanhMucDAO() 
    {
        this.conn = JdbcUtil.getConnection();
    }
    
    public ArrayList<DanhMuc> findAll()
    {
        ArrayList<DanhMuc> dsDanhMuc = new ArrayList<>();
        try {
            Connection conn = JdbcUtil.getConnection();
            String query = "SELECT * FROM danh_muc";
            PreparedStatement ps = conn.prepareStatement(query);
//                ResultSet rs = ps.executeQuery();
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                int id = rs.getInt("id");
                String ten = rs.getString("ten");
                String moTa = rs.getString("mo_ta");
                int tt = rs.getInt("trang_thai");
                DanhMuc danhMuc = new DanhMuc(id, tt, ten, moTa);
                dsDanhMuc.add(danhMuc);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return dsDanhMuc;
    }
}
