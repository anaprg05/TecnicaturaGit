# ***Normalización***
- La normalización consiste en ir descomponiendo tu tabla en pequeñas tablas que hacen referencia a ciertas entidades que se empiezan a relacionar con otras, y  relacionándolas por medio de su id, así las referenciamos, y esto trae muchas ventajas.
  - Por ejemplo: podemos cambiar un dato en un solo lugar y esto se propagará a todos los lugares a donde este apunte.

- Ejemplo de una tabla sin normalizar

![image](https://github.com/user-attachments/assets/4156dbc9-9211-40c3-ac97-ef9b4cc9ef73)

- Veamos el siguiente ejemplo:
  - Tenemos una tabla con el nombre alumno, el nivel del curso, el nombre del curso y 2 materias.
    - ¿Cómo convertimos esta información en una tabla normalizada?

### Primera Forma Normal (1FN):
- Esta FN nos ayuda a eliminar los valores repetidos y no atómicos dentro de una base de datos ( no repetidos).
- Si aplicamos la Norma 1 FN: 
![image](https://github.com/user-attachments/assets/fac03e03-5037-47f6-a678-464a6f642f7b)

- Nuestra tabla va a tomar otra forma, ya que añadimos un id de alumnos y las materias solo las ubicaremos en una sola columna, de esta forma estamos reduciendo y atomizando los datos.
- Todos los campos que no se consideran clave deben depender de manera única por el o los campos que si son clave.
- Los campos deben ser tales que, si reordenamos los registros o reordenamos las columnas, cada dato no pierda el significado.

### Segunda Forma Normal (2FN)
- Esta FN nos ayuda a diferenciar los datos en diversas entidades.
- Se crea tablas independientes para conjuntos de valores que se apliquen a varios registros.
- Se Relaciona las tablas con una clave externa.
- Aplicando a nuestro ejemplo 2FN:
![image](https://github.com/user-attachments/assets/d5239cfe-5c1b-4e79-95c2-77c0d1cb8dbf)

- Lo que nos dice es que debe cumplirse 1FN y que cada campo de la tabla depende de una clave única.
- En este ejemplo separamos las tablas, por un lado, tendremos la tabla alumno y por otro la tabla materia.


#### Contenido y Relación
- En la tabla 1 nos quedamos con el alumno 1 y 2 y cada uno con su materia y curso.
- Ahora las materias las sacamos y las ubicamos en otra tabla.
- En la tabla materia creamos un Id-materia(1,2,3,4), un id-alumno(1,1,2,2) y cada materia que ellos cursan.
- Esto nos ayudará a identificar las diferentes entidades en este caso alumno y materia y poder tener un orden en mis datos.
![image](https://github.com/user-attachments/assets/b105cbfc-e835-4479-a047-b86f083f4d12)

### Tercera Forma Normal (3FN):
- Esta FN nos ayuda a separar conceptualmente las entidades que no son dependientes.
- Eliminar los campos que no dependan de la clave.
- Aplicando 3FN:
![image](https://github.com/user-attachments/assets/39f2bbef-74cb-47d2-9ad4-69e85dd2e4d2)

- Debemos cumplir con 1FN Y 2FN y los campos que no son claves no deben tener dependencia.
- En este ejemplo añadimos la tabla curso, entonces tenemos los datos mejor ordenados con la tabla alumno, curso y materia.

#### Contenido y Relación
![image](https://github.com/user-attachments/assets/753d90bd-2786-4d3b-9929-d7dd715046cf)

- Dividimos alumno y curso porque cada curso puede tener más alumnos, y porque además cada alumno es independiente de los cursos que no tome.
- Entonces creamos la tabla curso con su Id_curso, niv.el_curso y nombre_curso

### Cuarta Forma Normal (4FN):
- Esta FN nos trata de atomizar los datos multivaluados de manera que no tengamos datos repetidos.
- Aplicado al ejemplo anterior la tabla materia se independiza y se relaciona con el alumno a través de una tabla transitiva o pivote, de tal manera que si cambiamos el nombre de la materia solamente hay que cambiarla una vez y se propagara a cualquier referencia que haya de ella.
- Aplicando 4FN:
![image](https://github.com/user-attachments/assets/ae327fb5-e0ea-490f-98c7-b0179b69d6a8)

- Debe cumplir con 1FN,2FN,3FN y los campos multivaluados se identifican por una clave única.
- En este ejemplo separamos las materias, ya que en el ejemplo anterior estaban algunos datos aun repetidos como MySQL y Python y no podemos permitirlo en normalización .

#### Contenido y Relación
![image](https://github.com/user-attachments/assets/ee559e02-7610-4e9f-8968-d77142b0e0c0)

- De esta manera añadimos la tabla materia con su id_materia y materia, así volvemos a unir cada tabla.
- Esto me permite en un futuro añadir más materias y alumnos y que esté bien estructurada.
- Aunque parezca que la información se multiplicó, en realidad la descompusimos o normalizamos de manera que a un sistema le sea fácil de reconocer y mantener la consistencia de los datos.
- Algunos autores precisan una 5FN que hace referencia a que después de realizar esta normalización a través de uniones (JOIN) permita regresar a la data original de la cual partió.

## ¿Por qué se normalizan las bases de datos?
- Evitar la redundancia de los datos.
- Disminuir problemas de actualización de los datos en las tablas.
- Proteger la integridad de los datos.
- Facilitar el acceso e interpretación de los datos.
- Reducir el tiempo y complejidad de revisión de las bases de datos.
- Optimizar el espacio de almacenamiento.
- Prevenir borrados indeseados de datos.
