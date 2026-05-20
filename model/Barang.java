/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lab Informatika
 */
public class Barang {
    private int id;
    private String nama;
    private String kategori;
    private int stok;
    private String status;
    
    public Barang(){};
    
    public Barang(int id, String nama, String kategori, int stok, String Status){
        this.id = id;
        this.nama = nama;
        this.kategori = kategori;
        this.stok = stok;
        this.status = status;
    }
    
    public Barang(String nama, String kategori, int stok, String status){
        this.nama = nama;
        this.kategori = kategori;
        this.stok = stok;
        this.status = status;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getKategori(){
        return kategori;
    }
    
    public void setKategori(String Kategori){
        this.kategori = kategori;
    }
    
    public int getStok(){
        return stok;
    }
    
    public void setStok(int stok){
        this.stok = stok;
    }
    
    public String getStatus(){
        return status;
    }
    
    public void setStatus(String status){
        this.status = status;
    }
}
