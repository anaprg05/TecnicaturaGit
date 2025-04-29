-- Se recomienda escribir las palabras reservadas en mayúscula.
	-- SELECT * FROM columna/tabla 
SELECT * FROM persona

-- Limitar la cantidad de registros que se muestran en una consulta, hay que utilizar un filtro.
	-- Un registro:
		-- SELECT * FROM columna/tabla WHERE id = 1
	-- Varios registros (Solo agrega registros existentes): 
		-- SELECT * FROM columna/tabla WHERE id IN (1,2)
-- SELECT * FROM persona WHERE id_persona IN (1,2, 3)

-- Insertar datos a la tabla se utiliza:
	-- INSERT INTO tabla(valores) VALUES('datos')
-- INSERT INTO persona(nombre, apellido, email) VALUES('Lautaro', 'Rios', 'lrios@mail.com')

-- Modificar algún dato de la tabla:
	-- UPDATE tabla SET columna = 'dato' WHERE id
-- UPDATE persona SET nombre = 'Elton', apellido = 'Tito', email = 'eltontito@mail.com' WHERE id_persona = 3

-- Eliminar registros
	-- DELETE FROM tabla WHERE id
-- DELETE FROM persona WHERE id_persona = 3
