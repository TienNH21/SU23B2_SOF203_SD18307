/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson7_demo_select;

/**
 *
 * @author tiennh
 */
public class DanhMuc {
    private int id;
    private int trangThai;
    private String ten;
    private String moTa;

    public DanhMuc(int id, int trangThai, String ten, String moTa) {
        this.id = id;
        this.trangThai = trangThai;
        this.ten = ten;
        this.moTa = moTa;
    }

    public DanhMuc() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
    
    
}
