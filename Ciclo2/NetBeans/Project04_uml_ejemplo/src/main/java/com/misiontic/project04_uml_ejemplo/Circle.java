/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.misiontic.project04_uml_ejemplo;

/**
 *
 * @author Andrés
 */
public class Circle extends Polygon {

    private double area;
    private double perimeter;
    private double radius;
    private final double PI = 3.1416;

    Circle(double radius) {
        setRadius(radius);
        calculateArea();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return area;
    }

    private void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    private void calculateArea() {
        this.area = this.PI * this.radius * this.radius;
    }
}
