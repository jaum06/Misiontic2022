/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project15_mvc.controllers;

import com.mycompany.project15_mvc.models.Product;
import com.mycompany.project15_mvc.models.ProductDAO;
import com.mycompany.project15_mvc.views.MainView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andrés
 */
public class ProductController implements ActionListener {

    MainView mainView;
    ProductDAO productDAO;
    DefaultTableModel tableModel = new DefaultTableModel();

    //Constructor
    public ProductController() {
        productDAO = new ProductDAO();
        initView();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == mainView.btnGuardar) {
            insertData();
            listData();
        } else if (e.getSource() == mainView.btnListar) {
            listData();
        }
    }

    private void initView() {
        mainView = new MainView();
        tableModel=(DefaultTableModel) mainView.tblProductos.getModel();
        mainView.setVisible(true);
        mainView.btnGuardar.addActionListener(this);
        mainView.btnListar.addActionListener(this);

    }

    private void insertData() {
        Product product = new Product();
        product.setCode(Integer.parseInt(mainView.txtCodigo.getText()));
        product.setName(mainView.txtNombre.getText());
        product.setDescription(mainView.jTextArea1.getText());
        product.setPrice(Double.parseDouble(mainView.txtPrecio.getText()));
        product.setStock(Integer.parseInt(mainView.txtExistencias.getText()));
        int stateQuery = productDAO.insert(product);
        if (stateQuery == 1) {
            JOptionPane.showMessageDialog(mainView, "Hubo un error al ingresar el producto");
        } else {
            cleanFields();
            JOptionPane.showMessageDialog(mainView, "Producto ingresado correctamente");
        }

    }

    private void listData() {
        cleanTable();
        mainView.tblProductos.setModel(tableModel);
        List<Product> products = productDAO.listProducts();
        Object[] objeto = new Object[6];
        for (int i = 0; i < products.size(); i++) {
            objeto[1] = products.get(i).getCode();
            System.out.println("Prueba " + products.get(i).getCode());
            objeto[2] = products.get(i).getName();
            objeto[3] = products.get(i).getDescription();
            objeto[4] = products.get(i).getPrice();
            objeto[5] = products.get(i).getStock();
            tableModel.addRow(objeto);
        }
    }

    private void cleanTable() {
        for (int i = 0; i < mainView.tblProductos.getRowCount(); i++) {
            tableModel.removeRow(i);
            i -= 1;
        }
    }

    private void cleanFields() {
        mainView.txtCodigo.setText("");
        mainView.txtNombre.setText("");
        mainView.jTextArea1.setText("");
        mainView.txtPrecio.setText("");
        mainView.txtExistencias.setText("");
    }

}
