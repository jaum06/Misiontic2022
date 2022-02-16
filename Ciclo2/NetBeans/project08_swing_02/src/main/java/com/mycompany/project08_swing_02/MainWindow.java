/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project08_swing_02;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Andrés
 */
public class MainWindow extends JFrame implements ActionListener {

    //Atributos
    private JLabel description, result;
    private JTextField inputDollars;
    private JButton calculateButton;

    //Constructor
    MainWindow() {
        //setBounds(10, 10, 300, 300); //Tamaño y posición de la ventana
        //setSize(300,300);
        //setLocationRelativeTo(null); //Centra el frame en la pantalla
        Toolkit myScreen = Toolkit.getDefaultToolkit(); //Detecto la pantalla
        Dimension screenSize = myScreen.getScreenSize(); //Obtengo el tamaño de la pantalla completo
        int height = screenSize.height; //Obtengo el alto de la pantalla
        int width = screenSize.width; //Obtengo el ancho de la pantalla
        setSize(width / 2, height / 2);
        setLocationRelativeTo(null); //Centra el frame en la pantalla

        setTitle("Misión TIC"); //Título de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Al dar click en el botón de cerrar, termina la aplicación

        JPanel panel = new JPanel(); //Agregamos un panel el cual manejara todos los elementos que estarán en el frame
        this.getContentPane().add(panel); //El panel se encarga de organizar los elementos
        panel.setLayout(null); //Desactiva el layout y permite ubicar los elementos

        description = new JLabel("Convertir de dólares a pesos"); //Creo un label
        description.setBounds(10, 10, 200, 50);
        panel.add(description); //Agrego el label a la ventana

        inputDollars = new JTextField(); //Creo un textfield
        inputDollars.setBounds(10, 60, 100, 25);
        panel.add(inputDollars);

        result = new JLabel("0.0"); //Creo un label
        result.setBounds(30, 100, 100, 25);
        panel.add(result);

        calculateButton = new JButton("Calcular"); //Creo un botón
        calculateButton.setBounds(10, 150, 100, 25);
        calculateButton.addActionListener(this);
        panel.add(calculateButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String dollars = inputDollars.getText();
        double pesos = Double.parseDouble(dollars) * 3900;
        result.setText("" + pesos);
        //JOptionPane.showMessageDialog(this, "" + pesos);
    }
}
