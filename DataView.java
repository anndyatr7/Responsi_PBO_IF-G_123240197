/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lab Informatika
 */
public class DataView extends JFrame {
    public JTextField fSearch = new JTextField();
    public JButton btnSearch = new JButton("Cari");
    public JTable table = new JTable();
    public DefaultTableModel tableModel;
    public JButton btnTambah, btnEdit, btnHapus, btnKembali;

    public DataView(String entity, String[] cols) {
        setTitle("Daftar " + entity);
        setSize(550, 550);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        fSearch.setBounds(20, 20, 400, 30);
        add(fSearch);

        btnSearch.setBounds(430, 20, 80, 30);
        add(btnSearch);

        tableModel = new DefaultTableModel(cols, 0);
        table.setModel(tableModel);
        JScrollPane scroll = new JScrollPane(table);
        scroll.setBounds(20, 60, 490, 250);
        add(scroll);

        btnTambah = new JButton("Tambah " + entity);
        btnTambah.setBounds(20, 330, 490, 30);
        add(btnTambah);

        btnEdit = new JButton("Edit " + entity);
        btnEdit.setBounds(20, 370, 490, 30);
        add(btnEdit);

        btnHapus = new JButton("Hapus " + entity);
        btnHapus.setBounds(20, 410, 490, 30);
        add(btnHapus);

        btnKembali = new JButton("Kembali");
        btnKembali.setBounds(20, 450, 490, 30);
        add(btnKembali);
    }
}
