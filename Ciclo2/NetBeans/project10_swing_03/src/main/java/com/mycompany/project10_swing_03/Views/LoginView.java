/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project10_swing_03.Views;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Andrés
 */
public class LoginView extends JPanel implements ActionListener {

    //Atributos
    Image loginImage;
    JTextField userName;
    JPasswordField password;
    JButton loginButton, clearButton, exitButton;

    //Constructor
    public LoginView() {
        configPanel();
        initComponents();
    }

    private void configPanel() {
        setLayout(null);
    }

    private void initComponents() {
        header();
        inputData();
        footer();
    }

    private void header() {
        JLabel description = new JLabel("Iniciar sesión");
        description.setBounds(100, 10, 200, 25);
        this.add(description);
    }

    private void inputData() {
        JLabel labelUserName = new JLabel("User Name");
        labelUserName.setBounds(30, 220, 80, 25);
        this.add(labelUserName);

        userName = new JTextField();
        userName.setBounds(110, 220, 100, 25);
        this.add(userName);

        JLabel lablePassword = new JLabel("Password");
        lablePassword.setBounds(30, 250, 80, 25);
        this.add(lablePassword);

        password = new JPasswordField();
        password.setBounds(110, 250, 100, 25);
        this.add(password);
    }

    private void footer() {
        loginButton = new JButton("Login");
        loginButton.setBounds(100, 300, 80, 30);
        loginButton.addActionListener(this);
        this.add(loginButton);

        clearButton = new JButton("Clear");
        clearButton.setBounds(100, 340, 80, 30);
        clearButton.addActionListener(this);
        this.add(clearButton);

        exitButton = new JButton("Salir");
        exitButton.setBounds(100, 380, 80, 30);
        exitButton.addActionListener(this);
        this.add(exitButton);
    }

    //Metodo que agrega la imagen, este metodo no hay que declararlo en el constructor ya que se ejecuta solo
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        File imageLogin = new File("src/assets/logo-android.png");
        //Se debe hacer manejo de excepciones al crear una imagen
        try {
            Image image = ImageIO.read(imageLogin);
            this.loginImage = image.getScaledInstance(150, 150, Image.SCALE_DEFAULT);
            g.drawImage(loginImage, 100, 50, this);
        } catch (IOException e) {
            System.out.println("Error de lectura");
            JOptionPane.showMessageDialog(this, "Error en lectura de imagen");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object clickedButton = e.getSource(); //Retorna nombre de la variable del botón que se presionó
        if (clickedButton == loginButton) {
            String pass = new String(this.password.getPassword());
            JOptionPane.showMessageDialog(this, pass);
        } else if (clickedButton == clearButton) {
            userName.setText("");
            password.setText("");
        }
        else if (clickedButton == exitButton){
            System.exit(0);
        }
    }
}
