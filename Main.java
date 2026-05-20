/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import view.LoginView;
import javax.swing.SwingUtilities;

/**
 *
 * @author Lab Informatika
 */
public class Main {
    public static void main(String[]args){
        SwingUtilities.invokeLater(() -> new LoginView());
    }
}
