/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Lab Informatika
 */
public class LoginView extends JFrame {
    public JTextField fUsername = new JTextField();
    public JPasswordField fPassword = new JPasswordField();
    public JButton btnLogin = new JButton("Login");

    public LoginView() {
        setTitle("Login Page");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel lblTitle = new JLabel("Selamat Datang!");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 22));
        lblTitle.setBounds(20, 20, 300, 30);
        add(lblTitle);

        JLabel lblSubtitle = new JLabel("Silakan masuk untuk melanjutkan.");
        lblSubtitle.setBounds(20, 50, 300, 20);
        add(lblSubtitle);

        JLabel lblUser = new JLabel("Username");
        lblUser.setBounds(20, 90, 100, 20);
        add(lblUser);

        fUsername.setBounds(20, 110, 340, 30);
        add(fUsername);

        JLabel lblPass = new JLabel("Password");
        lblPass.setBounds(20, 150, 100, 20);
        add(lblPass);

        fPassword.setBounds(20, 170, 340, 30);
        add(fPassword);

        btnLogin.setBounds(20, 215, 340, 30);
        add(btnLogin);
    }
}
