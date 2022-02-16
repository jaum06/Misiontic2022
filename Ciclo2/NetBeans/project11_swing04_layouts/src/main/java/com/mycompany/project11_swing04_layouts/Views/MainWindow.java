/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project11_swing04_layouts.Views;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Andrés
 */
public class MainWindow extends JFrame{
    
    //Constructor
    public MainWindow(){
        configWindow();
        initComponents();
    }
    
    //Configura el tamaño de la ventana
    private void configWindow(){
        Toolkit myScreen = Toolkit.getDefaultToolkit(); //Detecto la pantalla
        Dimension screenSize = myScreen.getScreenSize(); //Obtengo el tamaño de la pantalla completo
        int height = screenSize.height; //Obtengo el alto de la pantalla
        int width = screenSize.width; //Obtengo el ancho de la pantalla
        setSize(width / 2, height / 2);
        setLocationRelativeTo(null); //Centra el frame en la pantalla

        setTitle("Misión TIC"); //Título de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Al dar click en el botón de cerrar, termina la aplicación
    }
    
    //Instanciar los componentes que se crean en clases aparte
    private void initComponents()
    {
        LoginView login = new LoginView();
        this.getContentPane().add(login);
    }
    
}
