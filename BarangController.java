/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import database.DatabaseConnection;
import model.Barang;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lab Informatika
 */
public class BarangController {
    public List<Barang> getAllBarang() throws SQLException{
        List<Barang> list = new ArrayList<>();
        String sql = "SELECT * FROM barang ORDER BY id";
        Connection conn = DatabaseConnection.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        
        while(rs.next()){
            list.add(new Barang(
                rs.getInt("id"),
                rs.getString("nama"),
                rs.getString("kategori"),
                rs.getInt("stok"),
                rs.getString("status")));
        }
        return list;
    }
    
    public List<Barang> searchBarang(String keyword) throws SQLException{
        List<Barang> list = new ArrayList<>();
        String sql = "SELECT * FROM barang WHERE nama LIKE ? OR kategori LIKE ? OR stok LIKE ? OR status LIKE ? ORDER BY id";
        Connection conn = DatabaseConnection.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql);
        String kw = "%" + keyword + "%";
        stmt.setString(1, kw);
        stmt.setString(2, kw);
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            list.add(new Barang(
                rs.getInt("id"),
                rs.getString("nama"),
                rs.getString("kategori"),
                rs.getInt("stok"),
                rs.getString("status")));
        }
        return list;
    }
    
    public void tambahBarang(Barang b) throws SQLException{
        if(b.getNama().trim().isEmpty() || b.getKategori().trim().isEmpty() || b.getStatus().trim().isEmpty()){
            throw new IllegalArgumentException("Semua filed harus diisi!");
        }
        
        String sql = "INSERT INTO barang (nama, kategori, stok, status)";
        Connection conn = DatabaseConnection.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, b.getNama());
        stmt.setString(2, b.getKategori());
        stmt.setInt(3, b.getStok());
        stmt.setString(4, b.getStatus());
        stmt.executeUpdate();
    }
    
    public void editBarang(Barang b) throws SQLException{
        if(b.getNama().trim().isEmpty() || b.getKategori().trim().isEmpty() || b.getStatus().trim().isEmpty()){
            throw new IllegalArgumentException("Semua filed harus diisi!");
        }
        
        String sql = "UPDATE barang SET nama=?, kategori=?, stok=?, status=?";
        Connection conn = DatabaseConnection.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, b.getNama().trim());
        stmt.setString(2, b.getKategori().trim());
        stmt.setInt(3, b.getStok());
        stmt.setString(4, b.getStatus().trim());
        stmt.setInt(5, b.getId());
        stmt.executeUpdate();
    }
    
    public void hapusBarang(Barang b) throws SQLException{
        String sql = "DELETE FROM barang where id=?";
        Connection conn = DatabaseConnection.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, b.getId());
        stmt.executeUpdate();
    }
}
