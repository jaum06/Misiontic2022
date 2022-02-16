/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project15_mvc.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author Andrés
 */
public class DBConnection {

    String url = "jdbc:mysql://localhost:3306";
    String user = "root";
    String pass = "1234";
    Connection connection;

    //Constructor
    public DBConnection(String schema) {
        Connection conn = getConnection();
        PreparedStatement ps;
        String sql = "CREATE DATABASE IF NOT EXISTS " + schema;
        try {
            ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            ps.close();
            url = url + "/" + schema;
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public DBConnection(String schema, String user, String pass) {
        this.user = user;
        this.pass = pass;
        Connection conn = getConnection();
        PreparedStatement ps;
        String sql = "CREATE DATABASE IF NOT EXISTS " + schema;
        try {
            ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            ps.close();
            url = url + "/" + schema;
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            System.out.println("Hubo un error de conexión..." + e);
        }
        return connection;
    }
}
