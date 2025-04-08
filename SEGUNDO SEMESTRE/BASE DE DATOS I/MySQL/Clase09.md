# ***LENGUAJE SQL***
- ​Los orígenes del SQL nos llevan a la década de 1970, cuando en IBM se creó un software de base de datos, llamada  System R . Para gestionar los datos almacenados en System R se creó el lenguaje SQL.​
- Es un lenguaje que nos permite maniobrar, crear, modificar y gestionar bases de datos. En ese entonces no se las mensionaba como base de datos sino como base de almacenamiento.​
- Es un lenguaje de computación para trabajar con conjunto de datos y las relaciones entre ​ellas.

## ¿Qué nos permite?
- Cuando nosotros hablamos de SQL nos estamos refiriendo a algo relacional.​
- Al ser un modelo relacional, necesitamos entidades, tablas, columnas.​
- Necesitamos que todo tenga relación entre así, que la información tenga sentido en conjunto y no por separado.​

## ¿Para qué se utiliza?
- SQL se utiliza para describir conjuntos de datos que pueden ayudarle a responder preguntas.​
- Al usar ese lenguaje se  debe usar la sintaxis correcta.​

## SINTÁXIS
- Sintaxis en la forma en que se escribe un comando. Son las reglas que se deben de seguir para dar órdenes.​
- La sintáxis SQL se basa en la sintaxis del idioma inglés y usa mucho de los mismos elementos de Visual Basic.

## ELEMENTO SQL
### LÍNEA DE COMANDOS
- Todos los comandos necesarios en los sistemas de gestión se ejecutan a través de una interfaz específica​ llamada línea de comandos SQL (Command- line interface o CLI)​

### QUERYS (CONSULTA)
- Es una sentencia que va a dar  una orden o una indicación.​
- Va a recuperar los datos en base a un criterio dado, trayendo datos de una base de datos o de​ una tabla.​

​### CLÁUSULAS SQL
- Son también sentencias que nos da estados de cada uno de los componentes de la base de datos y de cómo están las querys, si se ejecutan o si no se ejecuta.​
- Todas las cláusulas van a realizar siempre una función.​
- Se ve error de sintaxis, entre otras cosas.
![image](https://github.com/user-attachments/assets/be4f6799-4271-4cd0-b7b7-e7b935928dd0)

### COMANDOS (SENTENCIAS)
- Se utilizan para el envío de consultas desde un programa cliente a un servidor donde se almacenan las bases de datos.​
- Un comando es una sentencia u orden, es una indicación que se le da a partir de una nomenclatura propia de SQL.

#### TIPOS DE COMANDOS:
- Existen dos tipos de comandos SQL:
  - DDL​ n(DATA DEFINITION LANGUAJE)​
    - Nos va a permitir y crear nuevas bases de datos, campos e índices.​
    - ​Un campo es un espacio en el que va a ir un dato, mientras que un índice es un espacio donde se va a agrupar un dato.​
    - ​Estos tres comandos que son:​
      - CREATE: sirve para eso, para crear nuevos campos, ya sean nuevas bases de datos, nuevas tablas, nuevos​ campos, nuevos índices ​
      - DROP: sirve para eliminar tablas e índices.​
      - ALTER: es utilizado para modificar las tablas agregando campos o cambiando la definición de los mismos.​
    
  - ​DML: (DATA MANIPULATION LANGUAJE)​
    - Su función es la manipulación de Datos, a través de él podemos insertar, eliminar y actualizar datos.​
    - También generar consultas para ordenar, filtrar y extraer datos de la base de datos.​
    - ​Comandos DML:
      - Insert: Es utilizado para cargar lotes de datos de una base de datos en una única operación.​ Un insert va a introducir nuevos datos o conjunto de éstos en una base de datos (tabla).​
      - Update: utilizado para modificar los valores de los campos y registros especificados.​
      - Delete: utilizado para eliminar registros de una tabla de base de datos . Se la eliminando uno a uno los registros.​

- ​EXPRESIONES:
  - Las expresiones pueden producir valores escalares o tablas que consisten en columnas y filas de datos.​
  - ​Una expresión me va a traer como resultado distintas funciones, pero entre ellas la creación de columnas y tablas.​

- PREDICADOS:
  - Los predicados especifican las condiciones que se utilizan para limitar los efectos de los comandos y las consultas o para cambiar el flujo del programa.​
  - Un predicado va a ser como un condicional que técnicamente le va a dar un alcance a un comando.

- Instancia: Nos permite conectarnos a una base de Datos

------

- ​En Workbenck vamos a crear una nueva instancia, haciendo click en el signo + , donde se nos abrirá una nueva ventana.
- Escribimos El Nombre De La Nueva Conección En Este Caso colocaremos  "Práctica" y hacer click en el boton Test connection, les pedirá la clave cuando abrieron workbench, introducen la clave y luego dan ok y listo.
- Se Ha Creado Una Nueva Conección.
- Ingresar A La Nueva Conección Creada.
- Creamos Una Base De Datos Desde La Ventana De Comandos con el comando​.

      Create database <Nombre de la base de Datos>;
- Hacemos Click en el icono del rayo y automáticamente nos aparecerá debajo la confirmación que la base de dato a sido creada.
- Si REFRESCAMOS LA INFORMACIÓN NOS APARECERÁ LA BASE DE DATOS CREADA.
- Creamos 2 Bases De Datos Más sin utilizar el ;(punto y coma) y seleccionado el 2ª icono de  rayo, refrescar para ver las bases creadas.
- Creamos Tabla Pero Desde La Ventana De Comandos utilizando el siguiente comando​:

      use base1;​
      create table usuario(id int(2) primary key, nombre varchar(50),apellido varchar(50), correo varchar(100));
- Ejecutamos con el ícono del rayo, refrescamos y veremos como aparece la tabla creada.
