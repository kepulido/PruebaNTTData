DROP TABLE IF EXISTS cliente;


CREATE TABLE cliente (
  id int(11) AUTO_INCREMENT PRIMARY KEY,
primer_nombre varchar(50), 
segundo_nombre varchar(50), 
primer_apellido varchar(50), 
segundo_apellido varchar(50), 
telefono varchar(50), 
direccion varchar(50), 
ciudad varchar(50), 
tipo_doc varchar(50), 
numero_doc varchar(11)  
);

INSERT INTO cliente (id, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, telefono, direccion, ciudad, tipo_doc, numero_doc) VALUES
(1, 'Juan', 'Perez', 'NTT', 'Prueba', '123456789', 'Calle falsa 123', 'Bogota', 'C', 23445322);

