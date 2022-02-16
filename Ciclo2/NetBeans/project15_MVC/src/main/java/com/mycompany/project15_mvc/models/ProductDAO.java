/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project15_mvc.models;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Andrés
 */
public class ProductDAO {

    PreparedStatement ps;
    Connection conn;

    public ProductDAO() {
        DBConnection dBConnection = new DBConnection("db_mision_tic");
        conn = dBConnection.getConnection();
        init();
    }

    public void init() {
        String sql = "CREATE TABLE IF NOT EXISTS Products("
                + "CODE INT NOT NULL PRIMARY KEY, "
                + "NAME VARCHAR(50) NOT NULL, "
                + "DESCRIPTION TEXT NOT NULL, "
                + "PRICE DECIMAL(10,2) NOT NULL, "
                + "STOCK INT NOT NULL"
                + ");";
        try {
            ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }

    public int insert(Product product) {
        int stateQuery = 0;
        String sql = "INSERT INTO PRODUCTS (CODE, NAME, DESCRIPTION, PRICE, STOCK)"
                + "VALUES(?, ?, ?, ?, ?)"
                + "";
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, product.getCode());
            ps.setString(2, "" + product.getName());
            ps.setString(3, "" + product.getDescription());
            ps.setDouble(4, product.getPrice());
            ps.setInt(5, product.getStock());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e);
            stateQuery = 1;
        }
        return stateQuery;
    }

    public List listProducts() {
        List<Product> products = new ArrayList<>();
        String sql = "SELECT * FROM PRODUCTS;";
        ResultSet result;
        try {
            ps = conn.prepareStatement(sql);
            result = ps.executeQuery();
            while (result.next()) {
                Product product = new Product();
                product.setCode(result.getInt(1));
                product.setName(result.getString(2));
                product.setDescription(result.getString(3));
                product.setPrice(result.getDouble(4));
                product.setStock(result.getInt(5));
                products.add(product);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return products;
    }

}
