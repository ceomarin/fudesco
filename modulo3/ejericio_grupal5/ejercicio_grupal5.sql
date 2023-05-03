-- DESARROLLO

-- Parte 1: Crear entorno de trabajo
-- - Crear una base de datos
CREATE DATABASE grupal5;
USE grupal5;
-- - Crear un usuario con todos los privilegios para trabajar con la base de datos recién creada.
create user ceomarin@'localhost' identified by 'ceomarin';
GRANT ALL PRIVILEGES ON ceodb.* TO 'ceomarin'@'localhost';
-- Parte 2: Crear dos tablas.
-- - La primera almacena a los usuarios de la aplicación (id_usuario, nombre, apellido,
-- contraseña, zona horaria (por defecto UTC-3), género y teléfono de contacto).
CREATE TABLE usuarios (
    id_usuario int NOT NULL,
    nombre varchar(255) NOT NULL,
    apellido varchar(255) NOT NULL,
    contrasenia varchar(255) NOT NULL,
    zona_horaria varchar(255) DEFAULT "UTC-3",
    genero char(1) NOT NULL,
    telefono varchar(255) NOT NULL,
    PRIMARY KEY (id_usuario)
);
-- - La segunda tabla almacena información relacionada a la fecha-hora de ingreso de los
-- usuarios a la plataforma (id_ingreso, id_usuario y la fecha-hora de ingreso (por defecto la
-- fecha-hora actual)).
CREATE TABLE ingresos (
    id_ingreso int NOT NULL,
    id_usuario int NOT NULL,
    fecha_hora DATETIME DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (id_ingreso),
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id_usuario)
    );

-- Parte 3: Modificación de la tabla
-- - Modifique el UTC por defecto.Desde UTC-3 a UTC-2.
ALTER TABLE usuarios ALTER COLUMN zona_horaria SET DEFAULT 'UTC-2';
-- Parte 4: Creación de registros.
-- - Para cada tabla crea 8 registros.
INSERT INTO usuarios VALUES (1, 'ceomarin', 'ceomarin', 'ceomarin', 'UTC-2', 'M', '+55555555555');
INSERT INTO usuarios VALUES (2, 'ceomarin', 'ceomarin', 'ceomarin', 'UTC-2', 'F', '+55555555556');
INSERT INTO usuarios VALUES (3, 'ceomarin', 'ceomarin', 'ceomarin', 'UTC-2', 'M', '+55555555557');
INSERT INTO usuarios VALUES (4, 'ceomarin', 'ceomarin', 'ceomarin', 'UTC-2', 'F', '+55555555558');
INSERT INTO usuarios VALUES (5, 'ceomarin', 'ceomarin', 'ceomarin', 'UTC-2', 'M', '+55555555559');
INSERT INTO usuarios VALUES (6, 'ceomarin', 'ceomarin', 'ceomarin', 'UTC-2', 'F', '+55555555560');
INSERT INTO usuarios VALUES (7, 'ceomarin', 'ceomarin', 'ceomarin', 'UTC-2', 'M', '+55555555561');
INSERT INTO usuarios VALUES (8, 'ceomarin', 'ceomarin', 'ceomarin', 'UTC-2', 'M', '+55555555562');

INSERT INTO usuarios (id_usuario,nombre,apellido,contrasenia,genero,telefono) VALUES (1, 'ceomarin', 'ceomarin', 'ceomarin','M', '+55555555555');
INSERT INTO usuarios (id_usuario,nombre,apellido,contrasenia,genero,telefono) VALUES (2, 'ceomarin', 'ceomarin', 'ceomarin','F', '+55555555556');
INSERT INTO usuarios (id_usuario,nombre,apellido,contrasenia,genero,telefono) VALUES (3, 'ceomarin', 'ceomarin', 'ceomarin','M', '+55555555557');
INSERT INTO usuarios (id_usuario,nombre,apellido,contrasenia,genero,telefono) VALUES (4, 'ceomarin', 'ceomarin', 'ceomarin','F', '+55555555558');
INSERT INTO usuarios (id_usuario,nombre,apellido,contrasenia,genero,telefono) VALUES (5, 'ceomarin', 'ceomarin', 'ceomarin','M', '+55555555559');
INSERT INTO usuarios (id_usuario,nombre,apellido,contrasenia,genero,telefono) VALUES (6, 'ceomarin', 'ceomarin', 'ceomarin','F', '+55555555560');
INSERT INTO usuarios (id_usuario,nombre,apellido,contrasenia,genero,telefono) VALUES (7, 'ceomarin', 'ceomarin', 'ceomarin','M', '+55555555561');
INSERT INTO usuarios (id_usuario,nombre,apellido,contrasenia,genero,telefono) VALUES (8, 'ceomarin', 'ceomarin', 'ceomarin','M', '+55555555562');


 INSERT INTO ingresos (id_ingreso,id_usuario) VALUES (1,8),(2,7),(3,6),(4,5),(5,4),(6,3),(7,2),(8,1);
-- Parte 5: Justifique cada tipo de dato utilizado. ¿Es el óptimo en cada caso?
/*
    En la tabla usuarios se utilizaron:
    id_usuario: clave primaria con tipo int para almacenar numeros desde 1 en adelante .
    nombre,apellido, contrasenia,zona_horaria y telefono se utilizo varchar(255) NOT NULL por la razon de flexibilizar el ingreso, en algunos casos no es el optimo pero dependera de la especificacion de requerimientos la determinacion de uno u otro,
    genero se utiliza char(1) para poder rellenar los campos con un caracter, en este caso el genero ya sea M o F

    En la tabla ingresos se utilizaron:
    id_ingreso,id_usuario se mantuvo int, para uso de claves primaria de la propia tabla y de la tabla de referencia usuarios
    fecha_hora DATETIME DEFAULT CURRENT_TIMESTAMP, se utilizo para especificar por defecto un formato fecha del momento de ingreso.

*/
-- Parte 6: Creen una nueva tabla llamada Contactos (id_contacto, id_usuario, numero de telefono,
-- correo electronico).
    CREATE TABLE contactos (
        id_contacto int NOT NULL,
        id_usuario int NOT NULL,
        numero_telefono varchar(255) NOT NULL,
        correo_electronico varchar(255) NOT NULL,
        PRIMARY KEY (id_contacto),
        FOREIGN KEY (id_usuario) REFERENCES usuarios(id_usuario)
    );
-- Parte 7: Modifique la columna teléfono de contacto, para crear un vínculo entre la tabla Usuarios y la
-- tabla Contactos.
alter table contactos drop primary key;
ALTER TABLE contactos ADD PRIMARY KEY(id_contacto,numero_telefono);

ALTER TABLE contacto
ADD CONSTRAINT pk_contactos PRIMARY KEY (id_contacto, numero_telefono);
ALTER TABLE contactos ADD CONSTRAINT fk_contactos_usuarios FOREIGN KEY (numero_telefono) REFERENCES usuarios(telefono);

-- El ejercicio debe ser subido a github y al Nodo Virtual.