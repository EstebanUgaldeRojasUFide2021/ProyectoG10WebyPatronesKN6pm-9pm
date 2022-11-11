drop schema proyecto ;
drop user admin;

CREATE SCHEMA proyecto;
create user 'admin'@'%' identified by 'admin';
grant all privileges on proyecto.* to 'admin'@'%';
flush privileges;

CREATE TABLE proyecto.usuario(
id_usuario INT NOT NULL AUTO_INCREMENT,
nombre  VARCHAR(30) NOT NULL,
apellidos  VARCHAR(30) NOT NULL,
correo  VARCHAR(30) NOT NULL,
telefono  VARCHAR(30) NOT NULL,
fecha_de_nacimiento VARCHAR(30) NOT NULL,
pais  VARCHAR(30) NOT NULL,
PRIMARY KEY (`id_usuario`)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_eo_0900_ai_ci;

CREATE TABLE proyecto.temporada(
id_temporada INT NOT NULL AUTO_INCREMENT,
nombre_temporada VARCHAR(30) NOT NULL,
activo bool,
PRIMARY KEY (`id_temporada`)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_eo_0900_ai_ci;

CREATE TABLE proyecto.producto(
codigo_producto INT NOT NULL AUTO_INCREMENT,
/*id_temporada INT NOT NULL,*/
nombre_producto VARCHAR(30) NOT NULL,
descripcion VARCHAR(50) NOT NULL,
marca_producto VARCHAR(30) NOT NULL,
color_producto VARCHAR(30) NOT NULL,
cantidad_producto INT NOT NULL,
precio_producto INT NOT NULL,
activo bool,
PRIMARY KEY (`codigo_producto`)
/*foreign key fk_id_temporada (id_temporada) references temporada(id_temporada)*/
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_eo_0900_ai_ci;

INSERT INTO proyecto.usuario (id_usuario, nombre, apellidos, correo, telefono, fecha_de_nacimiento, pais) VALUES
(1, 'Juan', 'Castro Mora',    'jcastro@gmail.com',    '4556-8978', '5344675', 'Costa Rica'),
(2, 'Ana',  'Contreras Mora', 'acontreras@gmail.com', '5456-8789', '7544573', 'Francia'),
(3, 'Luis', 'Mena Loria',     'lmena@gmail.com', '7898-8936', '4564257', 'Brasil');

INSERT INTO proyecto.temporada (id_temporada,nombre_temporada,activo) VALUES
('1','Invierno', true),
('2','Verano', true),
('3','Otoño',true),
('4','Primavera', false);

INSERT INTO proyecto.producto (codigo_producto, /*id_temporada*/ nombre_producto, descripcion, marca_producto, color_producto, cantidad_producto, precio_producto,activo) VALUES
('1',/*'1'*/'Sueter','Sueter hecha de algodon','Gucci','Rojo',10, 1500, true),
('2',/*'1'*/'Pantaloneta','Pantaloneta veraniega hecha de poliester','Nike','Azul',20, 2500, true),
('3',/*'1'*/'Skull T-Shirt','T-shirt hecha de seda','Happy Hill','Negro',30, 3500, true),
('4',/*'1'*/'Capa', 'Capa impermeable','Tommy Hilfiger','Verde',30, 3500, false),
('5',/*'1'*/'Gorro','Gorro hecho con tejido crochet','Gap','Morado',40, 4500, true),
('6',/*'2'*/'T-Shirt','T-shirt hecha de algodon','Adidas','Cafe',50, 5500,  true),
('7',/*'3'*/'Bufanda','Bufanda hecha con tejido crochet','Old Navy','Naranjo',60, 6500,  true),
('8',/*'4'*/'Botas','Botas hechas de cuero', 'Guess','Amarillo',30, 7500,   false);

select * from proyecto.producto;
select* from proyecto.usuario;
select * from proyecto.temporada;