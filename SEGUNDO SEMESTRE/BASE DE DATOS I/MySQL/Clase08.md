# ***MySQL***
## ELEMENTO FUNDAMENTAL DE UNA BASE DE DATOS RELACIONAL
- El elemento fundamental del método racional de una base de datos, es una tabla relacional.

## TABLA
![image](https://github.com/user-attachments/assets/cba330d8-019b-4be2-a99e-01c7fc3c2927)
- Va a ser el espacio donde voy a organizar la información dentro de mi base de datos.
- Va a contener columnas y filas.

### TABLA RELACIONAL
![image](https://github.com/user-attachments/assets/847de1cb-160b-46f4-a0f7-9ebe0cabcd39)
- Es una representación extencional de una relación definida sobre un cierto dominio, decodificado o dividido en varias tablas.

### Entidad
- Una entidad es la representación de un objeto o concepto del mundo real que se describe en una base de datos. Son datos referentes.
- Ejemplos de nombres de entidades: Alumno, Empleado, Artículo, Noticia, etc.
- Las entidades se describen en la estructura de la base de datos empleando un modelo de datos.
- Cada entidad está constituida por uno o más atributos.

### Atributos
- Un atributo representa una propiedad de interés de una entidad.
- Los atributos se describen en la estructura de la base de datos empleando un modelo de datos.

#### Atributos representados de forma gráfica
![image](https://github.com/user-attachments/assets/5fa93ac9-6254-403c-bf5c-ca6cf2875566)

####Atributos representados en Tablas
![image](https://github.com/user-attachments/assets/bf8b12f7-0711-4803-b11b-d13667d73ce3)

### TUPLAS (filas):
- Se la define como una función que asocia unívocamente los nombre de los atributos de una relación con los valores de la misma.
- Es una fila de una tabla relacional.

#### Clave Primaria:
- Cada entidad tiene una clave primaria, campo llave o llave que identifica de forma única el conjunto de datos.
- La llave primaria es un dato, el cual es único y no se repite de lo que vendría siendo una tabla o una entidad.
- Me va permitir relacionar datos.

#### Clave Foránea:
- Es cuando en una entidad figura la clave primaria de otra entidad , esta se denomina clave foránea o clave ajena.
- Las entidades se relacionan entre si por medio de las claves foráneas

### Metadatos
- Son Datos sobre los datos  presentes en la Base de Datos.
- Hace referencia al tipo de Dato que vamos a almacenar (texto, número, fechas, etc.).
- También el nombre que va a recibir cada dato (nombre, apellido, fecha, edad, etc.).

### Operadores Lógicos
- Los operadores lógicos nos van a permitir definir sentencias así como también llamar datos.

#### Función que realiza el operador lógico:
- Una función del operador lógico se centra en uno y tres argumentos y devuelve un valor.
- Cuando una sentencia SQL contiene un operador, el Servido de bases de Datos, invoca automáticamente la función del operador asociado.

### OPERACIONES FUNDAMENTALES
#### SELECCIÓN
- Me va atraer todos los datos de la tabla en general.
- Se va a ocupar de seleccionar filas o tuplas.
- En la ventana de comandos nos arrojada los datos de la tabla ya sean generales.
    - SELECT * FROM (nombre de tabla).
    - SELECT *FROM (NOMBRE DE TABLA)WHERE NOMBRE="NOMBRE ALUMNO".
    - *FROM, nos arrojará todos los datos de la tabla.
- Si especificamos los datos, solo nos arrojará los solicitados.

#### PROYECCIÓN
- Esta operación nos ayuda a seleccionar datos específicos.
- Sólo traerá el campo específico que se le indique.
- Se va  a ocupar de seleccionar columnas.
    - SELECT nombre FROM estudiantes where Nombres ='nombre'.
    - SELECT nombre, edad FROM estudiantes where Nombres='nombre'.

### Como ingresamos datos en nuestras tablas:
- Para que me permita ingresar datos debemos ingresar nuevamente a la configuración de la tabla y seleccionar en la fila id estudiante en la opción AI (Auto Incrementable) y aplicamos.

