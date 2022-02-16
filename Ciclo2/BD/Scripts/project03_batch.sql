CREATE DATABASE CONCESIONARIO;

USE CONCESIONARIO;

CREATE TABLE Vehiculos(
    placa VARCHAR(6) NOT NULL PRIMARY KEY,
    marca VARCHAR(50) NOT NULL,
    kilometraje INT NOT NULL,
    fecha_venta DATE,
    documento_vendedor INT NOT NULL
);

INSERT INTO vehiculos(placa, marca, kilometraje, fecha_venta, documento_vendedor) 
VALUES ('ABC123', 'MAZDA', 1000, '2020-12-05', '123456');

INSERT INTO vehiculos(placa, marca, kilometraje, fecha_venta, documento_vendedor) 
VALUES ('ABC124', 'MAZDA', 1000, '2020-12-05', '123456');

INSERT INTO vehiculos(placa, marca, kilometraje, fecha_venta, documento_vendedor) 
VALUES ('ABC321', 'RENAULT', 1000, '2020-12-05', '123456');

INSERT INTO vehiculos(placa, marca, kilometraje, fecha_venta, documento_vendedor) 
VALUES ('ABC483', 'SUZUKI', 1000, '2020-12-05', '123456');

INSERT INTO vehiculos(placa, marca, kilometraje, fecha_venta, documento_vendedor) 
VALUES ('AFC154', 'CHEVROLET', 1000, '2020-12-05', '123456');

