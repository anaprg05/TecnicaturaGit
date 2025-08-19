-- CRUD: CREATE(crear), READ(leer), UPDATE(actualizar), DELETE(borrar)
-- SELECT *(todo, para ver una columna específica hay que anotar el nombre de dicha columna) FROM (basse de datos): Listar los estudiantes
SELECT * FROM estudiantes.estudiantes2024;

-- INSERT INTO: Insertar un estudiante
INSERT INTO estudiantes.estudiantes2024(nombre, apellido, telefono, email) VALUES ("Ana Paula", "Ríos Garín", "11 9825-0874", "apriosgarin@gmail.com");

-- UPDATE: Modificar/actualizar un estudiante
UPDATE estudiantes.estudiantes2024 SET nombre = "Ana", apellido = "Garín", email = "agarin@gmail.com" WHERE idestudiantes2024 = 1;

-- DELETE: Eliminar un estudiante
DELETE FROM estudiantes.estudiantes2024 WHERE idestudiantes2024 = 1;

-- Para modificar el ID y que inicie en 1, NUNCA se modifica desde la tabla
ALTER TABLE estudiantes.estudiantes2024 AUTO_INCREMENT = 1;
