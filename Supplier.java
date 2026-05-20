/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lab Informatika
 */
public class Supplier {
    private int id;
    private String nama;
    private String kontak;
    private String alamat;
    
    public Supplier(){};
    
    public Supplier(int id, String nama, String kontak, String alamat){
        this.id = id;
        this.nama = nama;
        this.kontak = kontak;
        this.alamat = alamat;
    }
    
    public Supplier(String nama, String kontak, String alamat){
        this.nama = nama;
        this.kontak = kontak;
        this.alamat = alamat;
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
    
    public String getKontak(){
        return kontak;
    }
    
    public void setKontak(String kontak){
        this.kontak = kontak;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
}
