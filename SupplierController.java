/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import database.DatabaseConnection;
import model.Supplier;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lab Informatika
 */
public class SupplierController {
    public List<Supplier> getAllSupplier() throws SQLException{
        List<Supplier> list = new ArrayList<>();
        String sql = "SELECT * FROM supplier ORDER BY id";
        Connection conn = DatabaseConnection.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        
        while(rs.next()){
            list.add(new Supplier(
                rs.getInt("id"),
                rs.getString("nama"),
                rs.getString("kontak"),
                rs.getString("alamat")));
        }
        return list;
    }
    
    public List<Supplier> searchSupplier(String keyword) throws SQLException{
        List<Supplier> list = new ArrayList<>();
        String sql = "SELECT * FROM supplier WHERE nama LIKE ? OR kontak LIKE ? OR alamat LIKE ? ORDER BY id";
        Connection conn = DatabaseConnection.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql);
        String kw = "%" + keyword + "%";
        stmt.setString(1, kw);
        stmt.setString(2, kw);
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            list.add(new Supplier(
                rs.getInt("id"),
                rs.getString("nama"),
                rs.getString("kontak"),
            rs.getString("alamat")));
        }
        return list;
    }
    
    public void tambahSupplier(Supplier s) throws SQLException{
        if(s.getNama().trim().isEmpty() || s.getKontak().trim().isEmpty() || s.getAlamat().trim().isEmpty()){
            throw new IllegalArgumentException("Semua filed harus diisi!");
        }
        
        String sql = "INSERT INTO supplier (nama, kontak, alamat)";
        Connection conn = DatabaseConnection.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, s.getNama());
        stmt.setString(2, s.getKontak());
        stmt.setString(3, s.getAlamat());
        stmt.executeUpdate();
    }
    
    public void editSupplier(Supplier s) throws SQLException{
        if(s.getNama().trim().isEmpty() || s.getKontak().trim().isEmpty() || s.getAlamat().trim().isEmpty()){
            throw new IllegalArgumentException("Semua filed harus diisi!");
        }
        
        String sql = "UPDATE supplier SET nama=?, kontak=?, alamat=?";
        Connection conn = DatabaseConnection.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, s.getNama().trim());
        stmt.setString(2, s.getKontak().trim());
        stmt.setString(3, s.getAlamat().trim());
        stmt.setInt(4, s.getId());
        stmt.executeUpdate();
    }
    
    public void hapusSupplier(Supplier s) throws SQLException{
        String sql = "DELETE FROM supplier where id=?";
        Connection conn = DatabaseConnection.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, s.getId());
        stmt.executeUpdate();
    }
}
